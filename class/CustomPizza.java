package com.example.test;

import static com.example.test.Ingredients.p5;
import static com.example.test.Ingredients.uan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CustomPizza extends AppCompatActivity {

    int[] i = new int[16];

    int prise = 0;
    String[] ingredientsName = {
            "","маслини","ананаси","сирний соус","гострий соус","італійські трави","пармезан","моцарела","салямі","мисливські ковбаси","свинина","курка","болгарський перець","помідори","гриби","кукурудза"
    };
    String ingredientsFinale="Основа для піци ";
    Button button7;
    RadioButton radioButton;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_pizza);
        i[0]=59;
        button7 = findViewById(R.id.button7);
        button7.setText("59" + uan);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Intent intent = new Intent(this, MainActivity.class);
        Button button5 = findViewById(R.id.button6);
        button5.setOnClickListener(view -> startActivity(intent));

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Intent goNext = new Intent(this, Receipt.class);

        button7.setOnClickListener(view -> {
            ingredientsFinaleVoid();
            Receipt.pizzaName = p5;
            Receipt.prisePizza = prise;
            Receipt.pizzaName2 = ingredientsFinale;
                    startActivity(goNext);
        });

    }

    @SuppressLint("SetTextI18n")
    public void checkButton(View view) {
        RadioGroup group = findViewById(R.id.radioGroup16);
        int radioId = group.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[0] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }

    @SuppressLint("SetTextI18n")
    public void checkButton2(View view) {
        RadioGroup group2 = findViewById(R.id.radioGroup2);
        int radioId = group2.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[1] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton3(View view) {
        RadioGroup group3 = findViewById(R.id.radioGroup3);
        int radioId = group3.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[2] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton4(View view) {
        RadioGroup  group4 = findViewById(R.id.radioGroup4);
        int radioId = group4.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[3] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton5(View view) {
        RadioGroup  group5 = findViewById(R.id.radioGroup5);
        int radioId = group5.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[4] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton6(View view) {
        RadioGroup  group6 = findViewById(R.id.radioGroup6);
        int radioId = group6.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[5] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton7(View view) {
        RadioGroup group7 = findViewById(R.id.radioGroup7);
        int radioId = group7.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[6] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton8(View view) {
        RadioGroup group8 = findViewById(R.id.radioGroup8);
        int radioId = group8.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[7] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton9(View view) {
        RadioGroup  group9 = findViewById(R.id.radioGroup9);
        int radioId = group9.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[8] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton10(View view) {
        RadioGroup group10 = findViewById(R.id.radioGroup10);
        int radioId = group10.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[9] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton11(View view) {
        RadioGroup group11 = findViewById(R.id.radioGroup11);
        int radioId = group11.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[10] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton12(View view) {
        RadioGroup group12 = findViewById(R.id.radioGroup12);
        int radioId = group12.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[11] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton13(View view) {
        RadioGroup group13 = findViewById(R.id.radioGroup13);
        int radioId = group13.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[12] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton14(View view) {
        RadioGroup group14 = findViewById(R.id.radioGroup14);
        int radioId = group14.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[13] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton15(View view) {
        RadioGroup group15 = findViewById(R.id.radioGroup15);
        int radioId = group15.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[14] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }
    @SuppressLint("SetTextI18n")
    public void checkButton16(View view) {
        RadioGroup group16 = findViewById(R.id.radioGroup);
        int radioId = group16.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        i[15] = Integer.parseInt(radioButton.getText().toString());
        priseEdit();
        button7.setText(prise + uan);
    }

public  void ingredientsFinaleVoid(){
        for (int num=1;num<16;num++){
            if(i[num] != 0){
                ingredientsFinale = ingredientsFinale.concat(ingredientsName[num]) +" ";
            }
        }
    ingredientsFinale =ingredientsFinale+".";
}
    public void priseEdit() {
        prise = 0;
        for (int num : i) prise = prise + num;
    }
}