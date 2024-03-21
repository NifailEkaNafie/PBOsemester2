import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class codelabM1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        switch (jenisKelamin) {
            case 'L':
            case 'l':
                System.out.println("Gender : Laki-Laki");
                break;
            case 'P':
            case 'p':
                System.out.println("Gender : Perempuan");
                break;
            default:
                System.out.println("Jenis kelamin tidak valid");
        }

        System.out.println("Umur Anda adalah: " + umur);

        LocalDate tanggalSekarang = LocalDate.now();
        LocalDate tanggalLahirDenganUmur = tanggalSekarang.minusYears(umur);

        System.out.println("Tanggal lahir Anda adalah: " + tanggalLahir.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Tanggal lahir Anda dengan umur sekarang adalah: " + tanggalLahirDenganUmur.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}