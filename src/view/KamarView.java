package view;

import java.util.Scanner;

import controller.KamarController;
import entity.KamarEntity;

public class KamarView {
    // memanggil object untuk input data
    Scanner input = new Scanner(System.in);
    KamarController objKamar = new KamarController();

    public void menu() {
        String pilih;
        do {
            System.out.println("""
                    1. Tambah Data Kamar
                    2. View Data Kamar
                    3. Update Data Kamar
                    4. Hapus Data Kamar
                    5. Exit
                    """);
            System.out.print("Masukan Pilihan Anda = ");
            pilih = input.nextLine();
            switch (pilih) {
                case "1" -> tambahKamar();
                case "2" -> viewData();
                case "3" -> update();
                case "4" -> delete();
                case "5" -> System.out.println();
                default -> System.out.println("Inputan Tidak Ada");
            }
        } while (!pilih.equals("5"));
    }

    private void tambahKamar() {
        // tambahkan try catch agar program tetap berjalan walaupun terjadi error
        try {
            System.out.print("Masukkan Kode Kamar  = ");
            String kodeKamar = input.nextLine();
            System.out.print("Masukkan Jenis Kamar = ");
            String jenisKamar = input.nextLine();
            System.out.print("Masukkan Harga Kamar = ");
            int hargaKamar = input.nextInt();
            input.nextLine();
            objKamar.createData(kodeKamar, jenisKamar, hargaKamar);
        } catch (Exception e) {
            System.out.println("Masukkan Harga dengan tipe data int");
            input.nextLine();
        }
    }

    private void viewData() {
        if (objKamar.allArray().isEmpty()) {
            System.out.println("Data Masih Kosong");
        } else {
            for (KamarEntity kamar : objKamar.allArray()) {
                System.out.println();
                System.out.println("Kode Kamar  = " + kamar.getKodeKamar());
                System.out.println("Jenis Kamar = " + kamar.getJenisKamar());
                System.out.println("Harga Kamar = " + kamar.getHargaPermalam());
                System.out.println();
            }
        }
    }

    private void update() {
        try {
            System.out.print("Masukkan Kode Kamar Yang Akan Diupdate = ");
            String kodeKamar = input.nextLine();
            KamarEntity kamar = objKamar.cariKamar(kodeKamar);
            if (kamar != null) {
                System.out.print("Masukkan Jenis Kamar Baru = ");
                String jenisKamar = input.nextLine();
                System.out.print("Masukkan Harga Kamar Baru = ");
                int hargaKamar = input.nextInt();
                input.nextLine();
                objKamar.update(kamar, jenisKamar, hargaKamar);
                System.out.println("Data Berhasil diupdate");
            } else {
                System.out.println("Kode Kamar Tidak Ditemukan");
            }
        } catch (Exception e) {
            System.out.println("Masukkan Harga dengan tipe data int");
            input.nextLine();
        }
    }

    private void delete() {
        try {
            System.out.print("Masukkan Kode Kamar Yang Akan Dihapus = ");
            String kodeKamar = input.nextLine();
            KamarEntity kamar = objKamar.cariKamar(kodeKamar);
            if (kamar != null) {
                objKamar.hapus(kamar);
                System.out.println("Data Berhasil dihapus");
            } else {
                System.out.println("Kode Kamar Tidak Ditemukan");
            }
        } catch (Exception e) {
            System.out.println("Masukkan Harga dengan tipe data int");
            input.nextLine();
        }
    }
}
