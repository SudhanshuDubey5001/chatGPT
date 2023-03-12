package com.dubey.chatgpt.postdata;

import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("model")
    private String model = "gpt-3.5-turbo";

    @SerializedName("messages")
    private MessagesPOST[] messages;

    @SerializedName("temperature")
    private double temperature;

    public Data(MessagesPOST[] messages, double temperature) {
        this.model = "gpt-3.5-turbo";
        this.messages = messages;
        this.temperature = temperature;
    }
}
