import java.util.*;
public class primeornot {

    public static void primeornotprime(int num){

        
        

        int count=0;

        for(int i=2;i<=num-1;i++){
            if(num==2){
                System.out.println("prime number");
                
            }
            else{
                if(num%i==0){
                count++;
                break;
            }
            }
            
             
        }
        if(count==0){
            System.out.println("number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }
        
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        primeornotprime(num);



        


    }
}
