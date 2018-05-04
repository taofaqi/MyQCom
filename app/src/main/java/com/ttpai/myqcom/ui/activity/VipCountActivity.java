package com.ttpai.myqcom.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ttpai.myqcom.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VipCountActivity extends BaseActivity {

    @BindView(R.id.vip_count_title)
    TextView mVipCountTitle;
    @BindView(R.id.vip_count_num)
    TextView mVipCountNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vip_count);
        ButterKnife.bind(this);
    }
}
