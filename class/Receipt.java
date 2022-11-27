package com.example.test;
import java.io.*;
import static com.example.test.Ingredients.uan;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.IOException;

public class Receipt extends AppCompatActivity {

    EditText number, personName, address;
    public static String pizzaName;
    public static String pizzaName2;
    public static int prisePizza;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = new Intent(this, MainActivity.class);
        if (prisePizza == 0) {
            startActivity(intent);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        TextView name = findViewById(R.id.textPizzaName);
        TextView name2 = findViewById(R.id.textPizzaName2);
        TextView name3 = findViewById(R.id.textPizzaName3);
        name.setText(pizzaName);
        name3.setText(prisePizza + uan);
        name2.setText(pizzaName2);

        number = findViewById(R.id.editTextPhone);
        personName = findViewById(R.id.editTextTextPersonName);
        address = findViewById(R.id.editTextTextPersonAddress);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button button5 = findViewById(R.id.button6);
        button5.setOnClickListener(view -> startActivity(intent));

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(view -> {
            String date = "Назва:\n"+pizzaName+"\nІндігрієнти:\n"+pizzaName2+"\nЦіна:\n"+prisePizza + uan+"\nІм'я клієнта:\n"+personName.getText().toString()+"\nАдрес:\n"+address.getText().toString()+"\nНомер телефону:\n"+number.getText().toString();
            saveData("check.txt",date);
            Intent end= new Intent(this, End.class);
            End.endData =date;
            startActivity(end);
        });

    }

    public void saveData(String fileName, String data){
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(openFileOutput(fileName,MODE_APPEND)));
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}