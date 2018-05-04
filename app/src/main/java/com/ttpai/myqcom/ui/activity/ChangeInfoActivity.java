package com.ttpai.myqcom.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.ttpai.myqcom.R;
import com.ttpai.myqcom.util.Utils;
import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.engine.impl.GlideEngine;

import java.io.File;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ChangeInfoActivity extends BaseActivity implements View.OnClickListener {

    private static final int REQUEST_CODE_CHOOSE = 23;
    private List<Uri> mSelected;

    @BindView(R.id.user_info_user_icon)
    SimpleDraweeView mUserIcon;
    @BindView(R.id.change_info_user_icon_layout)
    LinearLayout mUserIconLayout;
    @BindView(R.id.change_info_username)
    TextView mUsername;
    @BindView(R.id.change_info_username_layout)
    LinearLayout mUsernameLayout;
    @BindView(R.id.change_info_user_phone)
    TextView mUserPhone;
    @BindView(R.id.change_info_user_phone_layout)
    LinearLayout mUserPhoneLayout;
    @BindView(R.id.user_info_update_btn)
    TextView mUpdateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_info);
        ButterKnife.bind(this);
        initEventListener();
        initDatas();
    }

    private void initEventListener() {
        mUserIconLayout.setOnClickListener(this);
        mUpdateBtn.setOnClickListener(this);
    }

    private void initDatas() {
        mUserIcon.setImageURI(Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525326160601&di=14c98ae6839bf58691e0c46bc462e2a3&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Feaf81a4c510fd9f95e3fd930292dd42a2834a4bb.jpg"));
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if (id == R.id.change_info_user_icon_layout) {

            RxPermissions rxPermissions = new RxPermissions(this);
            rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    .subscribe(new Observer<Boolean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(Boolean aBoolean) {
                            Matisse.from(ChangeInfoActivity.this)
                                    .choose(MimeType.allOf())
                                    .countable(true)
                                    .maxSelectable(1)
                                    .gridExpectedSize(getResources().getDimensionPixelSize(R.dimen.grid_expected_size))
                                    .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
                                    .thumbnailScale(0.85f)
                                    .imageEngine(new GlideEngine())
                                    .forResult(REQUEST_CODE_CHOOSE);
                        }

                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        } else if (id == R.id.user_info_update_btn) {
            setResult(RESULT_OK);
            finish();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_CHOOSE && resultCode == RESULT_OK) {
//            mSelected = Matisse.obtainResult(data);

            Log.d("Matisse", "mSelected: " + mSelected);
        }
    }
}