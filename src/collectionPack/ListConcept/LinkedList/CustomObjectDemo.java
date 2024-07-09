package collectionPack.ListConcept.LinkedList;

import java.util.LinkedList;

public class CustomObjectDemo {
    public static void main(String[] args) {
        LinkedList<Address> addresses = new LinkedList<>();
        addresses.add(new Address("Harish","Choudeshwary Nagar","RNR","581115"));
        addresses.add(new Address("Pooja","Gokul road","HBL","581321"));
        addresses.add(new Address("Apple","Apple street", "NY", "53351"));

        for (Address add:addresses) {
            System.out.println(add);
        }
    }
}

class Address{
    private String name, street, city, code;

    Address(String name, String street, String city, String code){
        this.name = name;
        this.street = street;
        this.city = city;
        this.code = code;
    }

    public String toString(){
        System.out.println();
        return name+"\n"+street+"\n"+city+" - "+code;
    }
}
