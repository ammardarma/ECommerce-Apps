package com.ammar.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class category extends AppCompatActivity {
TextView menClothing, womenClothing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().hide();
        menClothing = findViewById(R.id.mensclothing);
        womenClothing =findViewById(R.id.womensclothing);

        menClothing.setOnClickListener(v -> {
            Intent intent = new Intent(this, productlist.class);
            intent.putExtra("tShirt", R.drawable.tshirtman);
            intent.putExtra("formals", R.drawable.formalclothesman);
            intent.putExtra("bottomwear", R.drawable.bottomman);
            intent.putExtra("shoes", R.drawable.shoesman);
            startActivity(intent);
        });

        womenClothing.setOnClickListener(v -> {
            Intent intent = new Intent(this, productlist.class);
            intent.putExtra("tShirt", R.drawable.tshirtwoman);
            intent.putExtra("formals", R.drawable.formalclotheswoman);
            intent.putExtra("bottomwear", R.drawable.bottomwoman);
            intent.putExtra("shoes", R.drawable.shoeswoman);
            startActivity(intent);
        });
    }
}