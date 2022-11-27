package com.example.test;

import static com.example.test.Ingredients.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int prise;
    RadioGroup group1, group2, group3, group4;
    RadioButton radioButton;
    Button button_1, button2, button3, button4, button5;
    ImageButton imageButton1, imageButton2, imageButton3, imageButton4, imageButton5;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group1 = findViewById(R.id.radioGroupPizza1);

        imageButton1 = findViewById(R.id.imageButton);
        imageButton1.setOnClickListener(view -> {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, "Індігрієнти: " + pizza1, duration).show();
        });

        group2 = findViewById(R.id.radioGroupPizza2);

        imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(view -> {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, "Індігрієнти: " + pizza2, duration).show();
        });

        group3 = findViewById(R.id.radioGroupPizza3);

        imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(view -> {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, "Індігрієнти: " + pizza3, duration).show();
        });

        group4 = findViewById(R.id.radioGroupPizza4);

        imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(view -> {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, "Індігрієнти: " + pizza4, duration).show();
        });

        imageButton5 = findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(view -> {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, "Індігрієнти: " + pizza5, duration).show();
        });

        Intent intent = new Intent(this, Receipt.class);

        button_1 = findViewById(R.id.button);
        button_1.setOnClickListener(view -> {
            Receipt.prisePizza = prise;
            Receipt.pizzaName = p1;
            Receipt.pizzaName2 = pizza1;
            if (prise != 0) startActivity(intent);
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            Receipt.pizzaName = p2;
            Receipt.prisePizza = prise;
            Receipt.pizzaName2 = pizza2;
            if (prise != 0) startActivity(intent);

        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            Receipt.pizzaName = p3;
            Receipt.prisePizza = prise;
            Receipt.pizzaName2 = pizza3;
            if (prise != 0) startActivity(intent);
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            Receipt.pizzaName = p4;
            Receipt.pizzaName2 = pizza4;
            Receipt.prisePizza = prise;
            if (prise != 0) startActivity(intent);
        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(view -> {
            Intent custom = new Intent(this, CustomPizza.class);
            startActivity(custom);
        });

    }

    @SuppressLint("SetTextI18n")
    public void checkButton(View view) {
        int radioId = group1.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        prise = Integer.parseInt(radioButton.getText().toString());
        button_1.setText(radioButton.getText() + uan);
    }

    @SuppressLint("SetTextI18n")
    public void checkButton2(View view) {
        int radioId = group2.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        prise = Integer.parseInt(radioButton.getText().toString());
        button2.setText(radioButton.getText() + uan);
    }

    @SuppressLint("SetTextI18n")
    public void checkButton3(View view) {
        int radioId = group3.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        prise = Integer.parseInt(radioButton.getText().toString());
        button3.setText(radioButton.getText() + uan);
    }

    @SuppressLint("SetTextI18n")
    public void checkButton4(View view) {
        int radioId = group4.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        prise = Integer.parseInt(radioButton.getText().toString());
        button4.setText(radioButton.getText() + uan);
    }
}