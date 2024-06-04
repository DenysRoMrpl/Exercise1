import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }
    public void bookAdd(Book book){
        books.add(book);
        System.out.println("Book added: " + book.toString());
    }
    public void removeBook(String titel){
        for(Book book : books){
            if(book.getTitel().equals(titel)){
                books.remove(book);
                System.out.println("Book deleted: " + titel);
            }
            else
                System.out.println("Book is not found");
        }
    }
    public Book findBookByTitel(String titel){
        for(Book book : books){
            if(book.getTitel().equals(titel)) {
                return book;
            }
        }
        return null;
    }
    public void ListBooks(){
        if(books.isEmpty())
            System.out.println("List is empty.");
        else{
            for(Book book : books){
                System.out.println(book);
            }
        }
    }
    public void checkBookType(String Titel){
        Book book = findBookByTitel(Titel);
        if(book != null) {
            if (book instanceof EBook) {
                System.out.println("Book " + Titel + " is E-Book");
            } else if (book instanceof PrintedBook) {
                System.out.println("Книга " + Titel + " normal Book");
            } else
                System.out.println("unknown format ");
        }
        else{
            System.out.println("The book with the title '" + Titel + "' is not found.");
        }
    }
}


