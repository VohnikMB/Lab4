package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class End extends AppCompatActivity {

    public static String endData;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
        TextView textView10 = findViewById(R.id.textView10);
        textView10.setText(endData+"\nДата:\n"+currentDateTimeString);
        Intent intent = new Intent(this, MainActivity.class);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonEnd =  findViewById(R.id.buttonEnd);
        buttonEnd.setOnClickListener(view -> startActivity(intent));
    }
}