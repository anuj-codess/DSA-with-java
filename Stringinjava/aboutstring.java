package Stringinjava;
import java.util.*;

public class aboutstring {

    public static void printchar(String n1,String n2){

        String fullname = n1 + n2;

        for(int i = 0; i<fullname.length(); i++){

            System.out.println(fullname.charAt(i));
        }
    }
    
    public static void main(String args[]){
        //decleration

       // String str = "aman";
       // String str1 = new String("aman");

        //Input and output 

        //Scanner sc = new Scanner(System.in);

        //String name = sc.nextLine();

      //  System.out.println(name);

      //finding length
      String name1 = "anuj sharma";

      System.out.println(name1.length());

      //concatination

      String n1 = "anuj";
      String n2 = "Sharma";
      System.out.println(n1+n2);

      printchar(n1, n2);


    }
}
