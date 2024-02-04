package ArraysPack;

public class Matrix2DArray {
    public static void main(String[] args) {
        Matrix2D matrix2D = new Matrix2D();
        matrix2D.irregularArray();

        matrix2D.patternArray();
    }
}

class Matrix2D{
    public void irregularArray(){
        int uneven[][] = new int[4][];
        uneven[0] = new int[1];
        uneven[1] = new int[2];
        uneven[2] = new int[3];
        uneven[3] = new int[4];

        int i, j, k =0;
        for(i=0;i<4;i++){
            for (j=0;j<=i;j++){
                uneven[i][j] = k;
                k++;
            }
        }

        for(i=0;i<4;i++){
            for (j=0;j<=i;j++){
                System.out.print(uneven[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public void patternArray(){
        char arrayChar[][] = new char[4][];
        arrayChar[0] = new char['*'];
        arrayChar[1] = new char['*'];
        arrayChar[2] = new char['*'];
        arrayChar[3] = new char['*'];

        int i,j=0;
        char k='*';
        for (i=0;i<4;i++){
            for (j=0;j<=i;j++){
                arrayChar[i][j] = k;
            }
        }

        for (i=0;i<4;i++){
            for (j=0;j<=i;j++){
                System.out.print(arrayChar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
