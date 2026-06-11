package lesson_eight.library;

public class Runner {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", "Tatiana", "Fantesy");
        Reader alice = new Reader("Alice", 18);
        Reader bob = new Reader("Bob", 45);
        Librarian john = new Librarian("John", 55);

        alice.performAction(harryPotter);
        alice.takeBook(harryPotter);
        bob.takeBook(harryPotter);
        john.performAction(harryPotter);
        alice.returnBook(harryPotter);
        bob.returnBook(harryPotter);
    }
}
