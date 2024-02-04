package OperatorsPack;

public class TernaryDemo {
    public static void main(String[] args) {
        TernaryOptrTest ternaryOptrTest = new TernaryOptrTest();
        ternaryOptrTest.checkTernary(3,9);
    }
}

class TernaryOptrTest{
    public void checkTernary(int n1, int n2){
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Largest among n1 and n2
        int max = (n1 > n2) ? n1 : n2;

        // Print the largest number
        System.out.println("Maximum is = " + max);
    }
}
