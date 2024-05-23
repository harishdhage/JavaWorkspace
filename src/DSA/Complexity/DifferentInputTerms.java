package DSA.Complexity;

public class DifferentInputTerms {
    public static void main(String[] args) {
        TestDifferentInputTerms t3 = new TestDifferentInputTerms();
        t3.siblingLoop(3, 5); //O(a+b)
        t3.nestedLoop(3, 5); //O(a*b)
    }
}

class TestDifferentInputTerms{
    //Earlier for simple single input for sibling loop complexity is O(n). Not the same for this.
    //Combining both loop complexity which gives O(a+b), because both input could be different num.
    //This result the number of iteration could be different for each

    protected void siblingLoop(int a, int b){
        //Below for loop complexity O(n)
        for (int i=0; i<a; i++) {
            System.out.println(i);
        }
        //Below for loop complexity O(n)
        for (int j=0; j<b; j++) {
            System.out.println(j);
        }
    }

    //Earlier for simple single input for sibling loop complexity is O(n^2). Not the same for this.
    //Combining both loop complexity which gives O(a*b), because both input could be different num.
    //This result the number of iteration could be different for each

    protected void nestedLoop(int a, int b){
        //Below for loop complexity O(n)
        for (int i=0; i<a; i++) {
            System.out.println(i);
            //Below for loop complexity O(n)
            for (int j=0; j<b; j++) {
                System.out.println(j);
            }
        }

    }
}