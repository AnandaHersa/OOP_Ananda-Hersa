import java.util.Scanner;

public class NilaiAkhir{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nmSiswa = input.nextLine();

        System.out.print("NIM: ");
        String nimSiswa = input.nextLine();

        System.out.print("Nilai Tubes: ");
        double nilaiTubes = input.nextDouble();

        System.out.print("Nilai Quiz: ");
        double nilaiQuiz = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        double totalNilaiAkhir = (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);

        System.out.println("\nNilai Matakuliah Pemrograman Berorientasi Objek :");
        System.out.println("Nama Siswa : " + nmSiswa);
        System.out.println("NIM    : " + nimSiswa);
        System.out.println("Total Nilai Akhir : " + totalNilaiAkhir);

        input.close();
    }
}