package com.ttpai.myqcom.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ttpai.myqcom.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.login_title)
    TextView mTitle;
    @BindView(R.id.login_username_et)
    EditText mUsernameEt;
    @BindView(R.id.login_password_et)
    EditText mPasswordEt;
    @BindView(R.id.login_code_et)
    EditText mCodeEt;
    @BindView(R.id.login_content)
    LinearLayout mContent;
    @BindView(R.id.login_login_btn)
    TextView mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mLoginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_login_btn) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        }
    }
}
