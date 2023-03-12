package com.dubey.chatgpt.response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public class AI_Response {

//    @SerializedName("id")
//    private String id;
//    @SerializedName("object")
//    private String object;
//    @SerializedName("created")
//    private long created;
//    @SerializedName("model")
//    private String model;
//    @SerializedName("usage")
//    private Usage usage;

    @SerializedName("choices")
    private Choices[] choices;

    public Choices[] getChoices() {
        return choices;
    }
}
