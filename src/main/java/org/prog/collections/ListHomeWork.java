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
            cars.add("black");
        }
        int redCount   = 0;
        int greenCount = 0;
        int blackCount = 0;

        for (String car : cars) {
            if (car.equals("red")) {
                redCount++;
            } else if (car.equals("green")) {
                greenCount++;
            } else if (car.equals("black")) {
                blackCount++;
            }
        }
        System.out.println("Red cars:" + redCount);
        System.out.println("Green cars:" + greenCount);
        System.out.println("Black cars:" + blackCount);
        System.out.println(cars.size());
    }
}

