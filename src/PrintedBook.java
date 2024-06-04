

public class PrintedBook extends Book{

    private int pages;

    public PrintedBook(String titel, String author, int year, int pages){
        super(titel,author,year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pages: " + pages;
    }
}
