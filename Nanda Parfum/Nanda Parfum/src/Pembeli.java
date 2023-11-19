public class  Pembeli extends Catalog{

    @Override
    public void caraPembayaranDebit() {
        System.out.println("Pembayarann menggunakan Debit");
    }

    @Override
    public void caraPembayaranCash() {
        System.out.println("Pembayaran menggunakan Cash");
    }
    
}
