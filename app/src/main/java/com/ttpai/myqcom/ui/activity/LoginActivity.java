package com.ttpai.myqcom.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ttpai.myqcom.R;
import com.ttpai.myqcom.bean.LoginBean;
import com.ttpai.myqcom.bean.News;
import com.ttpai.myqcom.network.BaseObserver;
import com.ttpai.myqcom.network.RetrofitFactory;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

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
//            RetrofitFactory.getInstence().API()
//                    .Login("13023110962", "123456")
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribe(new BaseObserver<LoginBean>() {
//                        @Override
//                        protected void onSuccees(LoginBean loginBean) throws Exception {
//
//                            Log.e("LoginBean", "LoginBean:" + loginBean.getLenient());
//                            startActivity(new Intent(LoginActivity.this, MainActivity.class));
//
//                        }
//
//                        @Override
//                        protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
//                            Log.e("LoginBean", "e:" + e.toString());
//                        }
//                    });
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        }
    }
}
