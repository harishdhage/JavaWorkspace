package ArraysPack;

public class Hobbit {
    String name;
    int age;
    public static void main(String[] args) {
        Hobbit[] h = new Hobbit[3];
        int z = -1;

        while (z < 2) {
//            String address;
            z = z + 1;
            h[z] = new Hobbit();
            h[z].name = "bilbo";
            //Not allowed to use the local class variable
//            h[z].address = "First lane";
            h[z].age=10;
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z++;
        }
    }
}
