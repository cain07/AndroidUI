package com.cain.ui.fragment;

import android.view.View;

import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.cpage.model.PageInfo;
import com.cain.ui.base.BaseMainFragment;

import java.util.List;

public class ExpandsFragment extends BaseMainFragment {


    @Override
    protected List<PageInfo> getPageContents() {
        return null;
    }

    @Override
    protected String getPageTitle() {
        return "拓展";
    }

    @Override
    public void onItemClick(View itemView, PageInfo item, int position) {

    }
}
