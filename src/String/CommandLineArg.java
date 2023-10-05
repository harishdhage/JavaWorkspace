package String;

public class CommandLineArg {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
//            System.out.println("args[" + i + "] : " + args[i]);
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        }
    }
}
