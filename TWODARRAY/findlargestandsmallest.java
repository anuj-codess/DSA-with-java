package TWODARRAY;

import java.util.Scanner;

public class findlargestandsmallest {

    public static void largest(int matrix[][]){

        int largest= Integer.MIN_VALUE;

        for(int i = 0; i<matrix.length; i++){

            for(int j = 0; j<matrix[0].length; j++){

                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }

                
            }
        }
        System.out.println("the largest element is:"+largest);


    }
    public static void minimum(int matrix[][]){

        int min= Integer.MAX_VALUE;

        for(int i = 0; i<matrix.length; i++){

            for(int j = 0; j<matrix[0].length; j++){

                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }

                
            }
        }
        System.out.println("the minimum element is:"+min);


    }

    
    public static void main(String args[]){

        int matrix [][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner((System.in));

        for(int i = 0; i<n; i++){

            for(int j = 0; j<m; j++){

                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){

            for(int j = 0; j<m; j++){

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        largest(matrix);

        minimum(matrix);

        




    }
}
