package com.company;

public class method_overloading {
    void thelanguage(){
        System.out.println("We are learning Java");
    }
    static void thebestcoder(){
        System.out.println("bakrtech is the best coder I have ever met");
    }
    static void change(int [] arr){
        arr[0] =23;
    }
    static void change2(int a){
        a =34;
    }
    public static void main(String[] args) {
        // thebestcoder();
       //  method_overloading example =new method_overloading();
        // example.thelanguage();
        int [] was= {12,34,56,78};
        int z =67;
        change(was);
        change2(z);
        System.out.println();
    }
}

