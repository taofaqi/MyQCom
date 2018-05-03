package com.ttpai.myqcom.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ttpai.myqcom.R;
import com.ttpai.myqcom.bean.News;
import com.ttpai.myqcom.network.BaseObserver;
import com.ttpai.myqcom.network.RetrofitFactory;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.main_title)
    LinearLayout mTitle;
    @BindView(R.id.main_member_num)
    TextView mMemberNum;
    @BindView(R.id.main_member_look)
    TextView mMemberLook;
    @BindView(R.id.main_content_top)
    LinearLayout mContentTop;
    @BindView(R.id.main_ranking)
    TextView mRanking;
    @BindView(R.id.main_me)
    TextView mMe;
    @BindView(R.id.main_content_bottom)
    LinearLayout mContentBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initEventLister();
    }

    private void initEventLister() {
        mRanking.setOnClickListener(this);
        mMemberNum.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.main_ranking) {
            startActivity(new Intent(this, RankingActivity.class));
        } else if (view.getId() == R.id.main_member_num) {
            //TODO  Test
            RetrofitFactory.getInstence().API()
                    .getZhihu()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new BaseObserver<News>() {
                        @Override
                        protected void onSuccees(News news) throws Exception {
                            Log.e("------", news.toString());
                            Toast.makeText(MainActivity.this, news.getStories().get(0).getTitle(), Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {

                        }
                    });
        }
    }
}
