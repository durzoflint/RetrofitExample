package com.durzoflint.retrofitexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<SampleResponse> sampleCall = apiInterface.addSample("Abhinav Android", "abhinav@android.com", 123);
        sampleCall.enqueue(new Callback<SampleResponse>() {
            @Override
            public void onResponse(Call<SampleResponse> call, Response<SampleResponse> response) {
                Log.d("Abhinav onResponse", response.body().error + response.body().message);
            }

            @Override
            public void onFailure(Call<SampleResponse> call, Throwable t) {
                Log.d("Abhinav onFailure", t.toString());
            }
        });
    }
}