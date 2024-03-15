import java.util.Scanner;

public class Main {
    private static final String usn = "admin";
    private static final String pw = "admin";
    private static final int nim = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//membaca input
        System.out.println("=== Library System ===");

        while (true) {
            System.out.println("\n1. Login as Student\n2. Login as Admin\n3. Exit");
            System.out.print("Choose option (1-3): ");
            int pilihh = scanner.nextInt();

            switch (pilihh) {
                case 1:
                    studentLogin(scanner);
                    break;
                case 2:
                    adminLogin(scanner);
                    break;
                case 3:
                    System.out.println("Thanks");
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private static void studentLogin(Scanner scanner) {
        System.out.print("\nEnter your NIM: ");
        String mhsw = scanner.next();

        if (mhsw.length() != nim) {
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

        if (username.equals(usn) && password.equals(pw)) {
            System.out.println("Successful Login as Admin");
        } else {
            System.out.println("Admin User Not Found!!");
        }
    }
}
