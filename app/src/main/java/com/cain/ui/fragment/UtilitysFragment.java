package com.cain.ui.fragment;

import android.content.Intent;
import android.view.View;

import com.cain.cpage.AppPageConfig;
import com.cain.cpage.model.PageInfo;
import com.cain.ui.activity.PermissionTestActivity;
import com.cain.ui.base.BaseMainFragment;

import java.util.List;

/** 
  * @Description:     
  * @Author:         cain
  * @CreateDate:     2020/6/4 9:16 AM
  * @Version:        1.0
 */
public class UtilitysFragment extends BaseMainFragment {

    @Override
    protected List<PageInfo> getPageContents() {
        return AppPageConfig.getInstance().getUtils();
    }

    @Override
    protected String getPageTitle() {
        return "工具";
    }

    @Override
    public void onItemClick(View itemView, PageInfo widgetInfo, int pos) {

        Intent intent = new Intent(getActivity(), PermissionTestActivity.class);
        startActivity(intent);


    }


}
