package array;

public class linearsearch {

    public static int search(int array[]){

        int key =20;

        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                
                return i;

            }
        }
        return -1;

    }
    public static void main(String args[]){

        int array[]={2,4,6,8,10,12,14,16};

        

        int index=search(array);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("element at index:"+index);
        }

        }

    



    }

