package array;

public class maxsubarraysum {
    public static void main(String args[]){
        int [] array={1,-2,6,-1,3};
        maxsubarraysum(array);

    }

    public static void maxsubarraysum(int array []){

        int maxsum=Integer.MIN_VALUE;
        
        for(int i=0; i<array.length;i++){

            for(int j=i;j<array.length;j++){

                int sum=0;

                for(int k=i; k<=j; k++){

                    sum=sum+array[k];
                    System.out.print("{"+array[k]+" }");
                    
                    

                }
                
                System.out.println(sum);
                if(sum>maxsum){
                    
                   maxsum=sum;
               }
            }
        }System.out.println("the max sum of sub array is :"+maxsum);
        
    }
}
