package com.projectnull.practice;

public class Dog extends Animal implements Sound {

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){

        System.out.println("멍!");
    }

}
