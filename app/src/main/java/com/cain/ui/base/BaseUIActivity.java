package com.cain.ui.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseUIActivity extends AppCompatActivity {

    protected Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        mUnbinder = ButterKnife.bind(this);
    }


    protected void onDestroy() {
        super.onDestroy();

        if (mUnbinder != mUnbinder.EMPTY) {
            mUnbinder.unbind();
        }
    }

    protected abstract int getLayoutId();

}
