import java.util.Scanner;

public class Admin extends Alluser {

    public Admin(String username) {
        super(username);
    }

    public void addBook(String title) {
        new Book(title);
        System.out.println("Buku Berhasil ditambahkan.");
    }

    public void removeBook(String title) {
        Book[] currentBooks = Book.getAllBooks();
        for (int i = 0; i < currentBooks.length; i++) {
            if (currentBooks[i].getTitle().equals(title)) {
                Book[] newBooks = new Book[currentBooks.length - 1];
                System.arraycopy(currentBooks, 0, newBooks, 0, i);
                System.arraycopy(currentBooks, i + 1, newBooks, i, currentBooks.length - i - 1);
                Book.books = newBooks;
                System.out.println("Buku Berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void manageLibrary() {
        Scanner inputAdmin = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Anda login sebagai admin");

        while (!exit) {
            System.out.println("\n1. Tambahkan Buku\n2. Hapus Buku\n3. Keluar");
            System.out.print("Silakan pilih menu di atas : ");
            int choice = inputAdmin.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku : ");
                    inputAdmin.nextLine();
                    String bookTitle = inputAdmin.nextLine();

                    addBook(bookTitle);
                    displayAllBooks();
                    break;
                case 2:
                    System.out.print("Masukkan judul buku yang ingin dihapus : ");
                    inputAdmin.nextLine();
                    String bookTitleToRemove = inputAdmin.nextLine();

                    removeBook(bookTitleToRemove);
                    displayAllBooks();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia !");
            }
        }
    }
}
