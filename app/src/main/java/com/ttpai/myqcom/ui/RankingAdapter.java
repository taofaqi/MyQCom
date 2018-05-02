package com.ttpai.myqcom.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ttpai.myqcom.R;

import java.util.List;

public class RankingAdapter extends RecyclerView.Adapter {

    private List<Object> rankingBeanList;
    private Context mContext;
    private LayoutInflater inflater;

    private static final int ITEM_TOP = 0x001;
    private static final int ITEM_NORMAL = 0x002;

    public RankingAdapter(List<Object> rankingBeanList, Context mContext) {
        this.rankingBeanList = rankingBeanList;
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == ITEM_TOP) {
            return new TopViewHolder(inflater.inflate(R.layout.item_top_ranking, parent, false));
        } else {
            return new NormalViewHolder(inflater.inflate(R.layout.item_normal_ranking, parent, false));
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0)
            return ITEM_TOP;
        else
            return ITEM_NORMAL;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof TopViewHolder) {
            ((TopViewHolder) holder).bind((List<RankingBean>) rankingBeanList.get(position));
        } else if (holder instanceof NormalViewHolder) {
            ((NormalViewHolder) holder).bind((RankingBean) rankingBeanList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return Utils.isCollectionEmpty(rankingBeanList) ? 0 : rankingBeanList.size();
    }
}
