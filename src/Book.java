import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название книги - " + this.title + ", Автор книги - " + this.nameAuthor + ", Год издания - " + this.yearPublishing;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
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
