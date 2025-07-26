package com.projectnull.practice;

public class Application {

    public static void main(String[] args) {

//        Dog dog = new Dog("하양이");
//
//        dog.makeSound();
//        dog.introduce();
//
//        Cat cat = new Cat("까망이");
//
//        cat.makeSound();
//        cat.introduce();

        //배열로 해보겠음
        Sound[] animals = new Sound[5];

        animals[0] = new Dog("일멍이!");
        animals[1] = new Cat("이냥이~~");
        animals[2] = new Dog("삼멍이!!!");
        animals[3] = new Cat("사냥이~~~~");
        animals[4] = new Dog("오멍이!!!!!");

        for (int i = 0; i< animals.length; i++) {

            animals[i].makeSound();

            //introduce() 다운캐스팅!!!!!!!!!!!!
                                      //Dog 아님
            if (animals[i] instanceof Animal) {
                ((Animal) animals[i]).introduce();
            }
        }

    }


}
