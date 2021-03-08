package com.company;

public class Multi_dim_Arrays {
    public static void main(String[] args) {
        int [] []  flats=new int[6][6];
        for(int i=1;i<6;i++){
            System.out.println(" ");
            for (int q=0;q<6;q++){
                flats [i] [q] = (100*i)+q;
                System.out.print(flats[i][q]);
                System.out.print(" ");
            }
        }
    }
}
