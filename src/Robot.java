public class Robot implements MakhlukHidup, Identitas {
    private String model;
    private String serialNumber;

    public Robot(String model, String serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    @Override
    public void makan() {
        System.out.println("Robot sedang mengisi daya (Charging...)");
    }

    @Override
    public void berjalan() {
        System.out.println("Robot bergerak menggunakan roda");
    }

    @Override
    public void bersuara() {
        System.out.println("Suara: Beep Boop Beep! Sistem Aktif.");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Model Robot: " + this.model);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Serial Number: " + this.serialNumber);
    }

    public void selfDestruct() {
        System.out.println("PERINGATAN: Protokol pembersihan data dimulai...");
    }
}
