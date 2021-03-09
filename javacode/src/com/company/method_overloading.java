package com.company;

public class method_overloading {
    static void namea(){
        System.out.println("good morning");
    }
    static void namea(int a){
        System.out.println("Good morning "+ a);
    }
    static void namea(int a, int b){
        System.out.println(a +" good morning "+b);
    }
    // Above was the example of method overlodaing;
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
        //array is changeable as it a refrence and z(as an int)didnt chage bcoz its copy was sent
        System.out.println(was[0]);
        System.out.println(z);
        //Method over lodaing
        int a =3;
        int c =2;
        namea();
        namea(a);
        namea(a,c);


    }

}

