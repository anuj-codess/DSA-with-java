package oop;

public class classesandobjects {
    public static void main(String args[]){

        Pen p1 = new Pen();//this is called p1 object
        p1.setcolor("black");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.color = "green";
        System.out.println(p1.color);

        Bank b1 = new Bank();

        b1.name="anuj";
        System.out.println(b1.name);
        b1.change("akoncla");
        System.out.println(p1.password);
        System.out.println(b1.password);
        

    }
}
class Pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;

    }
}
// a small example of access modifires or access specifires
class Bank{
    public String name;
    private String password;
    public void change(String pwd){
        password = pwd;
    }

}