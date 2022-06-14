package com.ammar.ecommerceapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class loginform extends AppCompatActivity {

    TextInputEditText username;
    TextInputEditText password;
    AppCompatButton btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginform);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.masuk);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String usernamein = username.getText().toString();
                String passwordin = password.getText().toString();

                if (usernamein.equals("Admin") && passwordin.equals("Admin")){
                    //login berhasil
                    Toast.makeText(getApplicationContext(), "Login Sukses",
                            Toast.LENGTH_SHORT) .show();
                    Intent intent = new Intent(loginform.this, MainActivity1.class);
                    loginform.this.startActivity(intent);
                    finish();
                }else{
                    //login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(loginform.this);
                    builder.setMessage("Username atau Password Anda Salah!!!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }

}