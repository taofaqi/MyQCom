package com.ttpai.myqcom.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ttpai.myqcom.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

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
    }


}
