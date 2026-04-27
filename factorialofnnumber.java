import java.util.*;
public class factorialofnnumber {
    public static void factorial(int n){
        int f=1;
        if (n==0) {
            System.out.println(f);
        }
        else {
        for(int i=1;i<=n;i++){
            f=f*i;
            System.out.println(f);
        }
       }
        
            
        
        return ;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        factorial(n);

    }
    
}
