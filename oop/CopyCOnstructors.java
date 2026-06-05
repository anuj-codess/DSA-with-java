package oop;

public class CopyCOnstructors {
    
    public static void main (Stirng [] args){

        Student s1 = new Student();

        s1.name = "anuj";
        s1.roll = 123;

        s1.passowrd = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[3] = 80;

        Student s2 = new Student(s1);
        s2.passowrd="xyz";

        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }


    }
}

class Student{

    String name;
    int roll;
    String passowrd;
    int marks[];

    Student (Student s1){
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is called ..");
    }

    Student(String name){
        marks = new int[3];
        this.name = name;

    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
