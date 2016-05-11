package com.rzk.android_monitor_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (TextInputEditText) findViewById(R.id.input_email);
        password = (TextInputEditText) findViewById(R.id.input_password);
    }

    public void login(View view) {
        //create login process
        Intent intent = new Intent(this, PriceInputActivity.class);
        startActivity(intent);
    }
}
