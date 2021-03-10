package com.company;
class base{
    base(){
        System.out.println("I am an constructor of base class");//This is called a constructor in java language
    }
    int c;
    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


}
class  derivied extends base{
    derivied(){
        System.out.println("I am constructor of derived class");
    }
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class VAS extends derivied{
    VAS(){
        System.out.println("I am the youngest constructor");
    }
    int g;

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }
}
public class Inheritenc_tut {
    public static void main(String[] args) {
        base a = new base();
        System.out.println("Above was base");
        derivied n  = new derivied();
        System.out.println(" Above was dervied ");
        VAS bakrtech = new VAS();
        System.out.println(" Above was VAS ");
        bakrtech.setC(1);
        bakrtech.setA(12);
        bakrtech.setG(11);
        System.out.println(bakrtech.getA());
        System.out.println(bakrtech.getC());
        System.out.println(bakrtech.getG());
    }
}
