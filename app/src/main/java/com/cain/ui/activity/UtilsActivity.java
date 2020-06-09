package com.cain.ui.activity;

import android.os.Bundle;

import com.cain.base.base.BaseActivity;
import com.cain.ui.R;
import com.cain.ui.fragment.utils.PermissionTestFragment;
import com.cain.util.sub.app.FragmentUtils;

public class UtilsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_utils;
    }

    private void initViews() {
        PermissionTestFragment fragment = new PermissionTestFragment();
        FragmentUtils.add(getSupportFragmentManager(),fragment,R.id.fragment_container_utils);
    }
}
