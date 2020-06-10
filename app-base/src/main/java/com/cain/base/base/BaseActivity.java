package com.cain.base.base;

import android.os.Bundle;

import androidx.annotation.NonNull;

import com.cain.cpage.base.CPageActivity;
import com.cain.cpage.base.CPageFragment;
import com.cain.cpage.core.CoreSwitchBean;
import com.xuexiang.xui.widget.dialog.DialogLoader;
import com.zyq.easypermission.EasyPermissionHelper;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public class BaseActivity extends CPageActivity {

    //==============需要注意的是，由于JPTabBar反射获取注解的是context，也就是容器Activity，因此需要将注解写在容器Activity内======================//
   /* @Titles
    public static final int[] mTitles = {R.string.tab1, R.string.tab2, R.string.tab3, R.string.tab4};
    @SeleIcons
    public static final int[] mSelectIcons = {R.drawable.nav_01_pre, R.drawable.nav_02_pre, R.drawable.nav_04_pre, R.drawable.nav_05_pre};
    @NorIcons
    public static final int[] mNormalIcons = {R.drawable.nav_01_nor, R.drawable.nav_02_nor, R.drawable.nav_04_nor, R.drawable.nav_05_nor};
*/
    //============================================================================================================================================================//
    /**
     * 是否支持侧滑返回
     */
    public static final String KEY_SUPPORT_SLIDE_BACK = "key_support_slide_back";

    Unbinder mUnbinder;


   /* @Override
    protected void attachBaseContext(Context newBase) {
        //注入字体
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initAppTheme();
        initStatusBarStyle();
        super.onCreate(savedInstanceState);
        mUnbinder = ButterKnife.bind(this);
    }

    /**
     * 初始化应用的主题
     */
    protected void initAppTheme() {
        //Utils.initTheme(this);
    }

    /**
     * 初始化状态栏的样式
     */
    protected void initStatusBarStyle() {

    }


    /**
     * 打开fragment
     *
     * @param clazz          页面类
     * @param addToBackStack 是否添加到栈中
     * @return 打开的fragment对象
     */
    public <T extends CPageFragment> T openPage(Class<T> clazz, boolean addToBackStack) {
        CoreSwitchBean page = new CoreSwitchBean(clazz).setAddToBackStack(addToBackStack);
        return (T) openPage(page);
    }

    /**
     * 打开fragment
     *
     * @return 打开的fragment对象
     */
    public <T extends CPageFragment> T openNewPage(Class<T> clazz) {
        CoreSwitchBean page = new CoreSwitchBean(clazz).setNewActivity(true);
        return (T) openPage(page);
    }

    /**
     * 切换fragment
     *
     * @param clazz 页面类
     * @return 打开的fragment对象
     */
    public <T extends CPageFragment> T switchPage(Class<T> clazz) {
        return changePage(clazz);
    }

    @Override
    protected void onRelease() {
        mUnbinder.unbind();
        /*if (isSupportSlideBack()) {
            SlideBack.unregister(this);
        }*/
        super.onRelease();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        EasyPermissionHelper.getInstance().onRequestPermissionsResult(requestCode, permissions, grantResults, this);

        DialogLoader
    }
}
