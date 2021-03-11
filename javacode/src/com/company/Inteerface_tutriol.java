package com.company;
class Z{
    Z(){
        System.out.println("I am an element of Z");
    }
}
interface Interrior{
    void color();
    void size();
    }
interface Car{
    void speedUP(int acclecration);
    void speedDown(int negitiveacc);
}
class BMW extends Z implements Car,Interrior{
    BMW(){
        System.out.println("I am BMW Car............O..............");
    }

    @Override
    public void color() {
        System.out.println("Black is the color ");
    }

    @Override
    public void size() {
        System.out.println("The largest size ");
    }

    public void speedUP(int acclecration){
        System.out.println("Applying Gear in 3...2...1 applied");
    };
    public void speedDown(int negiriveacc){
        System.out.println("Applying Brakes in 3..2..1 Applied;");
    };
}
public class Inteerface_tutriol {
    public static void main(String[] args) {
        BMW as =new BMW();

    }
}
