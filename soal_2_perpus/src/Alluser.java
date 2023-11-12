public class Alluser {
    private String username;

    public Alluser(String username) {
        this.username = username;
    }

    public void displayAllBooks() {
        System.out.println("\nList Buku :");
        for (Book book : Book.getAllBooks()) {
            System.out.println(book);
        }
    }
}
