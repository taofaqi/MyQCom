package com.ttpai.myqcom.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.ttpai.myqcom.R;
import com.ttpai.myqcom.bean.RankingBean;
import com.ttpai.myqcom.network.BaseObserver;
import com.ttpai.myqcom.network.RetrofitFactory;
import com.ttpai.myqcom.ui.adapter.RankingAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

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
        RetrofitFactory.getInstence().API()
                .getRankingList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<List<RankingBean>>() {
                    @Override
                    protected void onSuccees(List<RankingBean> rankingListBean) throws Exception {

                        Log.e("RankingBean", "RankingBean:" + rankingListBean.toString());
//                        rankingList = new ArrayList<>();
//                        for (int i = 0; i < rankingListBean.size(); i++) {
//
//                        }
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        Log.e("RankingBean", "e:" + e.toString());
                    }
                });


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
