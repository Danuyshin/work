package com.example.work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class rostov extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rostov);
    }
    public void  back(View v){
        Intent intent = new Intent(this, MainActivity.class);
// Выполняем переход
        startActivity(intent);
    }
}