package Kelas_X.Semester2.UKL;

import java.util.ArrayList;

public class Buku {
    private ArrayList<String> namaBuku = new ArrayList <String>();
    private ArrayList<Integer> stok = new ArrayList <Integer>();
    private ArrayList<Integer> harga = new ArrayList <Integer>();
    private ArrayList<String> penerbit = new ArrayList<String>();

    public Buku (){
        this.namaBuku.add ("Sastra");
        this.stok.add (10);
        this.harga.add (75000);
        this.penerbit.add("Gramedia");

        this.namaBuku.add ("Romance");
        this.stok.add (20);
        this.harga.add (50000);
        this.penerbit.add("Mizan");

        this.namaBuku.add ("Hurt");
        this.stok.add (25);
        this.harga.add (85000);
        this.penerbit.add("Bentang");

        this.namaBuku.add ("Religi");
        this.stok.add (30);
        this.harga.add (70000);
        this.penerbit.add("Erlangga");

        this.namaBuku.add ("Fiction");
        this.stok.add (15);
        this.harga.add (65000);
        this.penerbit.add("Yudhistira");
    }

    public int getJmlhBuku(){
        return this.namaBuku.size();
    }
    public void setNama(String namaBuku) {
        this.namaBuku.add (namaBuku);
    }
    public void setStok(int stok) {
        this.stok.add (stok);
    }
    public void setHarga(int harga) {
        this.harga.add (harga);
    }

    public String getNama(int idBuku) {
        return this.namaBuku.get(idBuku);
    }
    public String getPenerbit(int idBuku) {
        return this.penerbit.get(idBuku);
    }
    public void editStok(int idBuku,int stok) {
        this.stok.set(idBuku,stok);
    }
    public Integer getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }
    public Integer getStok(int idBuku) {
        return this .stok.get(idBuku);
    }

}