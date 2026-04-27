package array;

public class maxsubarrayKadans {

    public static void kadans(int [] nums){

        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<nums.length; i++){

            

            currSum = currSum + nums[i];

            if(currSum < 0){

                currSum = 0;
            }

            maxsum = Math.max(maxsum, currSum);


        }
        System.out.println("the max sum is :"+maxsum);

    }
    
    public static void main (String args[]){

        int [] nums = {-2,-3,4,-1,1,-2,5,-3};

        kadans(nums);
    }
}
