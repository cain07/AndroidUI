package com.cain.ui.fragment;

import com.cain.cpage.AppPageConfig;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.cpage.model.PageInfo;
import com.cain.ui.base.BaseHomeFragment;

import java.util.List;

@Page(name = "拓展", anim = CoreAnim.none)
public class ExpandsFragment extends BaseHomeFragment {

    @Override
    protected List<PageInfo> getPageContents() {
        return AppPageConfig.getInstance().getExpands();
    }




}
