public class Person {
    String name;
    int age;
    Book[] books;

    void displayBookPerson() {
        System.out.println("Книги студента: ");
        for (Book boo : books) {
            if (boo == null) {
                continue;
            }
            System.out.printf("Номер ID: %d\nНазвание книги: %s\nАвтор: %s \n", boo.id, boo.title, boo.author);
        }
    }

    void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    int findBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equals(title)) {
                return i;
            }
        }
        return -1;
    }
}