package com.example.work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void  moscow(View v){
        Intent intent = new Intent(this, moscow.class);
// Выполняем переход
        startActivity(intent);
    }
    public void  vladimir(View v){
        Intent intent = new Intent(this, vladimir.class);
// Выполняем переход
        startActivity(intent);
    }
    public void  suzdal(View v){
        Intent intent = new Intent(this,suzdal.class);
// Выполняем переход
        startActivity(intent);
    }
    public void  ivanovo(View v){
        Intent intent = new Intent(this, ivanovo.class);
// Выполняем переход
        startActivity(intent);
    }
    public void  kostroma(View v){
        Intent intent = new Intent(this, kostroma.class);
// Выполняем переход
        startActivity(intent);
    }
    public void  yaroslavl(View v){
        Intent intent = new Intent(this, yaroslavl.class);
// Выполняем переход
        startActivity(intent);
    }
    public void  rostov(View v){
        Intent intent = new Intent(this, rostov.class);
// Выполняем переход
        startActivity(intent);
    }
    public void  pereslavl(View v){
        Intent intent = new Intent(this, pereslavl.class);
// Выполняем переход
        startActivity(intent);
    }
    public void  sergiev(View v){
        Intent intent = new Intent(this, sergiev.class);
// Выполняем переход
        startActivity(intent);
    }

}