package com.dio.phlurtyz002.api.interfaces;

import com.dio.phlurtyz002.api.models.CLickAdvertsRequest;
import com.dio.phlurtyz002.api.models.CLickAdvertsResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ClickAdvert{
    @POST
    Call<CLickAdvertsResponse> create(@Body CLickAdvertsRequest cLickAdvertsRequest,
                                      @Url String url);
}
