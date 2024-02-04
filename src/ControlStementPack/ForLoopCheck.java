package ControlStementPack;

public class ForLoopCheck {
    public static void main(String[] args) {
        PrimeForLoop primeForLoop = new PrimeForLoop(13);
        primeForLoop.checkPrime();
    }
}

//This is just demonstrate to check the for loop, and check  the prime num
//Prime is which is divisible by itself
class PrimeForLoop{
    int num;
    boolean isPrime;
    PrimeForLoop(int num){
        this.num = num;
    }

    void checkPrime(){
        if (num<2) isPrime=false;
        else isPrime=true;
        int x=0;
        for (int i=2; i<=num/i; i++){
            System.out.println("For : "+ ++x);
            if ((num%i)==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime) System.out.println(num+" is a Prime num");
        else System.out.println(num+" is a Not Prime num");
    }
}
