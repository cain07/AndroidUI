package com.cain.cpage.core;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cain.cpage.R;
import com.cain.cpage.base.CPageActivity;
import com.cain.cpage.base.CPageFragment;
import com.cain.cpage.logger.PageLog;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
  * @Description:    跳转页面管理
  * @Author:         cain
  * @CreateDate:     2020/5/17 下午10:16
  * @Version:        1.0
 */
public class CorePageManager {

    /**
     * 页面信息
     */
    private static final String PAGE_INFO_JSON = "corepage.json";

    private volatile static CorePageManager sInstance = null;
    /**
     * 保存page的map
     */
    private Map<String, CorePage> mPageMap = new HashMap<>();

    /**
     * 构造函数私有化
     */
    private CorePageManager() {

    }

    /**
     * 获得单例
     *
     * @return PageManager 单例
     */
    public static CorePageManager getInstance() {
        if (sInstance == null) {
            synchronized (CorePageManager.class) {
                if (sInstance == null) {
                    sInstance = new CorePageManager();
                }
            }
        }
        return sInstance;
    }

    /**
     * 初始化配置
     *
     * @param context 上下文
     */
    public void init(Context context) {
        try {
            String content = readFileFromAssets(context, PAGE_INFO_JSON);
            readConfig(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init(Context context, String pageJson) {
        this.init(context);
        if (!TextUtils.isEmpty(pageJson)) {
            readConfig(pageJson);
        }
    }

    /**
     * 从配置文件中读取page
     */

    public void readConfig(String content) {
        if (TextUtils.isEmpty(content)) {
            return;
        }

        PageLog.d("readConfig from json");
        JSONArray jsonArray = JSON.parseArray(content);
        Iterator<Object> iterator = jsonArray.iterator();
        JSONObject jsonPage;
        String pageName;
        String pageClazz;
        String pageParams;
        while (iterator.hasNext()) {
            jsonPage = (JSONObject) iterator.next();
            pageName = jsonPage.getString(CorePage.KEY_PAGE_NAME);
            pageClazz = jsonPage.getString(CorePage.KEY_PAGE_CLAZZ);
            pageParams = jsonPage.getString(CorePage.KEY_PAGE_PARAMS);
            if (TextUtils.isEmpty(pageName) || TextUtils.isEmpty(pageClazz)) {
                PageLog.d("page Name is null or pageClass is null");
                return;
            }
            mPageMap.put(pageName, new CorePage(pageName, pageClazz, pageParams));
            PageLog.d("put a page:" + pageName);
        }
        PageLog.d("finished read pages,page size：" + mPageMap.size());
    }

    /**
     * 从assets目录下读取文件
     *
     * @param context  上下文
     * @param fileName 文件名
     * @return
     */
    private String readFileFromAssets(Context context, String fileName) {
        StringBuilder s = new StringBuilder();
        BufferedReader br = null;
        try {
            InputStreamReader inputReader = new InputStreamReader(context.getResources().getAssets().open(fileName));
            br = new BufferedReader(inputReader);
            String line;
            while ((line = br.readLine()) != null) {
                s.append(line);
            }
        } catch (Exception e) {

        } finally {
            closeIO(br);
        }
        return s.toString();
    }

    /**
     * 关闭 IO
     *
     * @param closeables closeables
     */
    static void closeIO(final Closeable... closeables) {
        if (closeables == null) {
            return;
        }
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 新增新页面
     *
     * @param name   页面名
     * @param clazz  页面class
     * @param params 页面参数
     * @return 是否新增成功
     */
    public boolean putPage(String name, Class<? extends CPageFragment> clazz, Map<String, String> params) {
        if (TextUtils.isEmpty(name) || clazz == null) {
            PageLog.d("page Name is null or pageClass is null");
            return false;
        }
        if (mPageMap.containsKey(name)) {
            PageLog.d("page has already put!");
            return false;
        }
        mPageMap.put(name, new CorePage(name, clazz.getName(), buildParams(params)));
        PageLog.d("put a page:" + name);
        return true;
    }

    /**
     * 从hashMap中得到参数的json格式
     *
     * @param params 页面map形式参数
     * @return json格式参数
     */
    private String buildParams(Map<String, String> params) {
        if (params == null) {
            return "";
        }
        String result = JSON.toJSONString(params);
        PageLog.d("params:" + result);
        return result;
    }

    /**
     * 页面跳转核心函数之一
     * 打开一个Fragment,如果返回栈中有则出栈，否则新建
     *
     * @param fragmentManager FragmentManager管理类
     * @param pageName        页面别名
     * @param bundle          参数
     * @param animations      动画
     * @return 成功跳转到的fragment
     */
    public Fragment gotoPage(FragmentManager fragmentManager, String pageName, Bundle bundle, int[] animations) {
        PageLog.d("gotoPage:" + pageName);
        Fragment fragment = null;
        if (fragmentManager != null) {
            fragment = fragmentManager.findFragmentByTag(pageName);
        }
        if (fragment != null) {
            try {
                fragmentManager.popBackStackImmediate(pageName, 0);
            } catch (Exception e) {
                PageLog.e(e);
            }
        } else {
            fragment = this.openPageWithNewFragmentManager(fragmentManager, pageName, bundle, animations, true);
        }
        return fragment;

    }

    /**
     * 页面跳转核心函数之一
     * 添加并打开一个Fragment
     *
     * @param fragmentManager FragmentManager管理类
     * @param pageName        页面名
     * @param bundle          参数
     * @param animations      动画类型
     * @param addToBackStack  是否添加到返回栈
     * @return 打开的Fragment对象
     */
    public CPageFragment openPageWithNewFragmentManager(FragmentManager fragmentManager, String pageName, Bundle bundle, int[] animations, boolean addToBackStack) {
        CPageFragment fragment = null;
        try {
            CorePage corePage = mPageMap.get(pageName);
            if (corePage == null) {
                PageLog.d("Page:" + pageName + " is null");
                return null;
            }

            fragment = loadCPageFragmentByCorePage(corePage, pageName, bundle);

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            if (animations != null && animations.length >= 4) {
                fragmentTransaction.setCustomAnimations(animations[0], animations[1], animations[2], animations[3]);
            }
            Fragment fragmentContainer = fragmentManager.findFragmentById(R.id.fragment_container);
            if (fragmentContainer != null) {
                fragmentTransaction.hide(fragmentContainer);
            }

            fragmentTransaction.add(R.id.fragment_container, fragment, pageName);
            if (addToBackStack) {
                fragmentTransaction.addToBackStack(pageName);
            }

            fragmentTransaction.commitAllowingStateLoss();
            //fragmentTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            PageLog.d("Fragment.error:" + e.getMessage());
            return null;
        }
        return fragment;
    }


    /**
     * 页面跳转核心函数之一
     * 切换一个Fragment
     *
     * @param fragmentManager FragmentManager管理类
     * @param pageName        页面名
     * @param bundle          参数
     * @param animations      动画类型
     * @param addToBackStack  是否添加到返回栈
     * @return 打开的Fragment对象
     */
    public CPageFragment changePageWithNewFragmentManager(FragmentManager fragmentManager, String pageName, Bundle bundle, int[] animations, boolean addToBackStack) {
        CPageFragment CPageFragment = null;
        try {
            CorePage corePage = mPageMap.get(pageName);
            if (corePage == null) {
                PageLog.d("Page:" + pageName + " is null");
                return null;
            }

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            if (animations != null && animations.length >= 4) {
                fragmentTransaction.setCustomAnimations(animations[0], animations[1], animations[2], animations[3]);
            }

            List<Fragment> fragments = fragmentManager.getFragments();
            if (fragments != null && !fragments.isEmpty()) {
                for (Fragment fragment : fragments) {
                    fragmentTransaction.hide(fragment);
                }
            }

            CPageFragment = (CPageFragment) fragmentManager.findFragmentByTag(pageName);

            if (CPageFragment == null) {
                CPageFragment = loadCPageFragmentByCorePage(corePage, pageName, bundle);
                fragmentTransaction.add(R.id.fragment_container, CPageFragment, pageName);
            } else {
                fragmentTransaction.show(CPageFragment);
            }

            if (addToBackStack) {
                fragmentTransaction.addToBackStack(pageName);
            }

            fragmentTransaction.commitAllowingStateLoss();
            //fragmentTransaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            PageLog.d("Fragment.error:" + e.getMessage());
            return null;
        }
        return CPageFragment;
    }


    /**
     * 根据CorePage加载CPageFragment
     *
     * @param corePage
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    private CPageFragment loadCPageFragmentByCorePage(CorePage corePage, String pageName, Bundle bundle) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        CPageFragment fragment;

        //====Atlas的支持 start====/
        if (CoreConfig.isOpenAtlas()) {
            ClassLoader bundleClassLoader = CoreConfig.getBundleClassLoader();
            if (bundleClassLoader == null) {
                PageLog.d("OpenAtlas bundle ClassLoader is null!");
                return null;
            }
            fragment = (CPageFragment) CoreConfig.getBundleClassLoader().loadClass(corePage.getClazz()).newInstance();
        } else {
            fragment = (CPageFragment) Class.forName(corePage.getClazz()).newInstance();
        }
        //====Atlas的支持 end====/

        Bundle pageBundle = buildBundle(corePage);
        if (bundle != null) {
            pageBundle.putAll(bundle);
        }
        fragment.setArguments(pageBundle);
        fragment.setPageName(pageName);
        return fragment;
    }

    /**
     * 根据page，从pageParams中获得bundle
     *
     * @param corePage 页面
     * @return 页面的参数
     */
    private Bundle buildBundle(CorePage corePage) {
        Bundle bundle = new Bundle();
        String key = null;
        Object value = null;
        if (corePage != null && corePage.getParams() != null) {
            JSONObject j = JSON.parseObject(corePage.getParams());
            if (j != null) {
                Set<String> keySet = j.keySet();
                if (keySet != null) {
                    Iterator<String> ite = keySet.iterator();
                    while (ite.hasNext()) {
                        key = ite.next();
                        value = j.get(key);
                        bundle.putString(key, String.valueOf(value));
                    }
                }
            }
        }
        return bundle;
    }

    /**
     * 判断fragment是否位于栈顶
     *
     * @param context     上下文
     * @param fragmentTag fragment的tag
     * @return 是否是栈顶Fragment
     */
    public boolean isFragmentTop(Context context, String fragmentTag) {
        if (context != null && context instanceof CoreSwitcher) {
            return ((CoreSwitcher) context).isFragmentTop(fragmentTag);
        } else {
            CPageActivity topActivity = CPageActivity.getTopActivity();
            return topActivity != null && topActivity.isFragmentTop(fragmentTag);
        }
    }


}
