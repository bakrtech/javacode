package com.company;

class thr extends Thread{
    public thr(String name,int Standard){
        super(name);

    }
    public thr(String name){
        super(name);                   //Method over riding
    }
    public void run(){
        while (true){
            System.out.println("Hi my name is " + this.getName() +" and my ID is " + this.getId() + "And lastly my priotriy is "+ this.getPriority());
            try {
                Thread.sleep(787);// It will wait for 787 mili second and then it will be printed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Threads_priotrites {
    public static void main(String[] args) {
    thr tat = new thr("name 1");
    thr tat2 = new thr("name 2",1);
    thr tat3 = new thr("name 3");
    tat.setPriority(Thread.MAX_PRIORITY);
    tat2.setPriority(Thread.MIN_PRIORITY);   // It has the range of 1 is least, 5 is a normal and 10 is the highest
    tat3.setPriority(Thread.NORM_PRIORITY);
    tat.start();
    try {
        tat.join();
    }                                  //By this we can wait for the first process to complete and then the other one starts
    catch (Exception e){
        System.out.println(e);
    }
    tat2.start();
    tat3.start();
    }
}
