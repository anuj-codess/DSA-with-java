package oop;

public class constructors {
    
    public static void main(String args[]){

        Student s1 = new Student("anuj sharma");
        System.out.println(s1.name);

    }
}

class Student{
    String name;
    int roll;

    //constructors creation
    Student(String name){
        this.name = name;

        //System.out.println("my name is anuj sharma");

    }
}
