package Hotel;

import java.util.Scanner;

public class Hotel {
    int pilihan;
    Scanner input = new Scanner(System.in);
    public Hotel(){
        System.out.println("");
        System.out.println("|Selamat Datang di Rizki's Hotel");
        System.out.println("|Kami Menyediakan Beberapa Tipe Kamar Unggulan : ");
        System.out.println("|1. Kamar Tipe Reguler (Rp 250.000)");
        System.out.println("|2. Kamar Tipe VIP (Rp 450.000)");
        System.out.println("|3. Kamar Tipe Suites (Rp 650.000)");
    }
    public void Pilihlah(){
        System.out.println("");
        System.out.print("|Silakan Pilih Tipe Kamar yang Ingin Dipesan : ");
        pilihan = input.nextInt();
    }
}
