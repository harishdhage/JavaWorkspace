package ControlStementPack;

public class SwitchStmntCheck {
    public static void main(String[] args) {
        SwitchTest switchTest = new SwitchTest("Nov");
        switchTest.checkSwitch();
    }


}

class SwitchTest{
    String month;
    public SwitchTest(String month){
        this.month = month;
    }

    public void checkSwitch(){
        switch (month){
            case "Jan" :
                System.out.println("Jan has 31 days");
            case "Feb" :
                System.out.println("Feb has 28 days");
            case "Mar" :
                System.out.println("Mar has 31 days");
            case "Apr" :
                System.out.println("Apr has 30 days");
            case "May" :
                System.out.println("May has 31 days");
            case "Jun" :
                System.out.println("Jun has 30 days");
            case "Aug" :
                System.out.println("Aug has 31 days");
            case "Sept" :
                System.out.println("Sept has 30 days");
            case "Oct" :
                System.out.println("Oct has 31 days");
                break; // If we dont provide break, then switch will execute next case
            case "Nov" :
                System.out.println("Nov has 30 days");
            case "Dec" :
                System.out.println("Dec has 31 days");
                //Duplicate case not allowed
            /*case "Dec" :
                System.out.println("Dec has 31 days");*/
                //Default is not mandatory
            /*default :
                System.out.println("Invalid entry");*/
        }
    }
}
