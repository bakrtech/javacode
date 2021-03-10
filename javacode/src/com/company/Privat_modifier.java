package com.company;
class Student{
    private int id;
    private String  name;
    public  void  setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int c){
    id = c;
        }
    public int getId(){
        return id;
    }
}
public class Privat_modifier {
    public static void main(String[] args) {
        Student bakrtech =new Student();
        bakrtech.setId(12);
        bakrtech.setName("coder");
         int id  = bakrtech.getId();
        String name = bakrtech.getName();
        System.out.println(id + name);
    }

}
