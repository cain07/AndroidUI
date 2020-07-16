package com.cain.ui.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseUIFragment extends Fragment {

    protected Unbinder mUnbinder;
    private View mRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(getLayoutId(), container, false);
        mUnbinder = ButterKnife.bind(this, mRootView);
        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
        initListeners();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mUnbinder != mUnbinder.EMPTY) {
            mUnbinder.unbind();
        }
    }

    /**
     * 获取根布局
     *
     * @return
     */
    public View getRootView() {
        return mRootView;
    }

    /**
     * 布局的资源id
     *
     * @return
     */
    protected abstract int getLayoutId();

    /**
     * 初始化控件
     */
    protected abstract void initViews();

    /**
     * 初始化监听
     */
    protected  void initListeners(){};
}
