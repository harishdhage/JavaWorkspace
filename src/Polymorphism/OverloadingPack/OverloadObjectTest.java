package Polymorphism.OverloadingPack;

public class OverloadObjectTest {
    public static void main(String[] args) {
        OverloadClassObject overloadClassObject = new OverloadClassObject(10, 20);
        OverloadClassObject overloadClassObject1 = new OverloadClassObject(20, 30);
        OverloadClassObject overloadClassObject2 = new OverloadClassObject(10, 20);
        boolean equalFlag = overloadClassObject.equalTo(overloadClassObject1);
        System.out.println("overloadClassObject.equalTo(overloadClassObject1) = "+equalFlag);
        equalFlag = overloadClassObject.equalTo(overloadClassObject2);
        System.out.println("overloadClassObject.equalTo(overloadClassObject2) = "+equalFlag);
    }
}

class OverloadClassObject{
    int x, y;

    OverloadClassObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected boolean equalTo(OverloadClassObject overloadClassObject){
        boolean returnFlag;
        if (overloadClassObject.x == x && overloadClassObject.y == y)
            returnFlag = true;
        else returnFlag = false;
        return returnFlag;
    }
}