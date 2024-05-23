package DSA.Complexity;

public class BigOofNSquare {
    public static void main(String[] args) {
        TestBigOofNSquare t1 = new TestBigOofNSquare();
        t1.complexityOfNestedLoop(5);

        //Hence O(n^2 + n)
        //Nested loop dominates over simple loop, \
        // hence the complexity is measured only for nested as O(n^2)
        t1.complexityOfNestedLoopDominence(5);
    }
}


class TestBigOofNSquare{

    //Nested loop gives O(n^2)
    protected void complexityOfNestedLoop(int num){
        for(int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                System.out.println(i+" "+j);
            }
        }
    }

    protected void complexityOfNestedLoopDominence(int num){
        //Nested loop gives O(n^2)
        for(int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                System.out.println(i+" "+j);
            }
        }

        //Below for loop give O(n)
        for(int i=0; i<num; i++){
                System.out.println(i);
        }
        //Hence O(n^2 + n)
        //Nested loop dominates over simple loop, \
        // hence the complexity is measured only for nested as O(n^2)
    }
}