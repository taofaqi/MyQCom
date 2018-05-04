package com.ttpai.myqcom.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.ttpai.myqcom.R;
import com.ttpai.myqcom.util.Const;
import com.ttpai.myqcom.util.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserInfoActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.user_info_user_icon)
    SimpleDraweeView mUserIcon;
    @BindView(R.id.user_info_username)
    TextView mUsername;
    @BindView(R.id.user_info_phone)
    TextView mPhone;
    @BindView(R.id.user_info_content_layout)
    RelativeLayout mContentLayout;
    @BindView(R.id.user_info_update_btn)
    TextView mUpdateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ButterKnife.bind(this);
        initEventListener();
        initDatas();
    }

    private void initEventListener() {
        mUpdateBtn.setOnClickListener(this);
    }

    private void initDatas() {

        mUserIcon.setImageURI(Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525326160601&di=14c98ae6839bf58691e0c46bc462e2a3&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Feaf81a4c510fd9f95e3fd930292dd42a2834a4bb.jpg"));

        String username = "姓名：不一样的名字";
        String phone = "电话：13893030038";
        SpannableString usernameSpannableStr = Utils.getSpannableString(username, getResources().getColor(R.color.darker_gray), 0, 2);
        SpannableString phoneSpannableStr = Utils.getSpannableString(phone, getResources().getColor(R.color.darker_gray), 0, 2);
        mUsername.setText(usernameSpannableStr);
        mPhone.setText(phoneSpannableStr);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.user_info_update_btn) {
            startActivityForResult(new Intent(this, ChangeInfoActivity.class), Const.REQUEST_COED);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}