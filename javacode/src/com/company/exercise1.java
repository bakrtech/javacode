package com.company;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        System.out.println("Hello, today i am going to calculate your percentage ");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter total marks : ");
        float total_marks = input.nextFloat();
        System.out.print("please enter marks of subject one :");
        float marks_1 = input.nextFloat();
        float percent_subject_1 = (marks_1/total_marks)*100;
        System.out.println(percent_subject_1);
        System.out.print("please enter marks of subject two :");
        float marks_2 = input.nextFloat();
        float percent_subject_2 = (marks_2/total_marks)*100;
        System.out.println(percent_subject_2);
        System.out.print("please enter marks of subject three :");
        float marks_3 = input.nextFloat();
        float percent_subject_3 = (marks_3/total_marks)*100;
        System.out.println(percent_subject_3);
        System.out.print("please enter marks of subject four :");
        float marks_4 = input.nextFloat();
        float percent_subject_4 = (marks_4/total_marks)*100;
        System.out.println(percent_subject_4);
        System.out.print("please enter marks of subject five :");
        float marks_5 = input.nextFloat();
        float percent_subject_5 = (marks_5/total_marks)*100;
        System.out.println(percent_subject_5);


    }
}
