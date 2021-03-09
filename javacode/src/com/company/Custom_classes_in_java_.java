package com.company;

 class Employer//There can be only one public class in a java file
 { int id;
 String name ;

}
public class Custom_classes_in_java_ {
    public static void main(String[] args) {
        //System.out.println("This is our Custom class");
        Employer bakrtech =new Employer(); //making a new object in Employr class
        bakrtech.id =4;
        bakrtech.name ="Anonumyus";
        System.out.println(bakrtech.id);
        System.out.println(bakrtech.name);
    }
}
