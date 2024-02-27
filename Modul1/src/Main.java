
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama, kelamin;
        char jenis;
        System.out.print("Nama  : ");
        nama = input.nextLine();
        System.out.print("Jenis Kelamin (l/p): ");
        jenis = input.next().charAt(0);
        input.nextLine();
        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String umur = input.nextLine();

        if (jenis == 'p' || jenis == 'P') {
            kelamin = "Perempuan";
        } else if (jenis == 'l' || jenis == 'L') {
            kelamin = "Laki-Laki";
        } else {
            kelamin = "Tidak terdeteksi";
        }

        LocalDate birthDate = LocalDate.parse(umur, DateTimeFormatter.ISO_DATE);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);

        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + kelamin);
        System.out.println("Umur anda      : " + period.getYears() + " tahun " + period.getMonths() + " bulan.");
    }
}
