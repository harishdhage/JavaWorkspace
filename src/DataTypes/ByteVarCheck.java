package DataTypes;

public class ByteVarCheck {
    public static void main(String[] args) {
        byte b = 10;
        b += 7; // Here Java understand that byte + int is type casted to byte
        System.out.println("Byte B : "+b);
        byte c = 10;
//        c = c+7; // Here explicit type cast need to defined
        System.out.println("Byte C : "+c);
    }
}
