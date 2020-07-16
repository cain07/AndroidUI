package com.cain.ui.base;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.cain.base.base.BaseFragment;
import com.cain.cpage.model.PageInfo;
import com.cain.cpage.utils.TitleBar;
import com.cain.ui.MainActivity;
import com.cain.ui.R;
import com.cain.ui.adapter.WidgetItemAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.WidgetUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import butterknife.BindView;
/**
  * @Description:
  * @Author:         cain
  * @CreateDate:     2020/6/3 2:11 PM
  * @Version:        1.0
 */
public abstract class BaseHomeFragment extends BaseFragment implements RecyclerViewHolder.OnItemClickListener<PageInfo> {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    private WidgetItemAdapter mWidgetItemAdapter;

    @Override
    protected TitleBar initTitle() {
        TitleBar titleBar = super.initTitle();
       /* titleBar.setLeftImageResource(R.drawable.ic_action_menu);
        titleBar.setLeftClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContainer().openMenu();
            }
        });
        titleBar.addAction(new TitleBar.ImageAction(R.drawable.icon_action_query) {
            @Override
            public void performAction(View view) {
                //openNewPage(SearchComponentFragment.class);
            }
            @Override
            public int rightPadding() {
                return DensityUtils.dp2px(10);
            }
        });
        titleBar.addAction(new TitleBar.ImageAction(R.drawable.icon_action_about) {
            @Override
            public void performAction(View view) {
                //openNewPage(AboutFragment.class);
            }
        });*/
        return titleBar;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_container;
    }

    @Override
    protected void initViews() {
        initRecyclerView();
    }

    private void initRecyclerView() {
        WidgetUtils.initGridRecyclerView(mRecyclerView, 3, DensityUtils.dp2px(2));

        mWidgetItemAdapter = new WidgetItemAdapter(sortPageInfo(getPageContents()));
        mWidgetItemAdapter.setOnItemClickListener(this);
        mRecyclerView.setAdapter(mWidgetItemAdapter);
    }

    /**
     * @return 页面内容
     */
    protected abstract List<PageInfo> getPageContents();

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

    @Override
    public void onItemClick(View itemView, PageInfo widgetInfo, int pos) {
        if (widgetInfo != null) {
            openNewPage(widgetInfo.getName());
        }
    }

    public MainActivity getContainer() {
        return null;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        //屏幕旋转时刷新一下title
        super.onConfigurationChanged(newConfig);
        ViewGroup root = (ViewGroup) getRootView();
        if (root.getChildAt(0) instanceof TitleBar) {
            root.removeViewAt(0);
            initTitle();
        }
    }
}
