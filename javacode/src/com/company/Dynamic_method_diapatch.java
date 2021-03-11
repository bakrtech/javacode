package com.company;
class Phone{
    public int one(){
        return 1;
    }
    public void two(){
        System.out.println("method 2 of class Phone");
    }

}
class SmartPhone extends Phone{
    public int one(){
        return 12;
    }
    public void three(){
        System.out.println("Three method");
    }
}
public class Dynamic_method_diapatch {
    public static void main(String[] args) {
        Phone a = new SmartPhone(); //Yes it is allowed in JAVA
       // SmartPhone b = new Phone();//This is not allowed as it has a refernce of sub class and object is being created of super class
        System.out.println(a.one());//This will be the over rided one of class SmartPhone
        a.two();
        //a.three();//This is not possible
    }
}
