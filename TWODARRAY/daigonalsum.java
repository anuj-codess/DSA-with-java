package TWODARRAY;

public class daigonalsum {

    public static void daigonalsum(int matrix[][]){

        int sum = 0;

        // for(int i = 0; i<matrix.length; i++){

        //     for(int j = 0; j<matrix[0].length; j++){

        //         if( i ==j || i+j == 3 ){

        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);

        //in this case the time complexity is O(n^2)

        //optimized solution
        for(int i = 0; i < matrix.length; i++ ){

            //primary diagonal
            sum += matrix[i][i];

            int j = matrix.length -1-i;
             if(i != j )

            sum += matrix[i][j];    
        }
        System.out.println(sum);

        //in this the time complexity is O(n)
    }
    
    public static void main(String args[]){

        int matrix [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        daigonalsum(matrix);
    }
}
