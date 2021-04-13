package com.weimont.indicadordollarappandroid.network;


import com.weimont.indicadordollarappandroid.responses.IndicadorResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("dolar")
    Call<IndicadorResponse> getDolarIndicador();
}
