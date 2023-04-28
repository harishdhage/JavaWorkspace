package ArraysPack;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        A a = new A();
        a.x();
    }
}


class A{
    public void x(){
        int[] x = {10, 4, 54, 23, 86,1};
        int[] y = {3, 65, 23, 2, 8, 11};
        int[] z = new int[x.length+y.length];
        int ind = x.length;

        for(int i = 0; i<x.length; i++){
            z[i] = x[i];
        }
        for(int j=0; j<y.length; j++){
            z[ind] = y[j];
            ind++;
        }
        int[] xl = new int[x.length+y.length];
        xl = Arrays.copyOfRange(x,0,x.length-1); // This statement allows to copy once array to another
        xl = Arrays.copyOfRange(y, 0, y.length-1); // But for second array copy, it will over write
        Arrays.sort(z);
        System.out.println("Sorted array \n");
        for(int a: z){
            System.out.print(a+" ");
        }
    }

}
