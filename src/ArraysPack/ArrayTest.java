package ArraysPack;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoolTest bt = new BoolTest(false);
		bt.testFlag();
		bt.lengthTest();
		bt.arrayResize();
	}

}

class BoolTest{
	boolean f;
	public BoolTest(boolean f) {
		// TODO Auto-generated constructor stub
		this.f = f;
	}
	
	public void testFlag(){
		if(f){
			System.out.println("Flag is true - "+f);
		}else {
			System.out.println("Flag is false - "+f);
		}
	}

	public void lengthTest(){
		String str = "Harish Dhage";
		String strArray[]={"Mon","Tue","Wed","Thu"};
		System.out.println("String length - "+str.length()+" | Array length - "+strArray.length);
	}

	public void arrayResize(){
		int arrayX[] = new int[5];
//		arrayX[] = new int[6]; We cant increase the size once defined
		System.out.println("Array length before resize - "+arrayX.length);
		Arrays.copyOf(arrayX, 7);
		for (int i = 0; i < arrayX.length; i++)
			arrayX[i]=100+i;
		System.out.println("Array after resize - "+arrayX.length);
	}
}
