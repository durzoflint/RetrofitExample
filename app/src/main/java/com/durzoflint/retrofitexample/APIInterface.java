package com.durzoflint.retrofitexample;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {


    @POST("post_sample.php")
    @FormUrlEncoded
    Call<SampleResponse> addSample(@Field("name") String name, @Field("email") String email,
                                   @Field("number") int number);
}