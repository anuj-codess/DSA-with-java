import java.util.*;

class PrimeOrNotPrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int divisor = 2;

        if (num <= 1) {
            System.out.println("Not Prime Number");
        } 
        else {
            while (divisor < num) {

                if (num % divisor == 0) {
                    System.out.println("Not Prime Number");
                    return;
                }

                divisor++;
            }

            System.out.println("Prime Number");
        }
    }
}
