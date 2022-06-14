package com.ammar.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class previewlist extends AppCompatActivity {

    ImageView image1,image2;
    TextView namaBarang;
    TextView hargaBarang;
    TextView namaBarang1;
    TextView hargaBarang1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previewlist);
        getSupportActionBar().hide();
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        namaBarang = findViewById(R.id.namaBarang);
        namaBarang1 = findViewById(R.id.namaBarang2);
        hargaBarang = findViewById(R.id.hargaBarang);
        hargaBarang1 = findViewById(R.id.hargaBarang2);

        if(getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();

            int foto1 = bundle.getInt("foto");
            int foto2 = bundle.getInt("foto1");
            image1.setImageResource(foto1);
            image2.setImageResource(foto2);
            namaBarang.setText(bundle.getString("nama"));
            namaBarang1.setText(bundle.getString("nama1"));
            hargaBarang.setText(bundle.getString("harga"));
            hargaBarang1.setText(bundle.getString("harga1"));

            image1.setOnClickListener(v -> {
                Intent intent = new Intent(this, detailproduct.class);
                intent.putExtra("foto", foto1);
                intent.putExtra("nama", bundle.getString("nama"));
                intent.putExtra("harga", bundle.getString("harga"));
                startActivity(intent);
            });

            image2.setOnClickListener(v -> {
                Intent intent = new Intent(this, detailproduct.class);
                intent.putExtra("foto", foto2);
                intent.putExtra("nama", bundle.getString("nama1"));
                intent.putExtra("harga", bundle.getString("harga1"));
                startActivity(intent);
            });

        }
    }
}