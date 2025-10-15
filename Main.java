import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = input.nextLine();
        Pembeli pembeli = new Pembeli(namaPembeli);

        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlahBarang = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nBarang ke-" + (i+ 1));
            System.out.print("Nama barang: ");
            String namaBarang = input.nextLine();
            System.out.print("Harga satuan: ");
            int harga = input.nextInt();
            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();
            input.nextLine();

            Barang barang= new Barang(namaBarang, harga, jumlah);
            pembeli.tambahBarang(barang);
        }
        pembeli.tampilkanInfo();
        input.close();
    }

}
