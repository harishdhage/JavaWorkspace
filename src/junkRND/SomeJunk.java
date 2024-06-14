package junkRND;

public class SomeJunk {
    String args[] = {
            "1",
            "2"
    };

    public static void main(String args[]) {
        System.out.println(args.length);
        if (args.length > 0)
            System.out.println("X "+args.length);
    }
}
