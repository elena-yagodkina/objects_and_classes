import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author kathleenRowling = new Author("Kathleen", "Rowling");
        System.out.println(kathleenRowling.getFirstName() + " " + kathleenRowling.getLastName());

        Author stephenieMeyer = new Author("Meyer", "Stephenie");
        System.out.println(stephenieMeyer.getFirstName() + " " + stephenieMeyer.getLastName());

        Book bookOne = new Book("Garry Potter", kathleenRowling, 1997);
        System.out.println(bookOne.getTitle() + ", " + bookOne.getNameAuthor().getFirstName() + ", " + bookOne.getYearPublishing());

        Book bookTwo = new Book("Twilight", stephenieMeyer, 2005);
        System.out.println(bookTwo.getTitle() + ", " + bookTwo.getNameAuthor().getFirstName() + ", " + bookTwo.getYearPublishing());

        bookOne.setYearPublishing(1998);
        System.out.println(bookOne.getYearPublishing());

    }
}