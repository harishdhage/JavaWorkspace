package ClassObjectPack;

public class ReturnClassTypeDemo {
    public static void main(String[] args) {
        LogicClass logicClass = new LogicClass(2);
        LogicClass logicClass1;
        System.out.println("Before increment logicClass.a : "+logicClass.a);
        logicClass1 = logicClass.increamentMeth();

        System.out.println("After increment logicClass.a : "+logicClass1.a);
        System.out.println("After 2nd increment logicClass.a : "+logicClass1.a);

    }
}

class LogicClass{
    int a;

    LogicClass(int i){
        a = i;
    }

    LogicClass increamentMeth(){
        LogicClass logicClass = new LogicClass(a+10);
        return logicClass;
    }
}
