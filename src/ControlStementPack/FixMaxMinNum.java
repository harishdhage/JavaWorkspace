package ControlStementPack;

//Demonstrate to find the min and Max num from array using for-each which performs the sequential search
public class FixMaxMinNum {
    public static void main(String[] args) {
        int arrSet[] = {4,1,82,3,6,31};
        int max=0,min=0;
        for (int num : arrSet) {

            if (max < num) {
                max = num;
            }
            if (min > num || min==0) {
                min = num;
            }
        }
        System.out.println("Max : "+max+" | Min : "+min);
    }
}
