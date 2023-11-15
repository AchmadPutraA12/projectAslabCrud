package model;

import java.util.ArrayList;

import entity.KamarEntity;

public class KamarModel {
    //arraylist kamar
    private static ArrayList<KamarEntity> arrayKamar = new ArrayList<>();

    //array kamar untuk diakses di class lain
    public static ArrayList<KamarEntity> allArray(){
        return arrayKamar;
    }

    //create data kamar model
    public static void createData(String kodeKamar, String jenisKamar, int hargaPermalam){
        arrayKamar.add(new KamarEntity(kodeKamar, jenisKamar, hargaPermalam));
    }

    //fungsi cari model untuk method update dan delete berdasarkan kode kamar
    public static KamarEntity cariKamar(String kodeKamar){
        for(KamarEntity objKamar : arrayKamar){
            if(objKamar.getKodeKamar().equals(kodeKamar)){
                return objKamar;
            }
        }
        return null;
    }

    //fungsi update moodel jenis kamar dan harga kamar
    public static void update(KamarEntity kamar, String jenisKamar, int hargaPermalam){
        kamar.setJenisKamar(jenisKamar);
        kamar.setHargaPermalam(hargaPermalam);
    }

    //fungsi hapus model data kamar
    public static void hapus(KamarEntity kamar){
        arrayKamar.remove(kamar);
    }
}