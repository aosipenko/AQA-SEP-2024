package org.prog.collections;

import org.prog.inheritance.Car;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TODO: Create list of 1000 cars
//TODO: Pain each car RANDOMLY in one for following colors: red, green, blue
//TODO: put cars in separate lists based on their colors
//TODO: print size of each list
public class ListHomeWork {
    public static void carListDemo() {

        carListDemo();
        }
        public static void ListHomeWork() {



        Random random = new Random();
        List<String> cars = new ArrayList<>();

        for (int i = 0; i < 333; i++) {
            cars.add("red");

        }
        for (int i = 0; i < 333; i++) {
            cars.add("green");
        }
        for (int i = 0; i < 334; i++) {
            cars.add("yellow");
        }
        for (int i = 0; i < 1; i++) {
            cars.add("white");
        }
        int redCount   = 0;
        int greenCount = 0;
        int yellowCount = 0;
        int whiteCount = 1;

        for (String car : cars) {
            if (car.equals("red")) {
                redCount++;
            } else if (car.equals("green")) {
                greenCount++;
            } else if (car.equals("yellow")) {
                yellowCount++;
            } else if (car.equals("white")) {
            }
        }
        System.out.println("Cars " + cars.size());
        System.out.println("White car Boss: " + whiteCount);
        System.out.println("Red cars Firefighters: " + redCount);
        System.out.println("Green cars Military: " + greenCount);
        System.out.println("Yellow cars Volunteer: " + yellowCount);

    }
}

