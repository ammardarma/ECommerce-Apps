package com.ammar.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

    }

    public void staff(View view) { startActivity(new Intent(MainActivity1.this, newstaffform.class));
    }

    public void stock(View view) { startActivity(new Intent(MainActivity1.this, itemform.class));
    }
}