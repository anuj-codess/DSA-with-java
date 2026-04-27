package array;

public class pairsofanarray {
    public static void main(String args[]){

        int arr[]={2,4,6,8,10};

        printpairs(arr);
    }

    //create a function
    public static void printpairs(int arr[]){

        int totalpairs=0;

        for(int i=0; i<arr.length; i++){
        

            int curr=arr[i];

            for(int j=i+1; j<arr.length; j++){

                System.out.print("(" + curr + "," + arr[j] + ")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("the total pairs is:"+totalpairs);
    }
}
