package com.company;
interface Bike{
    void speedUP(int acclecration);
    void speedDown(int negitiveacc);
}
class BMW implements Bike{
    public void speedUP(int acclecration){
        System.out.println("Applying Gear in 3...2...1 applied");
    };
    public void speedDown(int negiriveacc){
        System.out.println("Applying Brakes in 3..2..1 Applied;");
    };
}
public class Inteerface_tutriol {
}
