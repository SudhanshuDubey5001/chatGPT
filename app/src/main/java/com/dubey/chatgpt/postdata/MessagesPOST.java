package com.dubey.chatgpt.postdata;

import com.google.gson.annotations.SerializedName;

public class MessagesPOST {

    @SerializedName("role")
    private String role;

    @SerializedName("content")
    private String content;


    public MessagesPOST(String content) {
        this.role = "user";
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
