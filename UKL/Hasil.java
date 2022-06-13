package Kelas_X.Semester2.UKL;

public class Hasil {
    public static void main(String[] args) {
        System.out.println("Index dimulai dari 0");
        Siswa s = new Siswa();
        Petugas p = new Petugas();
        Buku b = new Buku();
        Peminjaman P = new Peminjaman();
        Laporan l = new Laporan();
        l.laporan(b);
        l.laporan(s);
        l.laporan(P, b);
        l.laporan(p);
        P.prosesTransaksi(s, P, b);
        l.laporan(P, b);
        l.laporan(b);
        l.laporan(s);
    }
}