package org.prog.homework;

public class HomeworkMain {

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Airplane airline = airplane;
        airplane.airline = "Condor";


        Airplane number = airplane;
        airplane.number = "EEEE";
        System.out.println();
        System.out.println("flight Airplane number is" + number.number);
        System.out.println("flight Airplane airline is" + number.airline);
        airplane.weFly();

        airplane.weFly(" Halifax ", " Halifax ",
                " Frankfurt ", " Paris ");



        System.out.println(number.equals(airline));
        System.out.println(airline.equals(number));

        Object o = new Object();
        o.hashCode();

    }
}



