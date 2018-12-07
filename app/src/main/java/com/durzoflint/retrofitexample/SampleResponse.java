package com.durzoflint.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class SampleResponse {

    @SerializedName("error")
    public String error;
    @SerializedName("message")
    public String message;
}
