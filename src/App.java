import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Hewan kucing = new Hewan();
        kucing.makan();
        kucing.berjalan();
        kucing.bersuara();

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        input.nextLine(); 

        Manusia user = new Manusia(nama, umur);

        user.tampilkanNama();
        user.tampilkanUmur();
        user.makan();
        user.berjalan();
        user.bersuara();

        input.close();
    }
}
