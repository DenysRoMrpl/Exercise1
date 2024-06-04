import org.w3c.dom.html.HTMLTitleElement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        EBook book1 = new EBook("Hello", "Denys", 2024, 3,"PDF");
        PrintedBook book2 = new PrintedBook("Tschuss", "NotDenys", 2025, 300);
        library.bookAdd(book1);
        library.bookAdd(book2);

        System.out.println("\nList: \n");

        library.ListBooks();

        System.out.println("\nFind Book by Titel: \n");

        Book foundBook = library.findBookByTitel("Hello");
        if(foundBook != null){
            System.out.println("Hello: " + foundBook);
        }
        else{
            System.out.println("Book is not found\n");
        }

        library.checkBookType("Hello");

    }
}
