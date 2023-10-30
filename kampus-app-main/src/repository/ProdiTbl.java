package repository;

import model.Prodi;

public class ProdiTbl {
    private Database db;

    public ProdiTbl(Database db) {
        this.db = db;
    }

    public void create(Prodi prodi) {
        db.buatProdi(prodi);
    }

    // Menambahkan metode untuk mendapatkan nama Prodi berdasarkan ID
    public String getProdiNameById(String idProdi) {
        for (Prodi prodi : db.tables.dataProdi) {
            if (prodi.getId().equals(idProdi)) {
                return prodi.getNama();
            }
        }
        return "Prodi tidak berhasil untuk ditemukan";
    }
    
}
