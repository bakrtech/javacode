package com.company;

import java.util.*;
//From now on we are starting advance JAVA
public class Java_collection_frameworks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar =new ArrayList<>();
        ArrayList<Integer> ar2 =new ArrayList<>();
        ar2.add(1);
        ar2.add(5);
        ar2.add(3);
        ar2.add(2);

        ar.add(34);
        ar.add(33);
        ar.add(12);
        ar.add(42);
        ar.add(44);
        System.out.println(ar.contains(78));
        ar.set(2,343);
//        ar.addAll(ar2);
       System.out.println(ar);
//        for(int i=0; i<ar.size();i++){
//            System.out.println(ar.get(i));

        }
    }

