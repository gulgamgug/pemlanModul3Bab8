public class App {
    public static void main(String[] args) throws Exception {
        Hewan kucing = new Hewan();
        kucing.makan();
        kucing.berjalan();
        kucing.bersuara();
        kucing.tampilkanNama();
        kucing.tampilkanUmur();

        Manusia orang = new Manusia();
        orang.makan();
        orang.berjalan();
        orang.bersuara();
        orang.tampilkanNama();
        orang.tampilkanUmur();
    }
}
