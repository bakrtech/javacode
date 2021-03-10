package com.company;
class Default{
     private int id;
    private String name;
    public Default(String myname, int myid){
        id =myid;
        name =myname;
    }
    public int getDetails(){
        return id ;
           }
    public String getV(){
        return name;
    }
}
public class constructers_method {
    public static void main(String[] args) {
        Default bakrtech = new Default("The_best",78);
        System.out.println(bakrtech.getDetails());
        System.out.println(bakrtech.getV());
    }
}
