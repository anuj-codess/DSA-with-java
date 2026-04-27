public class array {
    
    public static void main(String args []){

        int [] arr = {5,4,3,1,2};

        for(int i =0 ; i<arr.length ; i++){

            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                System.out.println(arr[i]);

            }
            
        }
    }
}
