package ArraysPack;

class Books{


    String title="a";
    String author;
}
public class BooksTestDrive {
    public static void main(String abd[]){

        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "Math";
        myBooks[1].title = "Social";
        myBooks[2].title = "English";
        myBooks[0].author = "Elon";
        myBooks[1].author = "Agni";
        myBooks[2].author = "Kevin";
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }

    }
}
