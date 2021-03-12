package com.company;
interface Camera2
{
    void selfie(int numOfPepole);
    void HD (int Graphics);
    default void Image4K()//The default method is used where we have to set a default for some interferance so that we don't need to define it again and again;
    {
        System.out.println("Taking the 4K image in 5...4...3...2...1\n");
    }
}
interface Gps2
{
    void Location(int longitude);
    void refresh(int Lag);
}
interface MediaPlayer2
{
    void Playmusic();
    void Stopmusic();
}
class cellPhone2{
    int year_invended = 123;
}
class  Smartphone2 extends cellPhone2 implements Camera2,Gps2,MediaPlayer2{
    int year_invended = 891;
    public void YearDevloped(){
        System.out.println(super.year_invended);
    }
    @Override
    public void selfie(int numOfPepole) {
        System.out.println("Say cheese");
    }

    @Override
    public void Image4K() {
        System.out.println("Taking 4k Image from Smart phone in 5 4 3 2 1\n  ");
        //We can also overwrite the default method defined earlier in the class containing it
    }

    @Override
    public void HD(int Graphics) {
        System.out.println("RTX 8980");
    }

    @Override
    public void Playmusic() {
        System.out.println("Which music to play");
    }

    @Override
    public void Stopmusic() {
        System.out.println("When to stop the music");
    }

    @Override
    public void Location(int longitude) {
        System.out.println("your location in longitude is  " + longitude);
    }

    @Override
    public void refresh(int Lag) {
        System.out.println("Check your Battery or the internet connection and please try again");
    }
}


public class polymorphism_tutriol {
    public static void main(String[] args) {
        Gps2 we = new Smartphone2();
        we.Location(123);
        we.refresh(123);


    }
}
