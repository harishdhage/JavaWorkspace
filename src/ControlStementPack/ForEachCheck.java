package ControlStementPack;

//Demonstrate to verify the for each loop. For each basically used for iterating the Set and DB values
public class ForEachCheck {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int x:num) {
            System.out.println("Value of x : "+x);
            sum +=x ;
            if (x==5)break;

        }
        System.out.println("Summation of first 5 element : "+sum);
    }
}
