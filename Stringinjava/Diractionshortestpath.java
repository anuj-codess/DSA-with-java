package Stringinjava;

public class Diractionshortestpath {

    public static float shortestpath(String str){

        int X= 0;
        int Y = 0;
        for(int  i = 0; i<str.length(); i++){

            char dir = str.charAt(i);

            if(dir == 'S'){
                Y--;
            }
            else if(dir == 'N'){
                Y++;
            }
            else if(dir == 'W'){
                X--;
            }
            else{
                X++;
            }

        }

        int X2= X*X;
        int Y2 = Y*Y;

        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";

        System.out.println(shortestpath(str));
    }
}
