package methodConcept;

public class ReturnObject {
    public static void main(String[] args) {
        Test test1 = new Test(2);
        Test test2;
        test2 = test1.incrementByTen();
        System.out.println("test1.a = "+test1.a);
        System.out.println("test2.a = "+test2.a);
        test2=test2.incrementByTen();
        System.out.println("Second time increment of test2.a = "+test2.a);
    }
}

class Test{
    int a;

    Test(int x){
        a=x;
    }

    Test incrementByTen(){
        Test t = new Test(a+10);
        return t;
    }
}
