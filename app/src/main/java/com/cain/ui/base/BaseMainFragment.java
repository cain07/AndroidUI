package com.cain.ui.base;

import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.cain.cpage.model.PageInfo;
import com.cain.cpage.utils.TitleBar;
import com.cain.cpage.utils.TitleUtils;
import com.cain.ui.R;
import com.cain.ui.adapter.WidgetItemAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.WidgetUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import butterknife.BindView;

public abstract class BaseMainFragment extends BaseUIFragment implements RecyclerViewHolder.OnItemClickListener<PageInfo> {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    private WidgetItemAdapter mWidgetItemAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_container;
    }

    @Override
    protected void initViews() {
        initTitle();
        initRecyclerView();
    }

    @Override
    protected void initListeners() {

    }

    private void initRecyclerView() {
        WidgetUtils.initGridRecyclerView(mRecyclerView, 3, DensityUtils.dp2px(2));

        mWidgetItemAdapter = new WidgetItemAdapter(sortPageInfo(getPageContents()));
        mWidgetItemAdapter.setOnItemClickListener(this);
        mRecyclerView.setAdapter(mWidgetItemAdapter);
    }

    protected TitleBar initTitle() {
        return TitleUtils.addTitleBarDynamic((ViewGroup) getRootView(), getPageTitle(), new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
    }



    /**
     * 进行排序
     *
     * @param pageInfoList
     * @return
     */
    private List<PageInfo> sortPageInfo(List<PageInfo> pageInfoList) {
        Collections.sort(pageInfoList, new Comparator<PageInfo>() {
            @Override
            public int compare(PageInfo o1, PageInfo o2) {
                return o1.getClassPath().compareTo(o2.getClassPath());
            }
        });
        return pageInfoList;
    }

    /**
     * @return 页面内容
     */
    protected abstract List<PageInfo> getPageContents();
    /**
     * @return 标题头
     */
    protected abstract String getPageTitle();
}
