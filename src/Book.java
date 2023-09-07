public class Book {
    private int id;
    private String bookName;
    private int numberOfPages;
    private String authorsName;
    private int publicDate;

    public Book(int id, String bookName, int numberOfPages, String authorsName, int publicDate) {
        this.id = id;
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.authorsName = authorsName;
        this.publicDate = publicDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public int getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(int publicDate) {
        this.publicDate = publicDate;
    }
}
