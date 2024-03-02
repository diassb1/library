public class Library {
    Book[] books;

    //Добавление книги
    void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    //Удаление книги
    void deleteBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {        //не работает toLowerCase()
                books[i] = null;
            }
        }
    }

    void displayBookLibrary() {
        System.out.println("Книги библиотеки: ");
        for (Book boo : books) {
            if (boo == null) {
                continue;
            }
            System.out.printf("Номер ID: %d\nНазвание книги: %s\nАвтор: %s \n", boo.id, boo.title, boo.author);
        }
        System.out.println("\n");
    }

    void lendBook(Person person, String bookName) {
        int indexBook = findBook(bookName);
        if (indexBook == -1) {
            System.out.println("Нету такой книги");
            return;
        }

        person.addBook(books[indexBook]);
        books[indexBook] = null;
    }

    void acceptBook(Person person, String bookName) {
        int indexBook = person.findBook(bookName);
        if (indexBook == -1) {
            System.out.println("Нету такой книги");
            return;
        }

        addBook(person.books[indexBook]);
        person.books[indexBook] = null;
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