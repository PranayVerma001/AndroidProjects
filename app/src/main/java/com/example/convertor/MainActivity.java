package com.example.convertor;

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

    public void unit(View v){
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        startActivity(intent);

    }

    public void measure(View v){
        Intent intent = new Intent(MainActivity.this,Acitivity3.class);
        startActivity(intent);

    }
}
