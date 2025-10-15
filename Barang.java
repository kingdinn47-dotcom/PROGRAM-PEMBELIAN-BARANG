class Barang {
    private String nama;
    private int hargaSatuan;
    private int jumlah;

    public Barang(String nama, int hargaSatuan, int jumlah) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int hitungTotalHarga() {
        return hargaSatuan * jumlah;
    }

}

