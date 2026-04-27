package array;

public class binarysearch {

    public static int searchkeyat(int arr[],int key){

        int start=0; int end=arr.length-1;
        
        while (start <=end) {

            int mid=(start+end)/2;

            //coditions
            if(arr[mid]==key){
                return mid;

            }
            if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
                
            
        }
        return -1;

    }
    public static void main(String args[]){
        int arr []={2,4,6,8,10,12,14};
        
        int key=4;

        int index=searchkeyat(arr, key);
         
        if(index == -1){
            System.out.println("not present");
        }

        else{
            System.out.println("the numner at index : "+index);
        }
    }
}
