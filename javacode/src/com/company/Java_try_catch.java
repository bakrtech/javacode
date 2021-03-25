package com.company;

public class Java_try_catch {
    public static void main(String[] args) {
        int a = 34;
        int b = 0;
        try
        {
            int c = a/b;
            System.out.println("The answer is " +c);
        }
        catch (Exception e){
            System.out.println("We catched and error,Reason being : ");
            System.out.println(e);
        }


    }
}
