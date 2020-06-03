package com.cain.ui.adapter;

import androidx.annotation.NonNull;

import com.cain.cpage.model.PageInfo;
import com.cain.ui.R;
import com.xuexiang.xui.adapter.recyclerview.BaseRecyclerAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;

import java.util.List;

public class WidgetItemAdapter extends BaseRecyclerAdapter<PageInfo> {

    public WidgetItemAdapter(List<PageInfo> list) {
        super(list);
    }

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.layout_widget_item;
    }

    @Override
    public void bindData(@NonNull RecyclerViewHolder holder, int position, PageInfo item) {
        holder.text(R.id.item_name, item.getName());
        if (item.getExtra() != 0) {
            holder.image(R.id.item_icon, item.getExtra());
        }
    }

}
