package com.company;
import java.util.*;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> ar =new LinkedList<>();
        LinkedList<Integer> ar2 =new LinkedList<>();
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
       ar.addAll(ar2);
        System.out.println(ar);
//        for(int i=0; i<ar.size();i++){
//            System.out.println(ar.get(i));

    }
}
