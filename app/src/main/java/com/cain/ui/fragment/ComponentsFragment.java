package com.cain.ui.fragment;

import android.os.Bundle;
import android.util.Log;

import com.cain.cpage.AppPageConfig;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.cpage.model.PageInfo;
import com.cain.ui.base.BaseHomeFragment;

import java.util.List;

/**
  * @Description:
  * @Author:         cain
  * @CreateDate:     2020/6/3 2:05 PM
  * @Version:        1.0
 */
@Page(name = "组件", anim = CoreAnim.none)
public class ComponentsFragment extends BaseHomeFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("ComponentsFragment----","----onCreate----");
    }

    @Override
    protected List<PageInfo> getPageContents() {
        return AppPageConfig.getInstance().getComponents();
    }

}
