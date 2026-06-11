package lesson_eight.library;

public class Librarian extends Person{


    public Librarian(String name, int age) {
        super(name, age);
    }

    public void addBook(Book book) {
        System.out.println(book.toString());
    }

    @Override
    public void performAction(Book book) {
        if (book.isAvailable()) {
            System.out.println("Книга доступна");
        } else {
            System.out.println("Книга не доступна");
        }
    }
}
