package com.company;
interface Camera
{
 void selfie(int numOfPepole);
 void HD (int Graphics);
 default void Image4K()//The default method is used where we have to set a default for some interferance so that we don't need to define it again and again;
 {
    System.out.println("Taking the 4K image in 5...4...3...2...1\n");
 }
}
interface Gps
{
    void Location(int longitude);
    void refresh(int Lag);
}
interface MediaPlayer
{
    void Playmusic();
    void Stopmusic();
}
class cellPhone{
    int year_invended = 123;
}
class  Smartphone extends cellPhone implements Camera,Gps,MediaPlayer{
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

public class default_methods {
    public static void main(String[] args) {
        Smartphone Samsung = new Smartphone();
        Samsung.Image4K();
        Samsung.HD(123);
        Samsung.Location(8923);
        Samsung.Playmusic();
        System.out.println(Samsung.year_invended);


    }
}
