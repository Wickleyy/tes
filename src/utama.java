import java.util.ArrayList;
import java.util.Scanner;

public class utama {
    /**
     * intinya buat nambah, hapus, dan tampilkan daftar nama mahasiswa
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("1. Tambah Nama");
            System.out.println("2. Hapus Nama");
            System.out.println("3. Tampilkan Semua Nama");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilih = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            if (pilih == 1) {
                System.out.print("Masukkan nama: ");
                names.add(scanner.nextLine());
            } else if (pilih == 2) {
                System.out.print("Masukkan nama yang akan dihapus: ");
                names.remove(scanner.nextLine());
            } else if (pilih == 3) {
                System.out.println("Daftar Nama:");
                for (String name : names) {
                    System.out.println(name);
                }
            }
        } while (pilih != 4);

        scanner.close();
    }
}
