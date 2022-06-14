package com.ammar.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class itemform extends AppCompatActivity {
    Spinner combo;
    Button btnsubmitbrg;
    TextInputEditText nama_brg, quantity;
    private String namabar, kuantitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemform);

        nama_brg = findViewById(R.id.nama_bar);
        quantity = findViewById(R.id.kuantitas_brg);
        combo = findViewById(R.id.spinnerbarang);
        btnsubmitbrg = findViewById(R.id.btnsubmitbrg);
        btnsubmitbrg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View notif) {
                namabar = nama_brg.getText().toString();
                kuantitas = quantity.getText().toString();

                if (notif.getId() == R.id.btnsubmitbrg) {
                    if (namabar.equals("")) {
                        Toast.makeText(getApplicationContext(), "nama barang tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    }else if (kuantitas.equals("")) {
                        Toast.makeText(getApplicationContext(), "Kuantitas barang tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "berhasil memasukkan Barang baru!", Toast.LENGTH_SHORT).show();
                    }
                }

            }

        });
    }

    public void main(View view) { startActivity(new Intent(itemform.this, MainActivity.class));
    }
}