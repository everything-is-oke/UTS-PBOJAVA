public class Book {
    public static Book[] books = new Book[0];
    private String title;

    public Book(String title) {
        this.title = title;
        addBook(this);
    }

    public String getTitle() {
        return title;
    }

    public static Book[] getAllBooks() {
        return books.clone();
    }

    private static void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = book;
        books = newBooks;
    }

    @Override
    public String toString() {
        return title;
    }
}