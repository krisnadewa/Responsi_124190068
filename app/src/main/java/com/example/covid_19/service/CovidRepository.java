package com.example.covid_19.service;

import com.example.covid_19.model.faskes.FaskesResponse;
import com.example.covid_19.model.harian.HarianResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CovidRepository {
    @GET("rekapitulasi_v2/jabar/harian")
    Call<HarianResponse> getHarianDiscover();

    @GET("sebaran_v2/jabar/faskes")
    Call<FaskesResponse> getFaskesDiscover();
}
