package com.projectnull.practice;

public class Cat extends Animal implements Sound {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {

        System.out.println("냥~");
    }
}
