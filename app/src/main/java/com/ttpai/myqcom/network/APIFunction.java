package com.ttpai.myqcom.network;


import com.ttpai.myqcom.bean.LoginBean;
import com.ttpai.myqcom.bean.RankingBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by taofa on 2018/5/3.
 * <p>
 * API 接口
 */

public interface APIFunction {

//    @GET(URLConfig.zhihu_url)
//    Observable<News> getZhihu();

    @FormUrlEncoded
    @POST(URLConfig.login_url)
    Observable<LoginBean> Login(@Field("phone") String phone, @Field("pwd") String pwd);

    @GET(URLConfig.getRanking_url)
    Observable<List<RankingBean>> getRankingList();
}
