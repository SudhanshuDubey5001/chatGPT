package com.dubey.chatgpt.response;

import com.google.gson.annotations.SerializedName;

public class Message {

    @SerializedName("content")
    private String content;

    public String getContent() {
        return content;
    }
}
