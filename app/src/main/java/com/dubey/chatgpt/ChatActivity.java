package com.dubey.chatgpt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dubey.chatgpt.postdata.Data;
import com.dubey.chatgpt.postdata.MessagesPOST;
import com.dubey.chatgpt.response.AI_Response;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChatActivity extends AppCompatActivity {

    String ask;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        text = findViewById(R.id.chat_input_textfield);
        TextView viewResponse = findViewById(R.id.textResponse);
        Button sendButton = findViewById(R.id.chat_send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ask = text.getText().toString();
                Log.d("myLog", "Asking---->" + ask);

                MessagesPOST[] m = new MessagesPOST[1];

                m[0] = new MessagesPOST(ask);

                Log.d("myLog", "Starting sending request....");

                RetrofitBuilder.build().postQuestion(new Data(m, 0.7))
                        .enqueue(new Callback<AI_Response>() {
                            @Override
                            public void onResponse(Call<AI_Response> call, Response<AI_Response> response) {
                                Log.d("myLog", "Response = " + response.toString());
                                if (response.isSuccessful()) {
                                    Log.d("myLog", "success response");
                                    AI_Response ai_response = response.body();
                                    String StringResponse = ai_response.getChoices()[0].getMessage().getContent();
                                    Log.d("myLog", StringResponse);
                                    viewResponse.setText(StringResponse);
                                } else {
                                    Log.d("myLog", "Error: " + response.errorBody().toString());
                                }
                            }

                            @Override
                            public void onFailure(Call<AI_Response> call, Throwable t) {
                                Log.d("myLog", t.getMessage());
                            }
                        });
            }
        });
    }
}