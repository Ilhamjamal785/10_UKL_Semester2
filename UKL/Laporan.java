package Kelas_X.Semester2.UKL;

public class Laporan {
    public void laporan(Buku buku) {
        int x = buku.getJmlhBuku();

        System.out.println("\n\t\t PERPUSTAKAAN SMK TELKOM MALANG ");
        System.out.println("\t\t\t\t AYO LITERASI");
        System.out.println();
        System.out.println("== DAFTAR BUKU ==");
        System.out.println();
        System.out.println("Judul Buku \t\tStok Buku \tHarga Buku \t\tPenerbit");
        for (int i = 0; i < x; i++) {
            System.out.println(buku.getNama(i) + "\t" +"\t" +"\t"+"\t" + (buku.getStok(i)) +"\t"+"\t"+"\t"+ (buku.getHarga(i)) +"\t"+"\t"+ (buku.getPenerbit(i)));
        }
    }
    public void laporan(Siswa siswa) {
        int x = siswa.getJmlhsiswa();

        System.out.println();
        System.out.println("== DAFTAR SISWA SMK TELKOM MALANG ==");
        System.out.println();
        System.out.println("Nama\tAlamat\t\tTelepon \t\tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(siswa.getNama(i)
                    + "\t"+ siswa.getAlamat(i)
                    + "\t"  + siswa.getTelepon(i)
                    + "\t" +"\t"+ siswa.getStatus(i) );
        }
    }
    public void laporan(Petugas petugas) {
        int x = petugas.getJmlhpetugas();

        System.out.println();
        System.out.println("== DAFTAR PETUGAS SMK TELKOM MALANG==");
        System.out.println();
        System.out.println("Nama  \tAlamat \t\t Telepon ");
        for (int i = 0; i < x; i++) {
            System.out.println(petugas.getNama(i) + "\t"+ petugas.getAlamat(i) + "\t" + petugas.getTelepon(i));

        }

    }

    public void laporan(Peminjaman peminjaman, Buku koleksibuku) {
        int x = peminjaman.getJmlhpeminjaman();

        System.out.println();
        System.out.println("== DAFTAR BUKU YANG KELUAR ==");
        System.out.println();
        System.out.println("Nama Barang \tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = peminjaman.getBanyaknyaBuku(i) * koleksibuku.getHarga(peminjaman.getIdBuku(i));
            total += jumlah;
            System.out.println(koleksibuku.getNama(peminjaman.getIdBuku(i)) + "\t" +"\t" +"\t" +peminjaman.getBanyaknyaBuku(i) + "\t"+"\t" + koleksibuku.getHarga(peminjaman.getIdBuku(i)) + "\t" + jumlah);
        }
        System.out.println("Total Profit : " + total);
    }
}