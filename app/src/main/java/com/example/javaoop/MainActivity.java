package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(4, "Murzik", "black", "Scotland");
        myCat.talk();
        myCat.breathe();
        myCat.numberOfLeg = 4;
        Log.i("numbersOfLegs", String.valueOf(myCat.numberOfLeg));

        Cat cat = new Cat(2, "Puma", "white", "sfinks");

        Puma puma = new Puma();
        puma.name = "Leo";
        Log.i("breathe()", "My name is " + puma.name + " and " + puma.breathe());
        puma.breathe();
        puma.talk();
        puma.isAlive = true;

        Log.i("isAlive", String.valueOf(puma.isAlive));
    }
}