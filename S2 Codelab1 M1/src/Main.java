import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, jenisKelaminLengkap, tanggalLahirStr;
        char jenisKelamin;
        int umurTahun, umurBulan, umurHari, umurDetik;

        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        jenisKelamin = scanner.next().charAt(0);
        jenisKelaminLengkap = (jenisKelamin == 'L') ? "Laki-laki" : "Perempuan";

        System.out.print("Masukkan tanggal lahir (yyyy-mm-dd): ");
        tanggalLahirStr = scanner.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDateTime waktuLahir = tanggalLahir.atStartOfDay();
        LocalDateTime waktuSekarang = LocalDateTime.now();
        Period selisih = Period.between(tanggalLahir, LocalDate.now());

        umurTahun = selisih.getYears();
        umurBulan = selisih.getMonths();
        umurHari = selisih.getDays();
        umurDetik = (int) java.time.Duration.between(waktuLahir, waktuSekarang).getSeconds();

        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umurTahun + " tahun, " + umurBulan + " bulan, " + umurHari + " hari, " + umurDetik + " detik");
    }
}
