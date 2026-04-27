package oop;

public class gettersandsetters {
    public static void main(String args[]){

        Pen p1 = new Pen();
        p1.setcolor("blue");

        System.out.println(p1.getcolor());

        p1.settip(5);
        System.out.println(p1.gettip());

    }
}

class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return color;

    }
    int gettip(){
        return tip;
    }

    void setcolor(String newcolor){

        color = newcolor;

    }

    void settip(int newtip){
        tip = newtip;
    }
}
