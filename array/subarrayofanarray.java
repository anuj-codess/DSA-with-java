package array;

public class subarrayofanarray {
    
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};

        printsubarray(numbers);

    }

    public static void printsubarray(int numbers[]){

        int totalsubarray=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;

        for(int start=0; start<numbers.length; start++){

            for (int end=start; end<numbers.length; end++){

                int sum=0;

                for(int subarray=start; subarray<=end; subarray++){

                    System.out.print(numbers[subarray]+ "  ");

                    sum=sum+numbers[subarray];
                    

                    
                }
                if(sum>maxsum){
                    maxsum=sum;
                }
                if(sum<minsum){
                    minsum=sum;
                }

                totalsubarray++;
                System.out.println("="+sum);

                
                System.out.println();
            }
        }
        System.out.println("max sum:"+maxsum);

        System.out.println("min sum:"+minsum);
        System.out.println("the total sub array is : "+totalsubarray);
    }
}
