package org.prog.homework;

public class HomeworkMain {

    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        plane1.airCompany = "Lufthansa";
        plane1.flightNumber = 98;
        Airplane plane2 = new Airplane();
        plane2.airCompany = "Delta Air Lines";
        plane2.flightNumber = 65;
        Airplane plane3 = new Airplane();
        plane3.airCompany = "Delta Air Lines";
        plane3.flightNumber = 65;
        System.out.println(plane1.hashCode());
        System.out.println(plane2.hashCode());
        System.out.println(plane1.equals(plane2));
        System.out.println(plane2.equals(plane3));
    }
}
