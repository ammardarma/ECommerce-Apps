package com.ammar.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class productlist extends AppCompatActivity {

    TextView txtShirt;
    TextView txtFormals;
    TextView txtBottomWear;
    TextView txtShoes;
    LinearLayout shirt,formals,bottomWear,shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);
        getSupportActionBar().hide();
        txtShirt = findViewById(R.id.txtshirt);
        txtFormals = findViewById(R.id.txtformal);
        txtBottomWear = findViewById(R.id.txtbottomwear);
        txtShoes = findViewById(R.id.txtshoes);
        shirt = findViewById(R.id.tShirt);
        formals = findViewById(R.id.formalClothes);
        bottomWear = findViewById(R.id.bottomWear);
        shoes = findViewById(R.id.shoes);

        if(getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            int resShirt = bundle.getInt("tShirt");
            shirt.setBackgroundResource(resShirt);

            int resFormals = bundle.getInt("formals");
            formals.setBackgroundResource(resFormals);

            int resBottomWear = bundle.getInt("bottomwear");
            bottomWear.setBackgroundResource(resBottomWear);

            int resShoes = bundle.getInt("shoes");
            shoes.setBackgroundResource(resShoes);
        }

        txtShirt.setOnClickListener( v ->{
            Intent intent = new Intent(this, previewlist.class);
            intent.putExtra("foto", R.drawable.tshirtman);
            intent.putExtra("nama", "Dior");
            intent.putExtra("harga", "$3512");
            intent.putExtra("foto1", R.drawable.tshirtwoman);
            intent.putExtra("nama1", "Nike");
            intent.putExtra("harga1", "$442");
            startActivity(intent);
        });

        txtFormals.setOnClickListener( v -> {
            Intent intent = new Intent(this, previewlist.class);
            intent.putExtra("foto", R.drawable.formalclothesman);
            intent.putExtra("nama", "Gucci");
            intent.putExtra("harga", "$12222");
            intent.putExtra("foto1", R.drawable.formalclotheswoman);
            intent.putExtra("nama1", "Bata");
            intent.putExtra("harga1", "$122");
            startActivity(intent);
        });

        txtBottomWear.setOnClickListener(v -> {
            Intent intent = new Intent(this, previewlist.class);
            intent.putExtra("foto", R.drawable.bottomman);
            intent.putExtra("nama", "Black ID");
            intent.putExtra("harga", "$200");
            intent.putExtra("foto1", R.drawable.bottomwoman);
            intent.putExtra("nama1", "Dior");
            intent.putExtra("harga1", "$3512");
            startActivity(intent);
        });

        txtShoes.setOnClickListener(v -> {
            Intent intent = new Intent(this, previewlist.class);
            intent.putExtra("foto", R.drawable.shoesman);
            intent.putExtra("nama", "Channel");
            intent.putExtra("harga", "$1121");
            intent.putExtra("foto1", R.drawable.shoeswoman);
            intent.putExtra("nama1", "Yezzy");
            intent.putExtra("harga1", "$2101");
            startActivity(intent);
        });


    }
}