package InferenceDemo;

public class InferenceTest {
    public static void main(String[] args) {
        InferenceUnderstanding infer = new InferenceUnderstanding();

    }
}

class InferenceUnderstanding{
    //Not allowed to use the var in class variable
//    private var inferClassVariable;

    //Not allowed to use the var as return type
    /*public var inferSetter(var inferClassVariable){
        this.inferClassVariable = inferClassVariable;

    }*/

    public int varTest(){
        //Use of var only allowed in local variable
        var x = 10;
        //Not allowed to define variable type var without initialization
        /*var a;
        a = 25;*/
        var arraydef = new int[5];
        //Below 3 case of array declaration not allowed
//        var arrayA[] = new int[3];
//        var[] arrayB = new int[4];
//        var arrayC = {1, 2, 3};

        var b = 10.25+x;
        int var = 5;
        var addition = var++;

        return x;
    }

    // Not allowed to use var in method parameter
   /* public void varMeth(var b){

    }*/


}
