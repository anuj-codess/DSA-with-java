package array;

public class findlargestfromarr {
    public static int searchlargestnum(int arr[],int largest){
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){

                largest=arr[i];
                

            }
        }
        return largest;
    }

    public static void main(String args[]){
        int arr[]={1,2,6,3,5};
        int largest=Integer.MIN_VALUE;

        int index=searchlargestnum(arr, largest);
        System.out.println(index);

    }
}
