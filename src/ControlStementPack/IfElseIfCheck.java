package ControlStementPack;

public class IfElseIfCheck {
    public static void main(String[] args) {
        IfConditionCheck ifConditionCheck = new IfConditionCheck();
        ifConditionCheck.IfElseIfLogicTest('m');
    }
}

class IfConditionCheck{
    protected void IfElseIfLogicTest(char gender){
        if (gender == 'm')
            System.out.println("Gender is Male");
        else if (gender == 'f')
            System.out.println("Gender is Female");
        else if (gender == 't')
            System.out.println("Gender is Third");
       //last else is not mandatory
        else
            System.out.println("Invalid input");
    }
}