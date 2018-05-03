package com.ttpai.myqcom.ui.viewholder;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.ttpai.myqcom.R;
import com.ttpai.myqcom.bean.RankingBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopViewHolder extends RecyclerView.ViewHolder {


    @BindView(R.id.rank_title_second_img)
    ImageView mTitleSecondImg;
    @BindView(R.id.rank_second_user_icon)
    SimpleDraweeView mSecondUserIcon;
    @BindView(R.id.rank_second_title_img)
    TextView mSecondTitleImg;
    @BindView(R.id.rank_second_username)
    TextView mSecondUsername;
    @BindView(R.id.rank_second_phone)
    TextView mSecondPhone;
    @BindView(R.id.ranking_second_layout)
    RelativeLayout mSecondLayout;
    @BindView(R.id.rank_title_first_img)
    ImageView mTitleFirstImg;
    @BindView(R.id.rank_first_user_icon)
    SimpleDraweeView mFirstUserIcon;
    @BindView(R.id.rank_first_title_img)
    TextView mFirstTitleImg;
    @BindView(R.id.rank_first_username)
    TextView mFirstUsername;
    @BindView(R.id.rank_first_phone)
    TextView mFirstPhone;
    @BindView(R.id.ranking_first_layout)
    RelativeLayout mFirstLayout;
    @BindView(R.id.rank_title_third_img)
    ImageView mTitleThirdImg;
    @BindView(R.id.rank_third_user_icon)
    SimpleDraweeView mThirdUserIcon;
    @BindView(R.id.rank_third_title_img)
    TextView mThirdTitleImg;
    @BindView(R.id.rank_third_username)
    TextView rankThirdUsername;
    @BindView(R.id.rank_third_phone)
    TextView mThirdPhone;
    @BindView(R.id.ranking_third_layout)
    RelativeLayout mThirdLayout;


    public TopViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(List<RankingBean> rankingBeans) {

        mFirstUserIcon.setImageURI(Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525326160601&di=14c98ae6839bf58691e0c46bc462e2a3&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Feaf81a4c510fd9f95e3fd930292dd42a2834a4bb.jpg"));
        mSecondUserIcon.setImageURI(Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525326160601&di=14c98ae6839bf58691e0c46bc462e2a3&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Feaf81a4c510fd9f95e3fd930292dd42a2834a4bb.jpg"));
        mThirdUserIcon.setImageURI(Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525326160601&di=14c98ae6839bf58691e0c46bc462e2a3&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Feaf81a4c510fd9f95e3fd930292dd42a2834a4bb.jpg"));
    }
}
