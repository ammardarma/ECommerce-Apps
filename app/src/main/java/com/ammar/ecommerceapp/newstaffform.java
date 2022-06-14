package com.ammar.ecommerceapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class newstaffform extends AppCompatActivity {

    private TextInputEditText namaleng, newstaffuser, passstaff, confpassstaff;
    private Button btnsubmit;

    private String namauser, usernewstaff,password, confpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newstaffform);


        namaleng = findViewById(R.id.namaleng);
        newstaffuser = findViewById(R.id.newstaffuser);
        passstaff = findViewById(R.id.passstaff);
        confpassstaff = findViewById(R.id.conpassstaff);
        btnsubmit = findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View notif) {
                namauser = namaleng.getText().toString();
                usernewstaff = newstaffuser.getText().toString();
                password = passstaff.getText().toString();
                confpassword = confpassstaff.getText().toString();

                if (notif.getId() == R.id.btnsubmit) {
                    if (namaleng.equals("")) {
                        Toast.makeText(getApplicationContext(), "nama tidak boleh kosong!", Toast.LENGTH_SHORT).show();

                    }else if (usernewstaff.equals("")) {
                        Toast.makeText(getApplicationContext(), "User tidak boleh kosong!", Toast.LENGTH_SHORT).show();

                    }else if (password.equals("")) {
                        Toast.makeText(getApplicationContext(), "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getApplicationContext(), "berhasil mendaftarkan Staff baru!", Toast.LENGTH_SHORT).show();
                    }
                }

            }

        });
    }
    public void main(View view) { startActivity(new Intent(newstaffform.this, MainActivity.class));
    }



}