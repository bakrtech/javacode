package com.company;
class A{
    int i =12;
    public  int one(){
        return 1;
    }
}
class B extends A{
    int b;
    public int sty(){

        i = b;
        return i;
    }
    @Override
    public  int one(){
      return 4;
    }
}

public class Method_overring {
    public static void main(String[] args) {
    B bakrtech = new B();
    A hat = new A();
    int r=bakrtech.one();
        System.out.println(r);
        int j= bakrtech.i;
        System.out.println(j);

    int w = hat.one();
        System.out.println(w);
    }

}
