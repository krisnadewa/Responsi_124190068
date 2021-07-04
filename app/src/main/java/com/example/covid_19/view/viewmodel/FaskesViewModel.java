package com.example.covid_19.view.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.covid_19.model.faskes.FaskesDataItem;
import com.example.covid_19.model.faskes.FaskesResponse;
import com.example.covid_19.service.ApiMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FaskesViewModel extends ViewModel {
    private static final String TAG = "FaskesViewModel";
    private MutableLiveData<ArrayList<FaskesDataItem>> faskesDataItems;
    ApiMain apiMain = new ApiMain();

    public FaskesViewModel(){
        faskesDataItems = new MutableLiveData<>();
    }

    public MutableLiveData<ArrayList<FaskesDataItem>> getFaskesDataItems(){
        return faskesDataItems;
    }

    public void setFaskesDiscover(){
        apiMain.getApiHarian().getFaskesDiscover().enqueue(new Callback<FaskesResponse>() {
            @Override
            public void onResponse(Call<FaskesResponse> call, Response<FaskesResponse> response) {
                faskesDataItems.setValue(response.body().getData());
            }

            @Override
            public void onFailure(Call<FaskesResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: FAIL");
            }
        });
    }
}
