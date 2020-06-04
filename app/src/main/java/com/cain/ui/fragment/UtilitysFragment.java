package com.cain.ui.fragment;

import com.cain.cpage.AppPageConfig;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.cpage.model.PageInfo;
import com.cain.ui.base.BaseHomeFragment;

import java.util.List;

/** 
  * @Description:     
  * @Author:         cain
  * @CreateDate:     2020/6/4 9:16 AM
  * @Version:        1.0
 */
@Page(name = "工具", anim = CoreAnim.none)
public class UtilitysFragment extends BaseHomeFragment {

    @Override
    protected List<PageInfo> getPageContents() {
        return AppPageConfig.getInstance().getUtils();
    }
}
