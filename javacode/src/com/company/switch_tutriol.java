package com.company;
import java.util.Scanner;
public class switch_tutriol {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int age;
        System.out.println("Please enter Your Age ");
        age = ab.nextInt();
        switch (age) {
            case 12 -> System.out.println("You must play GTA SAN");
            case 16 -> System.out.println("You Must Learn Coding Now");
            case 22 -> System.out.println("You must get job now");
            default -> {
                System.out.println("You are Growing!!!");
                System.out.println("thanks For Using BakrtTech code . Remember  " + age + " is just a  number");
            }
        }
    }
}
