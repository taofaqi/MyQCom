package com.ttpai.myqcom.ui.viewholder;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.ttpai.myqcom.R;
import com.ttpai.myqcom.bean.RankingBean;
import com.ttpai.myqcom.bean.VipListBean;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VipListViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.vip_list_user_icon)
    SimpleDraweeView mUserIcon;
    @BindView(R.id.vip_list_username)
    TextView mUsername;
    @BindView(R.id.vip_list_phone)
    TextView mPhone;


    public VipListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(VipListBean vipListBean) {
        mUserIcon.setImageURI(Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525326160601&di=14c98ae6839bf58691e0c46bc462e2a3&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Feaf81a4c510fd9f95e3fd930292dd42a2834a4bb.jpg"));

    }
}
