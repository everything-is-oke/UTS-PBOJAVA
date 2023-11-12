import java.util.Scanner;
public class User extends Alluser {

    public User(String username) {
        super(username);
    }

    public void displayMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Anda login sebagai user");
        System.out.println("\n1. Tampilkan list Buku");
        System.out.print("Silakan pilih menu di atas : ");
        int choiceUser = input.nextInt();

        if (choiceUser == 1) {
            displayAllBooks();
        } else {
            System.out.println("Pilihan tidak tersedia !");
        }

        input.close();
    }
}