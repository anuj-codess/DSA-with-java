package oop;

public class InheritanceExample {

    public void sound(){
        System.out.println("animal sound");
    }

    
}
class dog extends InheritanceExample{

    public void eat(){
        System.out.println("animal is eating");
    }
}
public class main{
    public static void main (String [] args){

        dog d = new dog();

        d.sound();
        d.eat();
    }
}