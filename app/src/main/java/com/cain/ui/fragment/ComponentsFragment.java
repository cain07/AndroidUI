package com.cain.ui.fragment;

import com.cain.cpage.AppPageConfig;
import com.cain.cpage.model.PageInfo;
import com.cain.ui.base.BaseHomeFragment;

import java.util.List;

/**
  * @Description:
  * @Author:         cain
  * @CreateDate:     2020/6/3 2:05 PM
  * @Version:        1.0
 */
public class ComponentsFragment extends BaseHomeFragment {


    @Override
    protected List<PageInfo> getPageContents() {
        return AppPageConfig.getInstance().getComponents();
    }

}
