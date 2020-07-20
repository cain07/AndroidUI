package com.cain.ui.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.cain.cpage.model.PageInfo;
import com.cain.ui.activity.ComponentsActivity;
import com.cain.ui.base.BaseMainFragment;
import com.xuexiang.xui.widget.toast.XToast;

import java.util.ArrayList;
import java.util.List;

/**
  * @Description:
  * @Author:         cain
  * @CreateDate:     2020/6/3 2:05 PM
  * @Version:        1.0
 */
public class ComponentsFragment extends BaseMainFragment {

    private static List<PageInfo> pageInfos = new ArrayList<>();

    static  {
        pageInfos.add(new PageInfo("环形1",""));
        pageInfos.add(new PageInfo("进度条",""));
    }
    @Override
    protected List<PageInfo> getPageContents() {
        return pageInfos;
    }

    @Override
    protected String getPageTitle() {
        return "组件";
    }

    @Override
    public void onItemClick(View itemView, PageInfo widgetInfo, int pos) {

        if (pos == 0){
            XToast.info(getActivity(),"第1个");
            Intent intent = new Intent(getActivity(), ComponentsActivity.class);
            intent.putExtra("item_index",pos);
            startActivity(intent);
        }

        if (pos == 1){
            Toast.makeText(getContext(),"dsd",Toast.LENGTH_SHORT);
            //XToast.info(getActivity(),"第二个");
        }

    }
}
