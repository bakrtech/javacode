package com.company;
import java.util.Scanner;
public class While_loops
{
    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);
        //Please reduce the number if you don't have high RAM or CPU
        //WARNING :  You have been warned
        int Number = input.nextInt();
        while (Number<=1000){

            System.out.println(Number);
            Number++;
        }
    }
}
