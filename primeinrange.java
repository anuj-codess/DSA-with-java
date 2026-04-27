public class primeinrange {
    public static boolean isprime(int num){

        if(num==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(num); i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int num){
        for(int i=2;i<=num;i++){
            if(isprime(i)){
                System.out.print(i+"   ");
            }
            
        }System.out.println();
    }

    public static void main(String args[]){
        

        primeinrange(100);
    }
}
