package array;

public class TrappingRainWater {

    public static void tarppedwater(int [] height){

        int n = height.length;

        //calculate left maximum boundary - array

        int [] leftMax = new int[n];
        leftMax[0] = height[0];

        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        //claculate right maximum boundary -array

        int [] rightmax = new int[n];

        rightmax[n-1] = height[n-1];

        for(int i = n-2; i>=0; i-- ){

            rightmax [i] = Math.max(height[i], rightmax[i+1]);
        }

        //finally calculating trapped water

        int trapped = 0;

        for(int i = 0; i < n; i++){

            int waterleval = Math.min(leftMax[i], rightmax[i]);

            trapped += waterleval - height[i];
        }

        System.out.println("the total trapped water is :" + trapped);

    }
    
    public static void main (String args[]){

        int [] height = {4,2,0,6,3,2,5};

        tarppedwater(height);
    }
}
