package com.mensajeriaapi22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class privados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directo);
    }
    public void irPublicos(View vista){
        Intent miIntent =new Intent(this, publicos.class);
        startActivity(miIntent);
    }

}