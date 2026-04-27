package Stringinjava;

public class stringcomparision {
    public static void main(String args []){
        String str1 = "tony";
        String str2 = "tony";
        
        String str3 = new String("tony");

        if (str1 == str2){
            System.out.println("strings are equals");
        }
        else{
            System.out.println("string are not equals");
        }
        if (str1 == str3) {
            System.out.println("String are equal");
            
        }
        else{
            System.out.println("not equal");
        }

        // for str1 or str2 to str3 use equal function
        if(str1.equals(str3)){
            System.out.println("srrings are equals");
        }
        else{
            System.out.println("strings are not equals");
        }
    }
}
