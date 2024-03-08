package methodConcept;

public class CallByReference {
    public static void main(String[] args) {
        CBR cbr = new CBR(10,20);
        System.out.println("Before Math x : "+cbr.x+" | y : "+cbr.y);
        cbr.math(cbr);
        System.out.println("After Math x : "+cbr.x+" | y : "+cbr.y);
    }
}

class CBR{
    int x, y;
    CBR(int a, int b){
        x=a;
        y=b;
    }
    public void math(CBR cbr){
        cbr.x*=2;
        cbr.y/=2;
        System.out.println("Value of x : "+x+" | y : "+y);
    }
}