package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    int answer = 0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /*/
        Button box1 = findViewById((R.id.chiffre1));
        Button box2 = findViewById((R.id.chiffre2));
        int chiffre1 =(int)(Math.random()*100);
        int chiffre2 =(int)(Math.random()*100);
        answer = chiffre1+chiffre2;
        box1.setText(String.valueOf(chiffre1));
        box2.setText(String.valueOf(chiffre2));
*/
    }
    /*public void onButtonPress(View v){
        TextView inputBox = findViewById(R.id.boxNumber);
        TextView tvbox1 = findViewById((R.id.chiffre1));
        TextView tvbox2 = findViewById((R.id.chiffre2));

        Button res = findViewById(R.id.res);
        Button box1 = (Button)tvbox1;
        Button box2 = (Button)tvbox2;
        CharSequence inputEnChar = inputBox.getText();
        int inputInt;
        try {
            inputInt = Integer.parseInt(inputEnChar.toString());
        }catch(Exception e){
            return;
        }
        //Log.d("lue: ",inputEnChar.toString());
        //Vérifier le calcul
        if(inputInt == answer){
            res.setText(":-)");
        }else{
            res.setText(":-(");
        }

        //Initialiser le prochain calcul
        int chiffre1 =(int)(Math.random()*100);
        int chiffre2 =(int)(Math.random()*100);
        Toast.makeText(this,String.valueOf(answer),Toast.LENGTH_LONG).show();
        answer = chiffre1+chiffre2;
        box1.setText(String.valueOf(chiffre1));
        box2.setText(String.valueOf(chiffre2));

        inputBox.setText("");


    }*/
    public void lancerPlus(View v){
        Intent i = new Intent(this, Addition.class);
        startActivity(i);
    }
    public void lancerMoins(View v){
        Intent i = new Intent(this , Soustraction.class);
        startActivity(i);
    }
    public void lancerFois(View v){
        Intent i = new Intent(this , Multiplication.class);
        startActivity(i);
    }
    public void lancerDiv(View v){
        Intent i = new Intent(this , Division.class);
        startActivity(i);
    }
}