package com.company;
class Mythread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<40000){
            System.out.println("A");
            System.out.println("Bakrtech is the best coder ");
            i++;
        }
    }
}class Mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<40000){
            System.out.println("B");
            System.out.println("Suscribe to bakrtech  ");
            i++;
        }
    }
}
public class Multi_threrading {
    public static void main(String[] args) {
    Mythread1 t1 = new Mythread1();
    Mythread2 t2 = new Mythread2();
    t1.start();
    t2.start();


    }
}
