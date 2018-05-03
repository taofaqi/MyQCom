package com.ttpai.myqcom.network;


import com.ttpai.myqcom.bean.News;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by taofa on 2018/5/3.
 * <p>
 * API 接口
 */

public interface APIFunction {

    @GET(URLConfig.zhihu_url)
    Observable<News> getZhihu();
}
