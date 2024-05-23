package DSA.Complexity;


// This is to understand the O(n)
public class BigOofN {
    public static void main(String[] args) {
        TestBigOofN t = new TestBigOofN();
        t.complexityOfOneForLoop(10);
        t.complexityOfTwoSiblingForLoop(10);
    }
}

//In below both cases code efficiency is O(n)
class TestBigOofN{
    public void complexityOfOneForLoop(int x){
        for (int i=0; i<x; i++){
            System.out.println(i);
        }
    }

    public void complexityOfTwoSiblingForLoop(int x){
        for (int i=0; i<x; i++){
            System.out.println(i);
        }

        for (int j=0; j<x; j++){
            System.out.println(j);
        }
    }
}
