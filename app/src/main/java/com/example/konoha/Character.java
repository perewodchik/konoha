package com.example.konoha;

public class Character {
    public String name;
    private int age;
    public int getAge(){
        return age;
    }
    Character(String name, int age){
        this.name = name;
        this.age = age;
    }
}
