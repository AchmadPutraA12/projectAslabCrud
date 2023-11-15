package entity;

//penamaan class harus diawali huruf Besar
public class KamarEntity {
    //penamaan atribut harus camelCase
    private String kodeKamar;
    private String jenisKamar;
    private int hargaPermalam;

    public KamarEntity(String kodeKamar, String jenisKamar, int hargaPermalam) {
        this.kodeKamar = kodeKamar;
        this.jenisKamar = jenisKamar;
        this.hargaPermalam = hargaPermalam;
    }

    public KamarEntity() {
    }


    public String getKodeKamar() {
        return this.kodeKamar;
    }

    public void setKodeKamar(String kodeKamar) {
        this.kodeKamar = kodeKamar;
    }

    public String getJenisKamar() {
        return this.jenisKamar;
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public int getHargaPermalam() {
        return this.hargaPermalam;
    }

    public void setHargaPermalam(int hargaPermalam) {
        this.hargaPermalam = hargaPermalam;
    }
}