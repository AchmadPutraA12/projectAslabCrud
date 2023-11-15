package controller;

import java.util.ArrayList;

import entity.KamarEntity;
import model.KamarModel;
import view.KamarView;

public class KamarController {

    public ArrayList<KamarEntity> allArray(){
        return KamarModel.allArray();
    }

    //fungsi create controller data kamar
    public void createData(String kodeKamar, String jenisKamar, int hargaPermalam){
        KamarModel.createData(kodeKamar, jenisKamar, hargaPermalam);
    }

    //fungsi cari controller untuk method update dan delete berdasarkan kode kamar
    public KamarEntity cariKamar(String kodeKamar){
        return KamarModel.cariKamar(kodeKamar);
    }

    //fungsi update controller jenis kamar dan harga kamar
    public void update(KamarEntity kamar, String jenisKamar, int hargaPermalam){
        KamarModel.update(kamar, jenisKamar, hargaPermalam);
    }

    //fungsi hapus controller data kamar
    public void hapus(KamarEntity kamar){
        KamarModel.hapus(kamar);
    }

    //menu dari view dikembalikkan di controller lalu dipanggil di class main
    public void menu(){
        KamarView menuKamar = new KamarView();
        menuKamar.menu();
    }
}
