package ru.java.lesson2;

import java.util.Base64;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please, enter your name");
            String name = sc.nextLine();
            String encodedName = Base64.getEncoder().encodeToString(name.getBytes());
            System.out.println("Program result: " + encodedName);
        }
    }
}
