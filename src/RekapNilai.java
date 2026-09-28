import java.util.Locale;
import java.util.Scanner;

public class RekapNilai {
    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 kalau sudah selesai.");

        int nomor = 1;
        int nilai = 0;
        double total = 0;

        do {
            System.out.print("Nilai ke-" + nomor + " : ");

            if (!in.hasNextInt()) {
                System.out.println("input harus berupa angka");
                in.next();
                continue;
            }

            nilai = in.nextInt();

            if (nilai == SELESAI) {
                break;
            }

        }
}
