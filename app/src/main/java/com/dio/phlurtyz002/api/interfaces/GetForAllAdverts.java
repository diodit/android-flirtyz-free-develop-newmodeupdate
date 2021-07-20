package com.dio.phlurtyz002.api.interfaces;

import com.dio.phlurtyz002.api.models.AllAdverts;
import com.dio.phlurtyz002.api.models.AllCategory;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface GetForAllAdverts {


    @GET
    Call<AllAdverts> getAllData(@Url String url);
}
