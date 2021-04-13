package com.weimont.indicadordollarappandroid.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.weimont.indicadordollarappandroid.network.ApiClient;
import com.weimont.indicadordollarappandroid.network.ApiService;
import com.weimont.indicadordollarappandroid.responses.IndicadorResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DolarIndicadorRepository {

    private ApiService apiService;

    public DolarIndicadorRepository(){
        apiService = ApiClient.getRetrofit().create(ApiService.class);
    }

    public LiveData<IndicadorResponse> getDolarIndicador(){
        MutableLiveData<IndicadorResponse> data = new MutableLiveData<>();
        apiService.getDolarIndicador().enqueue(new Callback<IndicadorResponse>() {
            @Override
            public void onResponse(Call<IndicadorResponse> call, Response<IndicadorResponse> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<IndicadorResponse> call, Throwable t) {
                data.setValue(null);

            }
        });

        return null;
    }
}
