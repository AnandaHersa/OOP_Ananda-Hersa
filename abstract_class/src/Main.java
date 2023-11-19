public class Main {
    public static void main(String[] args) {
        Pembeli pembeli01 = new Pembeli();
        pembeli01.nama = "Surti";
        pembeli01.namaParfum = "Romano";
        pembeli01.kodeParfum = "001";
        pembeli01.tipeParfum = "EUD Parfum";
        pembeli01.ukuranParfum = "100 ml";
        System.out.println("nama pembeli :" + pembeli01.nama);
        System.out.println("nama parfum :" + pembeli01.namaParfum);
        System.out.println("kode parfum :" + pembeli01.kodeParfum);
        System.out.println("tipe parfum :" + pembeli01.tipeParfum);
        System.out.println("ukuran parfum :" + pembeli01.ukuranParfum);
        pembeli01.caraPembayaranCash();

        Pembeli pembeli02 = new Pembeli();
        pembeli02.nama = "Yanto";
        pembeli02.namaParfum = "Eros";
        pembeli02.kodeParfum = "002";
        pembeli02.tipeParfum = "EUD Parfum";
        pembeli02.ukuranParfum = "50 ml";
        System.out.println();
        System.out.println("nama pembeli :" + pembeli02.nama);
        System.out.println("nama parfum :" + pembeli02.namaParfum);
        System.out.println("kode parfum :" + pembeli02.kodeParfum);
        System.out.println("tipe parfum :" + pembeli02.tipeParfum);
        System.out.println("ukuran parfum :" + pembeli02.ukuranParfum);
        pembeli02.caraPembayaranDebit();
    }
}
