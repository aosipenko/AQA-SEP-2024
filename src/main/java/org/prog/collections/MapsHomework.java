package org.prog.collections;

import org.prog.inheritance.Car;

import java.util.*;

//TODO: create Map which will allow you to track car owners and cars they own
//TODO: At least one car must be owned by two owners
//TODO: print owners that share cars
public class MapsHomework {

    public static void main(String[] args) {

//        Map <String, String>  map  = new HashMap<>();
//        map.put("ownerCar1","Bob car - red - BMW");
//        map.put("ownerCar2", "Bob car - blu - Chrysler");
//        map.put("ownerCar3", "Lori car - yellow - Mazda");
//        map.put("ownerCar4", "Bob and Lori car - white - Audi");

//        System.out.println(map.get("ownerCar1"));
//        System.out.println(map.get("ownerCar2"));
//        System.out.println(map.get("ownerCar3"));
//        System.out.println(map.get("ownerCar4"));
//
//        Set<String> ownerCar = map.keySet();
//        for (String s : ownerCar);
//        System.out.println();
        class Car {
            String name;

            Car(String name) {
                this.name = name;
            }
        }
            class CarOwner {
                String name;
                CarOwner(String name){
                    this.name = name;
            }
        }
        Map<CarOwner, List<Car>> ownersAndCars = new HashMap<>();
        CarOwner owner1 = new CarOwner(" Ruslan ");
        CarOwner owner2 = new CarOwner(" Iryna ");

        Car car1 = new Car("Car 1");
        Car car2 = new Car("Car 2");
        Car car3 = new Car("Car 3");
        Car sharedCar = new Car("Car 4 shared ");

        List<Car> owner1Cars = new ArrayList<>();
        owner1Cars.add(car1);
        owner1Cars.add(car2);

        List<Car> owner2Cars = new ArrayList<>();
        owner2Cars.add(car3);

        List<Car> sharedCars = new ArrayList<>();
        sharedCars.add(sharedCar);

        ownersAndCars.put(owner1, owner1Cars);
        ownersAndCars.put(owner2, owner2Cars);
        ownersAndCars.get(owner1).add(sharedCar);
        ownersAndCars.get(owner2).add(sharedCar);

        for (Map.Entry<CarOwner, List<Car>> entry : ownersAndCars.entrySet()){
            CarOwner owner = entry.getKey();
            List<Car> cars = entry.getValue();

            System.out.println(owner.name + "Owns the following cars:");
            for (Car car : cars){
                System.out.println("  " + car.name);

            }
        }
    }

    public static CarOwner createOwner(String name, String lastName, String phoneNumber) {
        CarOwner user = new CarOwner();
        user.lastName = lastName;
        user.firstName = name;
        user.phoneNumber = phoneNumber;
        return user;
    }
}
