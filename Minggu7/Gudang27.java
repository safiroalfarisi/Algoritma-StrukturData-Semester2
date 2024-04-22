package Minggu7;

public class Gudang27 {
    Barang27[] tumpukan;
    int size;
    int top;

    public Gudang27(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang27[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang27 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }
    
    public Barang27 ambilBarang() {
        if (!cekKosong()) {
            Barang27 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: "+konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang27 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang27 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang");
                // for (int i = top; i >= 0; i--) {
                for (int i = 0; i <= top; i++) {
                    System.out.printf("kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
                }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi27 stack = new StackKonversi27();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
        }

    public Barang27 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang27 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang27 cariBarang(String cari) {
        if (!cekKosong()) {
            for (int i = top; i >= 0; i--) {
                Barang27 barang = tumpukan[i];
                if (barang.nama.equalsIgnoreCase(cari) || String.valueOf(barang.kode).equals(cari)) {
                    System.out.printf("Barang ditemukan: %s (Kode: %d, Kategori: %s)\n", barang.nama, barang.kode,barang.kategori);
                    return barang;
                }
            }
            System.out.println("Barang tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

}