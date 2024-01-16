public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int yearPublishing;

    public Book (String nameBook, Author nameAuthor, int yearPublishing) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearPublishing = yearPublishing;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getNameAuthor() {
        return nameAuthor;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
