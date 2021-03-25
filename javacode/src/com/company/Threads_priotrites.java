package com.company;

class thr extends Thread{
    public thr(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("Hi my name is " + this.getName() +" and my ID is " + this.getId() + "And lastly my priotriy is "+ this.getPriority());

        }
    }
}


public class Threads_priotrites {
    public static void main(String[] args) {
    thr tat = new thr("name 1");
    thr tat2 = new thr("name 2");
    thr tat3 = new thr("name 3");
    tat.setPriority(10);
    tat2.setPriority(Thread.MIN_PRIORITY);   // It ranges from 1 to 10 where 1 is least and 10 is the most
    tat3.setPriority(5);
    tat.start();
    tat2.start();
    tat3.start();
    }
}
