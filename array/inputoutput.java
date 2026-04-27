package array;

import java.util.Scanner;

public class inputoutput {
    public static void main(String args[]){

        //store input and output marks of three subject alse update someone update marks and change the msrks
        int marks []=new int [3];

        System.out.println("Enter your marks!");
        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt();//math
        marks[1]=sc.nextInt();//phy
        marks[2]=sc.nextInt();//english

        //update the marks of english
        marks[2]=50;

        //change the marks of math subject increase by teacher after recheck the copy
        marks[0]=marks[0]+5;

        System.out.println("math : "+marks[0]);
        System.out.println("phy : "+marks[1]);
        System.out.println("english : "+marks[2]);


    }
}
