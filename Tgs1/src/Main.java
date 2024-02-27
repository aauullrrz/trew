import java.util.Scanner;

public class Main {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    private static final int MAHASISWA_NIM_LENGTH = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Library System ===");

        while (true) {
            System.out.println("\n1. Login as Student\n2. Login as Admin\n3. Exit");
            System.out.print("Choose option (1-3): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    studentLogin(scanner);
                    break;
                case 2:
                    adminLogin(scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private static void studentLogin(Scanner scanner) {
        System.out.print("\nEnter your NIM: ");
        String nim = scanner.next();

        if (nim.length() != MAHASISWA_NIM_LENGTH) {
            System.out.println("User Not Found");
        } else {
            System.out.println("Successful Login as Student");
        }
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("\nEnter your username (admin): ");
        String username = scanner.next();
        System.out.print("Enter your password (admin): ");
        String password = scanner.next();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Successful Login as Admin");
        } else {
            System.out.println("Admin User Not Found!!");
        }
    }
}
