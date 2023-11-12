import java.util.Scanner;

public class DemoMain {

    public static void main(String[] args) {
        Alluser alluser;

        new Book("Harry Potter");
        new Book("To Kill a Mockingbird");
        new Book("Pride and Prejudice");
        new Book("The Great Gatsby");
        new Book("1984");

        System.out.println("==========================================");
        System.out.println("SELAMAT DATANG DI APLIKASI PERPUSTAKAAN");
        System.out.println("==========================================");
        System.out.println("\nSilakan Login !");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String username = input.nextLine().toLowerCase();

        if (username.equals("admin")) {
            alluser = new Admin(username);
            ((Admin) alluser).manageLibrary();
        } else {
            alluser = new User(username);
            ((User) alluser).displayMenu();
        }
    }
}