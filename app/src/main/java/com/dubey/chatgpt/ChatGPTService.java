package com.dubey.chatgpt;

import com.dubey.chatgpt.postdata.Data;
import com.dubey.chatgpt.response.AI_Response;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ChatGPTService {

    @Headers(
            {"Content-Type: application/json",
                    "Authorization: "+Constants.API_KEY}
                    )
    @POST("v1/chat/completions")
    Call<AI_Response> postQuestion(@Body Data data);
}
