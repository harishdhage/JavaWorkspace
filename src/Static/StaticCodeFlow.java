package Static;

public class StaticCodeFlow {
    static int a = 10;
    static int b;

    static void meth(int x){
        System.out.println(" x : "+x);
        System.out.println("a : " +a);
        System.out.println("b : "+b);
    }



    public static void main(String[] args) {
        System.out.println("Inside Main() ");
        meth(35);
    }

    static {
        System.out.println("Inside static block");
        b = a+10;
    }
}
