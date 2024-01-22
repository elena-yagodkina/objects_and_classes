import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author kathleenRowling = new Author("Kathleen", "Rowling");
        System.out.println(kathleenRowling);

        Author stephenieMeyer = new Author("Meyer", "Stephenie");
        System.out.println(stephenieMeyer);

        Book bookOne = new Book("Garry Potter", kathleenRowling, 1997);
        System.out.println(bookOne);

        Book bookTwo = new Book("Twilight", stephenieMeyer, 2005);
        System.out.println(bookTwo);

        bookOne.setYearPublishing(1998);
        System.out.println(bookOne.getYearPublishing());

        System.out.println(bookOne.equals(bookTwo));
        System.out.println(bookOne.hashCode());
        System.out.println(bookTwo.hashCode());
        System.out.println(kathleenRowling.equals(stephenieMeyer));
        System.out.println(kathleenRowling.hashCode());
        System.out.println(stephenieMeyer.hashCode());
    }
}