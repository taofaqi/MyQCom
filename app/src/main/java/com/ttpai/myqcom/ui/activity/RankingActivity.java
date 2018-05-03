package com.ttpai.myqcom.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ttpai.myqcom.R;
import com.ttpai.myqcom.bean.RankingBean;
import com.ttpai.myqcom.ui.adapter.RankingAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RankingActivity extends BaseActivity {

    @BindView(R.id.ranking_recyclerView)
    RecyclerView mRecyclerView;
    private List<Object> rankingList;
    private RankingAdapter rankingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        ButterKnife.bind(this);

        initDatas();
        rankingAdapter = new RankingAdapter(rankingList, this);
        mRecyclerView.setAdapter(rankingAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void initDatas() {
        rankingList = new ArrayList<>();
        rankingList.add(new ArrayList<RankingBean>());
        rankingList.add(new RankingBean());
        rankingList.add(new RankingBean());
        rankingList.add(new RankingBean());
        rankingList.add(new RankingBean());
        rankingList.add(new RankingBean());
        rankingList.add(new RankingBean());
        rankingList.add(new RankingBean());
        rankingList.add(new RankingBean());
        rankingList.add(new RankingBean());
    }
}
