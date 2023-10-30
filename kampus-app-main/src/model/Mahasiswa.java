package model;

public class Mahasiswa {
    private String nim;
    public String getNim() {
        return nim;
    }

    private String nama;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, String idProdi) {
        this.nim = nim;
        this.nama = nama;
        this.idProdi = idProdi;
    }
//
    private String idProdi; 
    public String getIdProdi() {
        return idProdi;
    }

    public void setIdProdi(String idProdi) {
        this.idProdi = idProdi;
    }
}
