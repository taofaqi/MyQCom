package com.ttpai.myqcom.ui.viewholder;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.ttpai.myqcom.R;
import com.ttpai.myqcom.bean.RankingBean;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NormalViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.rank_normal_user_icon)
    SimpleDraweeView mUserIcon;
    @BindView(R.id.ranking_normal_ranking_txt)
    TextView mRankingTxt;
    @BindView(R.id.ranking_normal_username)
    TextView mUsername;
    @BindView(R.id.ranking_normal_phone)
    TextView mPhone;
    @BindView(R.id.ranking_normal_line)
    View mLine;


    public NormalViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(RankingBean rankingBean) {
        mUserIcon.setImageURI(Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525326160601&di=14c98ae6839bf58691e0c46bc462e2a3&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Feaf81a4c510fd9f95e3fd930292dd42a2834a4bb.jpg"));

        if (rankingBean.showSplitLine) {
            if (mLine.getVisibility() == View.GONE)
                mLine.setVisibility(View.VISIBLE);
        } else {
            if (mLine.getVisibility() == View.VISIBLE)
                mLine.setVisibility(View.GONE);
        }
    }
}
