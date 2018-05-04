package com.ttpai.myqcom.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ttpai.myqcom.R;
import com.ttpai.myqcom.bean.VipListBean;
import com.ttpai.myqcom.ui.viewholder.VipListViewHolder;
import com.ttpai.myqcom.util.Utils;

import java.util.List;

public class VipListAdapter extends RecyclerView.Adapter {

    private List<VipListBean> vipListBeans;
    private Context mContext;
    private LayoutInflater inflater;


    public VipListAdapter(List<VipListBean> vipListBeans, Context mContext) {
        this.vipListBeans = vipListBeans;
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VipListViewHolder(inflater.inflate(R.layout.item_vip_list, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((VipListViewHolder) holder).bind(vipListBeans.get(position));
    }

    @Override
    public int getItemCount() {
        return Utils.isCollectionEmpty(vipListBeans) ? 0 : vipListBeans.size();
    }
}
