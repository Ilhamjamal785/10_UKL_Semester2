package Kelas_X.Semester2.UKL;

import java.util.ArrayList;

public class Siswa implements DataDiri{
    public int getJmlhsiswa() {
        return this.status.size();
    }
    private ArrayList<String> namaSiswa= new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon= new ArrayList<String>();
    private ArrayList<Boolean> status= new ArrayList<Boolean>();

    public Siswa(){
        this.namaSiswa.add ("Oryza");
        this.alamat.add ("Kediri");
        this.telepon.add("   081225473198");
        this.status.add (Boolean.TRUE);

        this.namaSiswa.add ("Raihan");
        this.alamat.add ("Blitar");
        this.telepon.add("   081225773539");
        this.status.add (Boolean.TRUE);

        this.namaSiswa.add ("Jamal");
        this.alamat.add ("Malang");
        this.telepon.add("   081295673209");
        this.status.add (Boolean.FALSE);

        this.namaSiswa.add ("Valen");
        this.alamat.add ("Bekasi");
        this.telepon.add("   082245612344");
        this.status.add (Boolean.FALSE);

    }

    //Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    public void setTelepon(String telepon) {
        this.telepon.add (telepon);
    }

    public void setStatus (boolean status){
        this.status.add (status);
    }

    //Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }
    public String getTelepon(int idSiswa) {
        return this.telepon.get (idSiswa);
    }

    public Boolean getStatus (boolean status, int idSiswa) {
        return this.status.get (idSiswa);
    }
    public void editStatus(int idSiswa , boolean Status){
        this.status.set (idSiswa, Status);
    }

    boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }

}