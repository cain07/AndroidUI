package com.cain.base.base;

import android.content.res.Configuration;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.cain.cpage.base.CPageActivity;
import com.cain.cpage.base.CPageFragment;
import com.cain.cpage.core.PageOption;
import com.cain.cpage.enums.CoreAnim;
import com.cain.cpage.utils.TitleBar;
import com.cain.cpage.utils.TitleUtils;
import com.xuexiang.xui.utils.WidgetUtils;
import com.xuexiang.xui.widget.progress.loading.IMessageLoader;

import java.io.Serializable;

public abstract class BaseFragment extends CPageFragment {


    /**
     * 消息加载框
     */
    private IMessageLoader mIMessageLoader;

    @Override
    protected void initPage() {
        initTitle();
        initViews();
        initListeners();
    }

    protected TitleBar initTitle() {
        return TitleUtils.addTitleBarDynamic((ViewGroup) getRootView(), getPageTitle(), new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popToBack();
            }
        });
    }

    public IMessageLoader getMessageLoader() {
        if (mIMessageLoader == null) {
            mIMessageLoader = WidgetUtils.getMiniLoadingDialog(getContext());
        }
        return mIMessageLoader;
    }

    public IMessageLoader getMessageLoader(String message) {
        if (mIMessageLoader == null) {
            mIMessageLoader = WidgetUtils.getMiniLoadingDialog(getContext(), message);
        } else {
            mIMessageLoader.updateMessage(message);
        }
        return mIMessageLoader;
    }

    @Override
    protected void initListeners() {

    }

    @Override
    public void onDestroyView() {
        if (mIMessageLoader != null) {
            mIMessageLoader.dismiss();
            mIMessageLoader = null;
        }
        super.onDestroyView();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        //屏幕旋转时刷新一下title
        super.onConfigurationChanged(newConfig);
        ViewGroup root = (ViewGroup) getRootView();
        if (root.getChildAt(0) instanceof TitleBar) {
            root.removeViewAt(0);
            initTitle();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
//        MobclickAgent.onPageStart(getPageName());
    }

    @Override
    public void onPause() {
        super.onPause();
//        MobclickAgent.onPageEnd(getPageName());
    }

    /**
     * 打开一个新的页面
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openNewPage(Class<T> clazz) {
        return new PageOption(clazz)
                .setNewActivity(true)
                .open(this);
    }

    /**
     * 打开一个新的页面
     *
     * @param clazzName
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openNewPage(String clazzName) {
        return new PageOption(clazzName)
                .setAnim(CoreAnim.slide)
                .setNewActivity(true)
                .open(this);
    }

    /**
     * 打开一个新的页面
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openNewPage(Class<T> clazz, @NonNull Class<? extends CPageActivity> containActivityClazz) {
        return new PageOption(clazz)
                .setNewActivity(true)
                .setContainActivityClazz(containActivityClazz)
                .open(this);
    }

    /**
     * 打开一个新的页面
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openNewPage(Class<T> clazz, String key, Object value) {
        PageOption option = new PageOption(clazz).setNewActivity(true);
        return openPage(option, key, value);
    }

    public androidx.fragment.app.Fragment openPage(PageOption option, String key, Object value) {
        if (value instanceof Integer) {
            option.putInt(key, (Integer) value);
        } else if (value instanceof String) {
            option.putString(key, (String) value);
        } else if (value instanceof Float) {
            option.putFloat(key, (Float) value);
        } else if (value instanceof Parcelable) {
            option.putParcelable(key, (Parcelable) value);
        } else if (value instanceof Serializable) {
            option.putSerializable(key, (Serializable) value);
        } else {
            //option.putString(key, XRouter.getInstance().navigation(SerializationService.class).object2Json(value));
        }
        return option.open(this);
    }

    /**
     * 打开一个新的页面
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openPage(Class<T> clazz, boolean addToBackStack, String key, String value) {
        return new PageOption(clazz)
                .setAddToBackStack(addToBackStack)
                .putString(key, value)
                .open(this);
    }

    /**
     * 打开一个新的页面
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openPage(Class<T> clazz, String key, Object value) {
        return openPage(clazz, true, key, value);
    }

    /**
     * 打开一个新的页面
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openPage(Class<T> clazz, boolean addToBackStack, String key, Object value) {
        PageOption option = new PageOption(clazz).setAddToBackStack(addToBackStack);
        return openPage(option, key, value);
    }

    /**
     * 打开一个新的页面
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openPage(Class<T> clazz, String key, String value) {
        return new PageOption(clazz)
                .putString(key, value)
                .open(this);
    }

    /**
     * 打开页面,需要结果返回
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openPageForResult(Class<T> clazz, String key, Object value, int requestCode) {
        PageOption option = new PageOption(clazz).setRequestCode(requestCode);
        return openPage(option, key, value);
    }

    /**
     * 打开页面,需要结果返回
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openPageForResult(Class<T> clazz, String key, String value, int requestCode) {
        return new PageOption(clazz)
                .setRequestCode(requestCode)
                .putString(key, value)
                .open(this);
    }

    /**
     * 打开页面,需要结果返回
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openNewPageForResult(Class<T> clazz, String key, String value, int requestCode) {
        return new PageOption(clazz)
                .setNewActivity(true)
                .setRequestCode(requestCode)
                .putString(key, value)
                .open(this);
    }

    /**
     * 打开页面,需要结果返回
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends CPageFragment> androidx.fragment.app.Fragment openPageForResult(Class<T> clazz, int requestCode) {
        return new PageOption(clazz)
                .setRequestCode(requestCode)
                .open(this);
    }


}
