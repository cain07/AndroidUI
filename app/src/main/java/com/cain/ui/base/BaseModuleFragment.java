package com.cain.ui.base;

import android.view.View;
import android.view.ViewGroup;

import com.cain.cpage.utils.TitleBar;
import com.cain.cpage.utils.TitleUtils;

/**
 * 各个模块的 基础类
 */
public abstract class BaseModuleFragment extends BaseUIFragment {


    @Override
    protected void initViews() {
        initTitle();
    }

    protected TitleBar initTitle() {
        return TitleUtils.addTitleBarDynamic((ViewGroup) getRootView(), getPageTitle(), new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
    }

    /**
     * @return 标题头
     */
    protected abstract String getPageTitle();
}
