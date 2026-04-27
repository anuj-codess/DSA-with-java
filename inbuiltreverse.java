import java.util.Arrays;
import java.util.Collections;

public class inbuiltreverse {
    public static void main(String [] args){

    Integer [] arr = {5,3,2,4,7,3,2,1};

        Arrays.sort(arr,Collections.reverseOrder());

        for(Integer i = 0; i<arr.length; i++){

            System.out.println(arr[i]);
        }


     }
}
