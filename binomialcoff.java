import java.util.*;
public class binomialcoff {

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int bionocoff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int fact_nminusr=factorial(n-r);
        int bionomialcofficient=n_fact/(r_fact*fact_nminusr);
        return bionomialcofficient;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int result=bionocoff(n, r);
        System.out.println(result);
    }
}