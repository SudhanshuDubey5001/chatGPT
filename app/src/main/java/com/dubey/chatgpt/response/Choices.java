package com.dubey.chatgpt.response;

import com.google.gson.annotations.SerializedName;

public class Choices {

    @SerializedName("message")
    private Message message;

    public Message getMessage() {
        return message;
    }
}
