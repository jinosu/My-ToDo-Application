package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.*;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button clickButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast toast = Toast.makeText(LoginActivity.this,"Welcome to My ToDo application!",Toast.LENGTH_SHORT );
        toast.show();

    }



}
