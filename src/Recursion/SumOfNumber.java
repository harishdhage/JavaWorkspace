package Recursion;

import java.util.Objects;

public class SumOfNumber {
    public static void main(String[] args) {
        SumOfNNumbersDemo sumOfNumber = new SumOfNNumbersDemo();
        sumOfNumber.recursiveSumOfNumber(3);
    }
}

class SumOfNNumbersDemo{
    public int recursiveSumOfNumber(int n){
        if (n == 0){
            return 0;
        }
        int sum;

        sum = recursiveSumOfNumber(n-1) + n;
        System.out.println("Sum - "+sum);
        return sum;
    }

}
