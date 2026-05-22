package oop;

class animal {

    void sound() {
        System.out.println("animal makes sound");
    }
}

class dog extends animal {

    void sound() {
        System.out.println("dog barks");
    }
}

public class polymorphysmExample {

    public static void main(String args[]) {

        animal a = new dog();

        a.sound();
    }
}