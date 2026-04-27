package array;

public class passbyvalue {
    public static void change(int u){
        int n=10;
    }
    public static void main(String args[]){
        int n=5;

        change(n);
        System.out.println(n);
    }
}
