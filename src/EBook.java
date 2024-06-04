public class EBook extends Book{

    private int fileSize;
    private String format;

    public EBook(String titel, String author, int year, int fileSize, String format){
        super(titel,author,year);
        this.fileSize = fileSize;
        this.format = format;
    }

    public int getFileSize() {
        return fileSize;
    }
    public String getFormat() {
        return format;
    }

    @Override
    public String toString(){
        return super.toString() + ", Size: " + fileSize + ", Format: " + format;
    }
}
