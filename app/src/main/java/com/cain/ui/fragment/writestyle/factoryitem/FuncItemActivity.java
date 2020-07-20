package com.cain.ui.fragment.writestyle.factoryitem;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class FuncItemActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    protected void setListener() {
        //例子 如下
        /*mAdapter.setOnItemClickListener(new FuncAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String funcName = FuncItemFactory.getInstance().createFuncItems().get(position).funcName;
                switch (funcName) {
                    case FuncItemFactory.CREAT_ENUMBER:
                        break;
                    case FuncItemFactory.QUICK_CONTACTPEOPLE:
                        break;
                    case FuncItemFactory.ADD_CONTACTPEOPLE:
                        break;
                }
            }
        });*/
    }
}
