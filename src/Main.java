
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.books = new Book[3];
        Person person = new Person();
        person.books = new Book[library.books.length];

        Book book = new Book();
        book.id = 1;
        book.title = "Мастер и Маргарита";
        book.author = "Булгаков";
        library.addBook(book);

        Book book1 = new Book();
        book1.id = 2;
        book1.title = "Ромео и Джульетта";
        book1.author = "Шекспир";
        library.addBook(book1);

        Book book2 = new Book();
        book2.id = 3;
        book2.title = "Властелин Колец";
        book2.author = "Толкин";
        library.addBook(book2);

        //Вывод на экран книги библиотеки
        library.displayBookLibrary();

        //Передача книги студенту
        library.lendBook(person, "Ромео и Джульетта");
        library.lendBook(person, "Мастер и Маргарита");

        //Возврат книги в библиотеку
        library.acceptBook(person, "Ромео и Джульетта");

        //Вывод на экран книги библиотеки
        library.displayBookLibrary();

        //Вывод книг студнета
        person.displayBookPerson();
    }
}