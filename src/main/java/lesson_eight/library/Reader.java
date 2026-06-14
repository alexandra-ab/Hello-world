package lesson_eight.library;

public class Reader extends Person{
    public Reader(String name, int age) {
        super(name, age);
    }

    public void takeBook(Book book) {
        if (book.isAvailable()) {
            System.out.println(name + " берет книгу " + book.getTitle());
            book.setAvailability(false);
            book.setReaderName(this.name);
        } else {
            System.out.println("Книга не доступна.");
        }
    }

    public void returnBook(Book book) {
        if (book.getReaderName().equals(this.name)) {
            System.out.println(name + " вернул книгу " + book.getTitle());
            book.setAvailability(true);
            book.setReaderName("");
        } else {
            System.out.println("Книга не ваша");
        }

    }

    @Override
    public void performAction(Book book) {
        System.out.println("Книга: " + book.getTitle() + " " + book.getAuthor() + " " + book.getGenre() );
    }
}
