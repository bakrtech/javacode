package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        Scanner ab = new Scanner(System.in);
        String name = ab.next();
        System.out.println(name);
        boolean typed = ab.hasNextInt();
        System.out.println(typed);
        System.out.print("number one : ");
        int a = ab.nextInt();
        System.out.print("number two : ");
        int b = ab.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }
}
