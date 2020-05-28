package com.cain.base.base;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseActivity extends Activity {

    protected Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        mUnbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (mUnbinder != mUnbinder.EMPTY){
            mUnbinder.unbind();
        }
    }

    protected  abstract  int getLayoutId();

}
