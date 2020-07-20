package com.cain.ui.activity;

import android.os.Bundle;

import com.cain.ui.R;
import com.cain.ui.base.BaseUIActivity;
import com.cain.ui.fragment.components.circle.CircleIndexFragment;
import com.cain.ui.fragment.writestyle.WritesIndexFragment;
import com.cain.util.sub.app.FragmentUtils;

/**
 * 拓展 实验模块 的 容器
 */
public class ExpandsActivity extends BaseUIActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_expands;
    }

    private void initViews() {
        int item_index = getIntent().getIntExtra("item_index", 0);

        switch (item_index) {
            case 0:
                WritesIndexFragment fragment = new WritesIndexFragment();
                FragmentUtils.add(getSupportFragmentManager(),fragment,R.id.fragment_container_expands);
                break;
            case 1:
                WritesIndexFragment countProgressFragment = new WritesIndexFragment();
                FragmentUtils.add(getSupportFragmentManager(),countProgressFragment,R.id.fragment_container_expands);
                break;
            case 2:
                CircleIndexFragment fragment1 = new CircleIndexFragment();
                FragmentUtils.add(getSupportFragmentManager(),fragment1,R.id.fragment_container_expands);
                break;
            default:
                CircleIndexFragment fragment2 = new CircleIndexFragment();
                FragmentUtils.add(getSupportFragmentManager(),fragment2,R.id.fragment_container_expands);
                break;
        }

    }
}
