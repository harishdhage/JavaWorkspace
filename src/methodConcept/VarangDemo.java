package methodConcept;

public class VarangDemo {
    public static void main(String[] args) {
        VarangUnderstandingTest varangUnderstandingTest = new VarangUnderstandingTest();
        int[] a = {10};
        int[] b = {90, 60, 30};
        int c[] = {};
        varangUnderstandingTest.oldVarangMeth(a);
        varangUnderstandingTest.oldVarangMeth(b);
        varangUnderstandingTest.oldVarangMeth(c);

        System.out.println("New Varang");
        varangUnderstandingTest.newVarangMeth(a);
        varangUnderstandingTest.newVarangMeth(b);
        varangUnderstandingTest.newVarangMeth(c);

    }
}

class VarangUnderstandingTest{
    void oldVarangMeth(int v[]){
        System.out.println("Number of Arguments : "+v.length + "\n Contents : ");
        for (int x:v) {
            System.out.println(x + " ");
        }
    }

    void newVarangMeth(int... v){
        System.out.println("Number of Arguments : "+v.length + "\n Contents : ");
        for (int x:v) {
            System.out.println(x + " ");
        }
    }

    // NOTE - Not allowed multiple Varang arguments
    //      - Varang should be last in argument list for the method
    /*void newVarangMeth2(int a, double... x, char c, int... v){
        System.out.println("Number of Arguments : "+v.length + "\n Contents : ");
        for (int x:v) {
            System.out.println(x + " ");
        }
    }*/
}
