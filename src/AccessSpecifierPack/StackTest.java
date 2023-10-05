package AccessSpecifierPack;

public class StackTest {
    public static void main(String[] args) {
        StackPushPop stackPushPop = new StackPushPop();
        StackPushPop stackPushPop1 = new StackPushPop();

        for (int i = 0; i<10; i++)
            stackPushPop.pushItemToStack(i);
        for (int i = 10; i<20; i++)
            stackPushPop.pushItemToStack(i);

        System.out.println("Stack in stackPushPop ");
        for (int i = 0; i<10; i++)
            System.out.println(stackPushPop.popItemFromStack());

        System.out.println("Stack in stackPushPop1 ");
        for (int i = 10; i<20; i++)
            System.out.println(stackPushPop1.popItemFromStack());
    }
}

class StackPushPop{
    private int stck[] = new int[10];
    private int tos;

    StackPushPop(){
        tos = -1;
    }

    void pushItemToStack(int item){
        if (tos == 9) {
            System.out.println("Stack is full!!!");
        }else
            stck[++tos] = item;
    }

    int popItemFromStack(){
        if (tos < 0){
            System.out.println("Stack is underflow!!!");
            return 0;
        }else
            return stck[tos--];
    }
}
