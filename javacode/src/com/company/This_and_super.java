package com.company;
class Noname{ //These names are funny because in one package there can be one class with one name
    int i;


    Noname(int i){
        this.i=i;
        System.out.println(this.i*45);
    }
    public int getI() {
        return i;
    }

    public int reone(){
    return 1;
    }
}
public class This_and_super {
    public static void main(String[] args) {
    Noname q = new Noname(21);
        System.out.println(q.getI());
    }
}
