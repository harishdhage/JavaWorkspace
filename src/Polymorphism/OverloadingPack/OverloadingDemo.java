package Polymorphism.OverloadingPack;

public class OverloadingDemo {
    static public void main(String[] args) {
        OverloadTest ot = new OverloadTest(); // Call no-parameter constructor
        new OverloadTest(20); // Call int version Constructor
        ot.print();
        ot.print(1);
        int x = 10;
        double y = 2143;
//        float ft = 212.12;
        ot.print(x); // Calls the Float version print,
        // also it call Double version if Float version print not exists due to Auto-Type conversion
        ot.print(y);// Calls the double version
    }
}

class OverloadTest{
    public OverloadTest(){
        System.out.println("Inside a NO parameter contructor");
    }

    public OverloadTest(int x){
        System.out.println("Inside Int version of overloaded contructor - OverloadTest, x - "+x);
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
        System.out.println("Inside Float version call, x - "+x);
    }

    public void print(double x){
        System.out.println("Inside Double version call, x - "+x);
    }
}
