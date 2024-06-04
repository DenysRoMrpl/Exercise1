

public abstract class Book {
    private String titel;
    private String author;
    private int year;

    public Book(String titel, String author, int year){
        this.titel = titel;
        this.author = author;
        this.year = year;
    }
    public String getTitel(){
        return titel;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }

    public String toString(){
        return "Titel: " + titel + ", Author: " + author + ", year: " + year + " ";
    }
}

