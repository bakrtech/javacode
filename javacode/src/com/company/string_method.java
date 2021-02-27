package com.company;

import java.util.Scanner;

public class string_method {
    public static void main(String[] args) {
        //String name = "abubakrniazi";
        //String sir_name = new String("niazi");
        // System.out.println(name);
        //int lenght_string = name.length();
        //System.out.println(lenght_string);
        //String capital_name = name.toUpperCase();
        //System.out.println(capital_name);
        //String not_clean = ("  aksdfa   ");
        //System.out.println(not_clean);
        //String cleaned = not_clean.trim();
        //System.out.println(cleaned);
        //System.out.println(name.substring(2,7));
        //System.out.println(name.replace("a"," 12 "));
       /* boolean starts_abu = name.startsWith("abu");
        boolean ends_azi = name.endsWith("azi");
        System.out.println(starts_abu);
        System.out.println(ends_azi);
        System.out.println(name.charAt(2));*/
        String letter = "My name is !!name!! and \n my class is !!class!! and \n my roll number is !!roll!! " ;
        Scanner io = new Scanner(System.in);
        String name = io.nextLine();
        String standard = io.nextLine();
        String roll_no  = io.nextLine();
        letter = letter.replace("!!name!!",name);
        letter = letter.replace("!!class!!",standard);
        letter = letter.replace("!!roll!!",roll_no);
        System.out.println(letter);




    }

}
