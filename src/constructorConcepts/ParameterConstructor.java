package constructorConcepts;

//Demonstrate to check the call-by-reference object ref
public class ParameterConstructor {
    public static void main(String[] args) {
        BoxA boxA = new BoxA(10,20,30);
        double volume = boxA.volume();
        System.out.println("Volume of BoxA : "+volume);
        BoxA boxB = new BoxA(2,3,4);
        double volumeB = boxB.volume();
        System.out.println("Volume of BoxB : "+volumeB);
        BoxA boxA1 = boxB;
        boxB = null;
        double volumeA1 = boxA1.volume();
        System.out.println("Volume of BoxA1 : "+volumeA1);
    }
}

class BoxA{
    int width, height, depth;
    double vol;
    public BoxA(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    protected double volume(){
        return vol = width * height * depth;
    }
}
