package DataTypes;

public class TypeConversion {
    public static void main(String[] args) {
        AutomaticConversion automaticConversion = new AutomaticConversion();
        automaticConversion.allowedConversion();
        automaticConversion.castConversion();
    }
}

class AutomaticConversion{
    byte a = 2;
    short m = 7;
    int x = 10;
    long g = 210;
    float y = 13.12f;
    double z= 421232.1331350083;
    public void allowedConversion(){
        long qq = x;
        int cc = m;
        double vv = y;
        System.out.println("-----------allowedConversion-----------");
        System.out.println("qq -"+qq+"\ncc - "+cc+"\n vv - "+vv);
    }

    public void castConversion(){
        short qq = (short) x;
        int cc = (int) g;
        float vv = (float) z;  //Will loose some value
        System.out.println("-----------castConversion-----------");
        System.out.println("qq -"+qq+"\ncc - "+cc+"\n vv - "+vv);
    }

}
