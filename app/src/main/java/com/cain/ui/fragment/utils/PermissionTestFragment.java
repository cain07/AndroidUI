package com.cain.ui.fragment.utils;

import com.cain.base.base.BaseFragment;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.ui.R;

@Page(name = "PermissionTestFragment", anim = CoreAnim.zoom)
public class PermissionTestFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_permission_test;
    }

    @Override
    protected void initViews() {

    }


}
