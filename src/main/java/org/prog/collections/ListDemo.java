package org.prog.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListDemo {

    public static void main(String[] args) {
        //[start_of_list] - ["d"] - ["e"] - ["g"] - ["f"] - ["end_of_list"]
//        LinkedList<String> strings2 = new LinkedList<>();
//        strings2.add("d"); //3
//        strings2.add("e"); //4
//        strings2.add("f");//5
        //0 -> "a"
        //1 -> "b"
        //2 -> "c"
//        List<String> sList = new ArrayList<>();
//        sList.add("a");// 0
//        sList.add("a");// 0
//        sList.add("b");// 1
//        sList.add("c");// 2
//        System.out.println("sList size " + sList.size());
//
//        System.out.println(sList.get(1));
//        sList.addAll(strings2);
//
//        System.out.println(sList.indexOf("d"));
//        Object[] strings = sList.toArray();

//        System.out.println(sList.get(5));
//        sList.remove("a");
//        sList.removeAll(strings2);
//        sList.remove(1);
//        System.out.println(">>>> " + sList.get(0));
//        carListDemo();
//    }
//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
//    public static void carListDemo() {
//        Random random = new Random();
//        List<Car> cars = new ArrayList<>();
//        List<Car> barelyUsedCars = new ArrayList<>();
//        List<Car> heavilyUsedCars = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            cars.add(new Car());
//        }
//
//        for (int i = 0; i < cars.size(); i++) {
//            cars.get(i).color = "black";
//            cars.get(i).milage = random.nextInt(100000);
//            random.nextInt(3);
//        }
//
//        for (int i = 0; i < cars.size(); i++) {
//            if (cars.get(i).milage > 50000) {
//                heavilyUsedCars.add(cars.get(i));
//                System.out.println("Car index is " + i);
//                System.out.println("A car with big milage! " + cars.get(i).milage);
//            } else {
//                barelyUsedCars.add(cars.get(i));
//            }
//        }
//
//        System.out.println("Used cars count: " + heavilyUsedCars.size());
//        System.out.println("Almost new cars count: " + barelyUsedCars.size());
        carListDemo();
    }

        public static void carListDemo() {
        Random random = new Random();
        List<String> cars = new ArrayList<>();

            for (int i = 0; i < 333; i++) {
                cars.add("red");

            }
            for (int i = 0; i < 333; i++) {
                cars.add("green");
            }
            for (int i = 0; i < 333; i++) {
                cars.add("yellow");
            }
            for (int i = 0; i < 1; i++) {
                cars.add("white");
            }
            int redCount   = 0;
            int greenCount = 0;
            int yellowCount = 0;
            int white = 1;

            for (String car : cars) {
                if (car.equals("red")) {
                    redCount++;
                } else if (car.equals("green")) {
                    greenCount++;
                } else if (car.equals("yellow")) {
                    yellowCount++;
                } else if (car.equals("white")) {
                    int whiteCount;
                }
            }
            System.out.println("Cars " + cars.size());
            System.out.println("White car Boss: " + white);
            System.out.println("Red cars Firefighters: " + redCount);
            System.out.println("Green cars Military: " + greenCount);
            System.out.println("Yellow cars Volunteer: " + yellowCount);

        }
   }