package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new  Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //ทำไรก็ได้ในช่วงดีเล
                Intent intent = new Intent(SplashActivity.this , LoginActivity.class);//เรียกหน้า
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
