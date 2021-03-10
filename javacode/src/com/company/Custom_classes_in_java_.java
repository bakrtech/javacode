package com.company;

 class Employer//There can be only one public class in a java file
 {
     int id;
 String name ;
 int salary;
 public  void  printDtails(){
     System.out.println(" My name  is  " +name + "\t My id is  " + id);
 }
 public int getSalary(){
     return  salary;
 }

}
public class Custom_classes_in_java_ {
    public static void main(String[] args) {
        //System.out.println("This is our Custom class");
        Employer bakrtech =new Employer(); //making a new object in Employr class
        bakrtech.id =4;
        bakrtech.name ="Anonumyus";
        bakrtech.salary = 123;
        Employer elonmusk = new Employer();
       elonmusk.id = 78;
       elonmusk.name = "Telsa engineer";
       elonmusk.salary= 121;
        //System.out.println(bakrtech.id);
        //System.out.println(bakrtech.name);
        bakrtech.printDtails();
        elonmusk.printDtails();
        int salary = bakrtech.getSalary();
        int salary2 = elonmusk.getSalary();

    }
}
