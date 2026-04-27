package Sortingtechniques;

public class countingsort {

    public static void countingsort(int [] arr){
        //find largest first
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            largest = Math.max(largest, arr[i]);
        }

        //frequency counting in another array
        int count [] = new int[largest + 1];
        
        for(int i = 0; i<arr.length; i++){

            count[arr[i]]++;
        }

        // sorting here

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }


    }

    public static void print (int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String args[]){
        int arr [] = {1,4,1,3,2,4,3,7};
        countingsort(arr);
        print(arr);
    }
}
