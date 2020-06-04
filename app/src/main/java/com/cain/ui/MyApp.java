package com.cain.ui;

import android.app.Application;
import android.content.Context;

import com.cain.base.base.BaseActivity;
import com.cain.cpage.AppPageConfig;
import com.cain.cpage.PageConfig;
import com.xuexiang.xui.XUI;


/**
 * 应用初始化
 * @since 2018/11/7 下午1:12
 */
public class MyApp extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //解决4.x运行崩溃的问题
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initUI();
        //初始化基础库
        //三方SDK初始化
        //运营统计数据运行时不初始化

    }

    /**
     * 初始化XUI 框架
     */
    private void initUI() {
        XUI.init(this);
        XUI.debug(MyApp.isDebug());
//        //设置默认字体为华文行楷
//        XUI.getInstance().initFontStyle("fonts/hwxk.ttf");

        initPage(this);
    }


    /**
     * 初始化XPage页面框架
     *
     * @param application
     */
    private static void initPage(Application application) {
        //自动注册页面
        PageConfig.getInstance()
                .setPageConfiguration(context -> {
                    //自动注册页面,是编译时自动生成的，build一下就出来了
                    return AppPageConfig.getInstance().getPages();
                })
                .debug(MyApp.isDebug() ? "PageLog" : null)
                .setContainActivityClazz(BaseActivity.class)
                .enableWatcher(MyApp.isDebug())
                .init(application);
    }

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }

}
