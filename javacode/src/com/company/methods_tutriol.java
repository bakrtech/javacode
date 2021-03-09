package com.company;

public class methods_tutriol {
    //if not using static here then you have to create an object when we need to call  it ;
    static int logic(int x, int y){
            int z;
            if (x>y){
                         z =x +y ;
                                            }
            else {
                z = x*y;
                                            }
            return z;
    }

    public static void main(String[] args) {
    int a=3;
    int b =5;
    int c;
    // this is used if there is no static in method;
    //    methods_tutriol obj =new methods_tutriol();
   // c = obj.logic(a,b)
    c =logic(a,b);
        System.out.println(c);
    }
}
