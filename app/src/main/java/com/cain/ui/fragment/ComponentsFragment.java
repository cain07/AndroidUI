package com.cain.ui.fragment;

import android.content.Intent;
import android.view.View;

import com.cain.cpage.AppPageConfig;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.cpage.model.PageInfo;
import com.cain.ui.activity.ComponentsActivity;
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
    protected List<PageInfo> getPageContents() {
        return AppPageConfig.getInstance().getComponents();
    }

    @Override
    public void onItemClick(View itemView, PageInfo widgetInfo, int pos) {


        Intent intent = new Intent(getActivity(), ComponentsActivity.class);
        intent.putExtra("item_index",pos);
        startActivity(intent);
    }
}
