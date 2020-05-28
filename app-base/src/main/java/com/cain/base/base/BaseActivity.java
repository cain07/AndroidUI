package com.cain.base.base;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class BaseActivity extends Activity {


    Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mUnbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mUnbinder.unbind();
    }

}
