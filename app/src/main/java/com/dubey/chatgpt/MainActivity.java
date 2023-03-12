package com.dubey.chatgpt;

import android.content.Intent;
import android.os.Bundle;

import com.dubey.chatgpt.postdata.Data;
import com.dubey.chatgpt.postdata.MessagesPOST;
import com.dubey.chatgpt.response.AI_Response;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.dubey.chatgpt.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent in = new Intent(this, ChatActivity.class);
        startActivity(in);
    }
}
