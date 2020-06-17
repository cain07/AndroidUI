package com.cain.ui.activity;

import android.os.Bundle;

import com.cain.base.base.BaseActivity;
import com.cain.ui.R;
import com.cain.ui.fragment.components.circle.CircleIndexFragment;
import com.cain.ui.fragment.components.circle.CountProgressFragment;
import com.cain.util.sub.app.FragmentUtils;

public class ComponentsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_components;
    }

    private void initViews() {
        int item_index = getIntent().getIntExtra("item_index", 0);

        switch (item_index) {
            case 0:
                CircleIndexFragment fragment = new CircleIndexFragment();
                FragmentUtils.add(getSupportFragmentManager(),fragment,R.id.fragment_container_components);
            case 1:
                CountProgressFragment countProgressFragment = new CountProgressFragment();
                FragmentUtils.add(getSupportFragmentManager(),countProgressFragment,R.id.fragment_container_components);

            case 2:
                CircleIndexFragment fragment1 = new CircleIndexFragment();
                FragmentUtils.add(getSupportFragmentManager(),fragment1,R.id.fragment_container_components);

            default:
                CircleIndexFragment fragment2 = new CircleIndexFragment();
                FragmentUtils.add(getSupportFragmentManager(),fragment2,R.id.fragment_container_components);

        }

    }
}
