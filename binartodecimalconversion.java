public class binartodecimalconversion {
    
    public static void bintodec(int binnum){
        int mynum=binnum;
        int pow=0;
        int decnum=0;
        while (binnum > 0) {
            int lastdigit=binnum % 10;
            decnum=decnum+ (int)(lastdigit * Math.pow(2, pow));
            pow++;

            binnum=binnum/10;
            
        }
        System.out.println("the decimal of  "+mynum+"  =  "+decnum);
    }
    public static void main(String args[]){
        bintodec(101);
    }
}
