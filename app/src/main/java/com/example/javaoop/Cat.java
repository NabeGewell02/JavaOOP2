package com.example.javaoop;

import android.util.Log;
public class Cat extends Animal{
    int age;
    String name;

    String color;
    String breed;

    public Cat(){

    }

    public Cat(int age, String name, String color, String breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }
    public void talk(){
        Log.i("talk()","Meow! My name is " + name
                + " and I'm " + age + " years old. Also I'm " + color + " " + breed);

    }
    public void initFields(){

    }
}
