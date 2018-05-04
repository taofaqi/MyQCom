package com.ttpai.myqcom.ui.activity;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.ttpai.myqcom.R;
import com.ttpai.myqcom.bean.News;
import com.ttpai.myqcom.bean.VipListBean;
import com.ttpai.myqcom.network.BaseObserver;
import com.ttpai.myqcom.network.RetrofitFactory;
import com.ttpai.myqcom.ui.adapter.VipListAdapter;
import com.ttpai.myqcom.weight.SimpleDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class VipListActivity extends BaseActivity {

    private List<VipListBean> vipLlist;

    @BindView(R.id.vip_list_recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.vip_list_SwipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;
    private VipListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vip_list);
        ButterKnife.bind(this);
        initDatas();
        mAdapter = new VipListAdapter(vipLlist, this);
        mRecyclerView.setAdapter(mAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));
    }

    private void initDatas() {

        RetrofitFactory.getInstence().API()
                .getZhihu()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<News>() {
                    @Override
                    protected void onSuccees(News news) throws Exception {
                        Log.e("------", news.toString());
                        Toast.makeText(VipListActivity.this, news.getStories().get(0).getTitle(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {

                    }
                });

        vipLlist = new ArrayList<>();
        vipLlist.add(new VipListBean());
        vipLlist.add(new VipListBean());
        vipLlist.add(new VipListBean());
        vipLlist.add(new VipListBean());
        vipLlist.add(new VipListBean());
        vipLlist.add(new VipListBean());
        vipLlist.add(new VipListBean());
        vipLlist.add(new VipListBean());
        vipLlist.add(new VipListBean());
    }
}