package com.cain.ui.fragment;

import android.content.Intent;
import android.view.View;

import com.cain.cpage.model.PageInfo;
import com.cain.ui.activity.ExpandsActivity;
import com.cain.ui.activity.PermissionTestActivity;
import com.cain.ui.base.BaseMainFragment;

import java.util.ArrayList;
import java.util.List;

public class ExpandsFragment extends BaseMainFragment {

    private static List<PageInfo> pageInfos = new ArrayList<>();

    static {
        pageInfos.add(new PageInfo("写法一", ""));
        pageInfos.add(new PageInfo("设计模式", ""));
    }

    @Override
    protected List<PageInfo> getPageContents() {
        return pageInfos;
    }

    @Override
    protected String getPageTitle() {
        return "拓展";
    }

    @Override
    public void onItemClick(View itemView, PageInfo item, int position) {
        switch (position) {
            case 0:
                Intent intent = new Intent(getActivity(), PermissionTestActivity.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(getActivity(), ExpandsActivity.class);
                intent1.putExtra("item_index",position);
                startActivity(intent1);
                break;
            case 2:
                break;
        }
    }


}
