package com.projectnull.practice;

public abstract class Animal{

    String name;

    public Animal(String name){
        this.name = name;
    }

    protected Animal() {}

    public void introduce(){
        System.out.println("이름은 " + name + " 입니다.");
    }
}
