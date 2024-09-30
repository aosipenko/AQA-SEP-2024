package org.prog.collections;

import org.prog.inheritance.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//TODO: create Map which will allow you to track car owners and cars they own
//TODO: At least one car must be owned by two owners
//TODO: print owners that share cars
public class MapsHomework {

    public static void main(String[] args) {

        Map <String, String>  map  = new HashMap<>();
        map.put("ownerCar1","Bob car - red - BMW");
        map.put("ownerCar2", "Bob car - blu - Chrysler");
        map.put("ownerCar3", "Lori car - yellow - Mazda");
        map.put("ownerCar4", "Bob and Lori car - white - Audi");

        System.out.println(map.get("ownerCar1"));
        System.out.println(map.get("ownerCar2"));
        System.out.println(map.get("ownerCar3"));
        System.out.println(map.get("ownerCar4"));

        Set<String> ownerCar = map.keySet();
        for (String s : ownerCar);
        System.out.println();
    }

    public static CarOwner createOwner(String name, String lastName, String phoneNumber) {
        CarOwner user = new CarOwner();
        user.lastName = lastName;
        user.firstName = name;
        user.phoneNumber = phoneNumber;
        return user;
    }
}
