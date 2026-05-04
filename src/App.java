import java.util.Scanner;

import tugas_praktikum.Employee;
import tugas_praktikum.Invoice;

public class App {
    public static void main(String[] args) throws Exception {
        Invoice barang1 = new Invoice("Beras 5kg", 2, 60000);
        Invoice barang2 = new Invoice("Minyak Goreng 2L", 1, 35000);
        Invoice barang3 = new Invoice("Gula Pasir 1kg", 3, 15000);

        Invoice[] belanjaanBudi = { barang1, barang2, barang3 };

        Employee budi = new Employee("budi", 12345, 400000, belanjaanBudi);

        System.out.println(budi);
        // Scanner input = new Scanner(System.in);

        // Hewan kucing = new Hewan();
        // kucing.makan();
        // kucing.berjalan();
        // kucing.bersuara();

        // System.out.print("Masukkan nama Anda: ");
        // String namaManusia = input.nextLine();
        // System.out.print("Masukkan umur Anda: ");
        // int umurManusia = input.nextInt();
        // input.nextLine(); 

        // Manusia user = new Manusia(namaManusia, umurManusia);

        // user.tampilkanNama();
        // user.tampilkanUmur();
        // user.makan();
        // user.berjalan();
        // user.bersuara();

        // System.out.print("Masukkan Model Robot: ");
        // String modelRobot = input.nextLine();
        // System.out.print("Masukkan Serial Number: ");
        // String snRobot = input.nextLine();

        // Robot myRobot = new Robot(modelRobot, snRobot);

        // myRobot.tampilkanNama();
        // myRobot.tampilkanUmur();
        // myRobot.makan();
        // myRobot.berjalan();
        // myRobot.bersuara();
        // myRobot.selfDestruct(); //method yg berbeda dgn class yg lain

        // input.close();
    }
}
