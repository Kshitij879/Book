package main;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBN;

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    @Override
    public String toString(){
        return "-----------------------------\n" +
                "Book Name:   " + getBookName() + "\n" +
                "Author Name:   " + getAuthorName() + "\n" +
                "ISBN:   " + getISBN() + "\n" +
                "-----------------------------\n";
    }
    public Book(String bookName,String authorName,String ISBN){
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN = ISBN;
    }
}
