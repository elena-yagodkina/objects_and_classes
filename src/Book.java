public class Book {
    private String title;
    private Author nameAuthor;
    private int yearPublishing;

    public Book (String title, Author nameAuthor, int yearPublishing) {
        this.title = title;
        this.nameAuthor = nameAuthor;
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return title;
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
