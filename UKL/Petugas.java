package Kelas_X.Semester2.UKL;

import java.util.ArrayList;

public class Petugas implements DataDiri{
    public int getJmlhpetugas() {
        return this.telepon.size();
    }
    private ArrayList<String> namaKaryawan= new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon= new ArrayList<String>();

    public Petugas(){
        this.namaKaryawan.add ("Tiara");
        this.alamat.add ("Surabaya");
        this.telepon.add ("081225567874");

        this.namaKaryawan.add ("Titi");
        this.alamat.add ("Pare");
        this.telepon.add ("    081227656678");

        this.namaKaryawan.add ("Rara");
        this.alamat.add ("Bekasi");
        this.telepon.add ("    087312956778");

        this.namaKaryawan.add ("Tia");
        this.alamat.add ("    Jakarta");
        this.telepon.add ("    081233567881");
    }

    //Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add (namaKaryawan);
    }
    public void setAlamat(String alamat) {
        this.namaKaryawan.add (alamat);
    }
    public void setTelepon(String telepon) {
        this.namaKaryawan.add (telepon);
    }

    //Override
    public String getNama(int id) {
        return this.namaKaryawan.get(id);
    }
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }
    public String getTelepon(int id) {
        return this.telepon.get (id);
    }
}