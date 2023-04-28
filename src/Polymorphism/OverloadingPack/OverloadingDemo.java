package Polymorphism.OverloadingPack;

public class OverloadingDemo {
    static public void main(String[] args) {
        OverloadTest ot = new OverloadTest();
        ot.print();
        ot.print(1);
    }
}

class OverloadTest{
    public OverloadTest(){
        System.out.println("In a contructor");
    }

    public OverloadTest(int x){
        System.out.println("Inside Int version of overloaded contructor - OverloadTest");
    }
    public void print(){
        System.out.println("In print()");
    }

    //Not allowed to override a method with only return type as criteria
    /*public String print(){
        System.out.println("In print()");
        return "pass";
    }*/

//    public final void print(int x){
//        System.out.println("IN final print(int x)");
//    }

    public void print(float x){
        System.out.println("Inside Float version call");
    }
}
