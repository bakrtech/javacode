package com.company;

public class argument_variable {
    static int sum(int...a)
    //All the parameters will be stored in form of array  named a ;
    {
        int result = 0;
        for (int z:a){
            result +=z;
        }
        return result;
    }
    public static void main(String[] args) {
        int q =sum(1,2,34,56,7,8,9);
        System.out.println(q);
    }
}
