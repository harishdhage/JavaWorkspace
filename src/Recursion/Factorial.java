package Recursion;

public class Factorial {
    public static void main(String[] args) {

        FactorialCalc factorialCalc = new FactorialCalc();
        System.out.println("Factorial of 5 is "+factorialCalc.factorialLogic(5));
        System.out.println("Factorial of 3 is "+factorialCalc.factorialLogic(3));
    }
}

class FactorialCalc{

    int factorialLogic(int num){
        int result;
        if (num == 1){
            return 1;
        }
        result = factorialLogic(num-1)+num;
        return result;
    }
}
