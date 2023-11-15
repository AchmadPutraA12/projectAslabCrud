import controller.KamarController;

public class App {
    public static void main(String[] args) throws Exception {
        //pemanggilan di main harus dari controller
        KamarController kamar = new KamarController();
        kamar.menu();
    }
}
//noted di hanya di methood main dan di package model saja yang boleh static selain itu tidak boleh static
//apa itu method static ? method static adalah method yang bisa dipanggil tanpa menggunakan objek