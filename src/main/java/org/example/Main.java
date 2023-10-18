package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Cats cat1 = new Cats("Barsic", 5);
//        cat1.infoCat();
//        System.out.println();
//        Plate plate = new Plate(6);
//        plate.info();
//
//        cat1.eat(plate);
//
//        plate.info();
//
//        cat1.eat(plate);
        Human human = new Human("Василий", new Random().nextInt(20));

        Plate plate = new Plate(new Random().nextInt(30));
        plate.info();

        ArrayList<Cats> cats = new ArrayList<>();
        for (int i = 1;i <= 10;i++){
            cats.add(new Cats("cat" + Integer.toString(i),new Random().nextInt(7)));
        }

//        cats.forEach(n-> n.infoCat());

        cats.forEach(n->n.eat(plate));

        cats.forEach(n->n.infoSatiety());

        plate.info();

        human.infoHuman();

        plate.addFood(human);

        plate.info();

        human.infoHuman();

        plate.addFood(human);


    }
}