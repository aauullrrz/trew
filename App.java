import  java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Tabung tabung = new Tabung("tabung");
        Kubus kubus = new Kubus("kubus");
        Balok balok = new Balok("balok");
        int choose;

        do {
            System.out.println("Pilih bangun ruang:");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Tabung");
            System.out.println("4. Exit");
            System.out.println("choose:");
            choose = scanner.nextInt();

        switch (choose) {
            case 1:
                balok.inputNilai();
                balok.luasPermukaan();
                balok.volume();
                break;
            case 2:
                kubus.inputNilai();
                kubus.luasPermukaan();
                kubus.volume();
                break;
            case 3:
                tabung.inputNilai();
                tabung.luasPermukaan();
                tabung.volume();
                break;
            case 4:
                System.out.println("Oke terimakasih");
            default:
                System.out.println("tidak valid");
        }
        } while (choose != 4);
        scanner.close();
    }
}