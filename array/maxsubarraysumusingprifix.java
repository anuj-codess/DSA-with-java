package array;

public class maxsubarraysumusingprifix {

    
    


    public static void main(String[] args) {

        int arr[] = {1, -2, 6, -1, 3};

        // Step 1: Prefix array banana
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Step 2: Subarray sum calculate karna using prefix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int currSum;

                if (i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}


