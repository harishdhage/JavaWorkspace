package Polymorphism.OverloadingPack;

public class CallByReferenceDemo {
    public static void main(String[] args) {
        int val1 = 10, val2 = 20;
        String strName = "Apple";
        TestCallByRef testCallByRef = new TestCallByRef(val1, val2, strName);
        System.out.println("Before changes a : "+testCallByRef.a+" b : "+testCallByRef.b+" Name : "+testCallByRef.name);
        testCallByRef.update(testCallByRef);
        System.out.println("After changes a : "+testCallByRef.a+" b : "+testCallByRef.b+" Name : "+testCallByRef.name);
    }
}

class TestCallByRef{
    int a,b;
    String name;

    TestCallByRef(int x, int y, String z){
        a = x;
        b = y;
        name = z;
    }

    //This method acts on Call By Ref
    protected void update(TestCallByRef testCallByRef){
        testCallByRef.a *= 2;
        testCallByRef.b /= 10;
        testCallByRef.name += "Joker";
    }


}
