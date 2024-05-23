package DSA.Complexity;

public class BigOofOne {
    public static void main(String[] args) {
        TestBigOofOne t2 = new TestBigOofOne();
        t2.complexityOfBigOofOne(3);
    }
}

class TestBigOofOne{
    protected int complexityOfBigOofOne(int n){
        return n+n; // Complexity is O(1) which is best case due to only one operation takes places,
                    //eventhough increase of n like return n+n+n; still remains best complexity as O(1)
                    // due to one operation.
    }
}
