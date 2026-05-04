import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Hewan kucing = new Hewan();
        kucing.makan();
        kucing.berjalan();
        kucing.bersuara();

        System.out.print("Masukkan nama Anda: ");
        String namaManusia = input.nextLine();
        System.out.print("Masukkan umur Anda: ");
        int umurManusia = input.nextInt();
        input.nextLine(); 

        Manusia user = new Manusia(namaManusia, umurManusia);

        user.tampilkanNama();
        user.tampilkanUmur();
        user.makan();
        user.berjalan();
        user.bersuara();

        System.out.print("Masukkan Model Robot: ");
        String modelRobot = input.nextLine();
        System.out.print("Masukkan Serial Number: ");
        String snRobot = input.nextLine();

        Robot myRobot = new Robot(modelRobot, snRobot);

        myRobot.tampilkanNama();
        myRobot.tampilkanUmur();
        myRobot.makan();
        myRobot.berjalan();
        myRobot.bersuara();
        myRobot.selfDestruct(); //method yg berbeda dgn class yg lain

        input.close();
    }
}
