package com.ttpai.myqcom.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ttpai.myqcom.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

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
    }
}
