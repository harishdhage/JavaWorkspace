package methodConcept;

public class CallByValue {
    public static void main(String[] args) {
        int a = 10, b = 20;
        CBV cbv = new CBV();
        System.out.println("Before Math a : "+a+" | b : "+b);
        cbv.math(a,b);
        System.out.println("After Math a : "+a+" | b : "+b);
    }
}

class CBV{
    public void math(int a, int b){
        a*=2;
        b/=2;
        System.out.println("Value of a : "+a+" | b : "+b);
    }
}