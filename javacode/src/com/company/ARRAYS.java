package com.company;

public class ARRAYS {
    public static void main(String[] args) {
        int []classrooms ={123,4,5,6,4,3,4,2,3,3};
        System.out.println(classrooms.length);
        int [] name= new    int[5];
    for(int i=0;i<=4;i++){
        name[i] = 2*i;
        System.out.println(name[i]);
    }

        for(int w = 1;w<=10;w++){
        int [] Numbers = new int[10];
        Numbers [w-1] = w*3;
            System.out.println("The numbers are " +Numbers[w-1]);
            System.out.println(Numbers.length);
        }
    for(int element:   name){
        System.out.println(element);
    }


    }
}

