package com.example.myapplication;


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
public class Division extends AppCompatActivity{
    int answer = 0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.division);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button box1 = findViewById((R.id.chiffre1));
        Button box2 = findViewById((R.id.chiffre2));
        int chiffre1 =1+(int)(Math.random()*40);//y
        int chiffre2 =(int)(Math.random()*(250/chiffre1));//est ici la réponse
        answer = chiffre2;
        int numerateur = chiffre2*chiffre1;
        box1.setText(String.valueOf((numerateur)));
        box2.setText(String.valueOf(chiffre1));

    }
    public void onButtonPress(View v){
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
        int chiffre1 =1+(int)(Math.random()*40);//y
        int chiffre2 =(int)(Math.random()*(250/chiffre1));//est ici la réponse
        Toast.makeText(this,String.valueOf(answer),Toast.LENGTH_LONG).show();
        answer = chiffre2;
        int numerateur = chiffre2*chiffre1;
        box1.setText(String.valueOf((numerateur)));
        box2.setText(String.valueOf(chiffre1));

        inputBox.setText("");


    }
}

