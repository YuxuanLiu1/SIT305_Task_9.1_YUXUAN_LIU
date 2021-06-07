package com.example.task_91;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.task_91.R;

public class MainActivity extends AppCompatActivity {

    Button Add, Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Add = findViewById(R.id.Add);
        Show = findViewById(R.id.Show);
    }

    public void AddNewPlace(View view) {

        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Map.class);
        startActivity(intent);

    }
}