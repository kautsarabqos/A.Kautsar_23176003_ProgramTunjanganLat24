import java.util.Scanner;

public class PerbandinganDuaBuahNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.print("Masukkan nilai pertama: ");
            double nilaiPertama = scanner.nextDouble();

            System.out.print("Masukkan nilai kedua: ");
            double nilaiKedua = scanner.nextDouble();

            String hasil;
            if (nilaiPertama > nilaiKedua) {
                hasil = nilaiPertama + " Lebih besar dari " + nilaiKedua;
            } else if (nilaiPertama < nilaiKedua) {
                hasil = nilaiPertama + " Lebih kecil dari " + nilaiKedua;
            } else {
                hasil = nilaiPertama + " Sama dengan " + nilaiKedua;
            }

            System.out.println("Hasil: " + hasil);

            System.out.print("Ulangi Aktifitas? (Ya/Tidak): ");
            ulangi = scanner.next();
        } while (ulangi.equalsIgnoreCase("Ya"));

        scanner.close();
    }
}