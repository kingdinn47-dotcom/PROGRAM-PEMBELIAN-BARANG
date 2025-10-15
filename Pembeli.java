import java.util.ArrayList;
import java.util.List;

class Pembeli {
    private String nama;
    private List<Barang> daftarBarang;

    public Pembeli(String nama) {
        this.nama = nama;
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public int hitungTotalHarga() {
        int total = 0;
        for (Barang b : daftarBarang) {
            total += b.hitungTotalHarga();
        }
        return total;
    }

    public void tampilkanInfo() {
        System.out.println("\n=== INFORMASI PEMBELIAN ===");
        System.out.println("Nama Pembeli: "+ nama);
        System.out.println("-----------------------------");

        for (Barang b : daftarBarang) {
            System.out.println("- "+ b.getNama() + " : " + b.getJumlah() + " x Rp" + b.getHargaSatuan() + "\t = Rp" + b.hitungTotalHarga());
        }
        System.out.println("----------------------------- ");
        System.out.println("Total Pembelian: Rp" + hitungTotalHarga());
    }
}
