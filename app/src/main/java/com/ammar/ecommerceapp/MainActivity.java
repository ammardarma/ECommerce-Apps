package com.ammar.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button btnStaffLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnStaffLogin = findViewById(R.id.btnLoginStaff);
        getSupportActionBar().hide();

        btnStaffLogin.setOnClickListener(v -> {
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
        });
    }
}