package Recursion;

public class PrintDecresingNumExample {

    public static void PrintDecresingNumExample(int n ){

        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        PrintDecresingNumExample(n-1);
    }
    
    public static void main(String args[]){

        int n = 10 ;
        PrintDecresingNumExample(n);
    }
}
