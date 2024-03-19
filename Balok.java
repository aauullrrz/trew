import java.util.Scanner;
public class Balok extends BangunRuang {
    Scanner scanner = new Scanner (System.in);

    private Double panjang;
    private Double lebar;
    private Double tinggi;

    Balok(String name) {
        super(name);

    }

    public void inputNilai() {
        super.luasPermukaan();
        System.out.print("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
    }

    public void luasPermukaan() {
    double hasil = (panjang*lebar*2)+(panjang*tinggi*2)+(lebar*tinggi*2);
    super.luasPermukaan();
    System.out.println("Luas permukaan balok adalah : " + hasil);
    }

    public void volume() {
    double hasil = panjang*tinggi*lebar;
    super.volume();
    System.out.println ("volume balok adalah : " + hasil);

    }
}