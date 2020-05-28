package com.cain.base.base;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment {


    protected Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(getLayoutId(),container,false);

        mUnbinder = ButterKnife.bind(this,rootView);

        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mUnbinder != mUnbinder.EMPTY){
            mUnbinder.unbind();
        }
    }

    protected  abstract  int getLayoutId();
}
