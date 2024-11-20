package org.prog.homeworks.session3;

import org.prog.inheritance.DemoCar;

import java.io.IOException;

public class ExceptionsDemo {

    public static void main(String[] args) {
        try {
            DemoCar demoCar1 = new DemoCar("a");
            DemoCar demoCar2 = new DemoCar("a");
            System.out.println(demoCar1.equals(demoCar2));
        } catch (Exception e) {
            System.out.println("Car must have colors!");
        }

        readFile1("a");
        readFile1("b");
        readFile1("c");
        readFile1("d");
        readFile1("e");
    }

    public static void readFile1(String fileName) {
        readFile2(fileName);
    }

    public static void readFile2(String fileName) {
        try {
            readFile3(fileName);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception caught!");
        } catch (IOException e) {
            System.out.println("IO Exception caught!");
        } catch (Exception e) {
            System.out.println("Exception caught!");
        }
    }

    public static void readFile3(String fileName) throws Exception {
        try {
            readFile4(fileName);
        } catch (RuntimeException e) {
            System.out.println("Runtime / NP Exception caught!");
        }
    }

    public static void readFile4(String fileName) throws Exception {
        readFile5(fileName);
    }

    public static void readFile5(String fileName) throws Exception {
        if ("a".equals(fileName)) {
            throw new NullPointerException();
        }
        if ("b".equals(fileName)) {
            throw new RuntimeException();
        }
        if ("c".equals(fileName)) {
            throw new IOException();
        }
        if ("d".equals(fileName)) {
            throw new Exception();
        }
        if ("e".equals(fileName)) {
            throw new TypeNotPresentException("asd", new Exception());
        }
    }
}
