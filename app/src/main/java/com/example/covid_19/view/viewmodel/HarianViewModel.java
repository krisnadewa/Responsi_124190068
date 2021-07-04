package com.example.covid_19.view.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.covid_19.model.harian.HarianContentItem;
import com.example.covid_19.model.harian.HarianResponse;
import com.example.covid_19.service.ApiMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HarianViewModel extends ViewModel {
    private static final String TAG = "HarianViewModel";
    private MutableLiveData<ArrayList<HarianContentItem>> harianContentItems;
    ApiMain apiMain = new ApiMain();

    public HarianViewModel(){
        harianContentItems = new MutableLiveData<>();
    }

    public MutableLiveData<ArrayList<HarianContentItem>> getHarianContentItems(){
        return harianContentItems;
    }

    public void setHarianDiscover(){
        apiMain.getApiHarian().getHarianDiscover().enqueue(new Callback<HarianResponse>() {
            @Override
            public void onResponse(Call<HarianResponse> call, Response<HarianResponse> response) {
                harianContentItems.setValue(response.body().getData().getContent());
            }

            @Override
            public void onFailure(Call<HarianResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: FAIL");
            }
        });
    }
}