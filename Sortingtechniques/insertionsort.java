package Sortingtechniques;

public class insertionsort {

    public static void insertionsort(int [] arr){

        for(int i = 1; i<arr.length; i++){

            int curr = arr[i];
            int priv = i -1;

            while (priv >= 0 && arr[priv] > curr) {
                
                arr[priv+1] = arr[priv];
                priv --;
            }
            arr[priv+1] = curr;
        }
    }

    public static void print (int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String [] args){

        int [] arr = {5,4,1,3,2};
        insertionsort(arr);
        print(arr);
    }
}
