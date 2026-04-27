package Stringinjava;

public class substring {

    public static String subString(String str, int si,int se){
        String substr = "";
        for(int i = si; i<se; i++){
            substr = substr + str.charAt(i);
        }

        return substr;
    }
    public static void main(String args[]){
        String str = "helloworld";

        System.out.println(subString(str, 0, 5));
    }
}
