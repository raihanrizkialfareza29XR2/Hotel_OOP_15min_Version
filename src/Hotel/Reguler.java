package Hotel;

import java.util.Scanner;

public class Reguler {
    int jumlah;
    double total, pajak, results;
    String nama, KTP, swab;
    String input1 = "S"; // Keri 1
    String input2 = "B"; // Keri 2
    Scanner input = new Scanner(System.in);

    public void setInfo(String nama, String KTP, String swab){
        System.out.println("");
        System.out.println("|--Anda Memilih Kamar Tipe Reguler (harga Rp 250.000)--|");
        this.nama = nama;
        this.KTP = KTP;
        this.swab = swab;
    }
    public String getInfo(){
        System.out.println("");
        System.out.println("|Nama Anda      : " + nama);
        System.out.println("|Nomor KTP Anda : " + KTP);
        System.out.println("|Tracing Swab   : " + swab);
        if (swab == input2){ // Keri 3
            System.out.println("");
            System.out.println("Mohon Maaf, Jika Belum Swab Anda Diwajibkan Untuk Mengikuti Swab oleh Hotel Terlebih Dahulu");
        }else{
            System.out.println("");
            System.out.println("Terima Kasih Telah Mematuhi Prokes, Selalu Terapkan 3M yaa.. Selamat Menginap");
        }
        return nama;
    }
    public void setKamar(int jumlah){
        this.jumlah = jumlah;
    }
    public int getKamar(){
        System.out.println("");
        System.out.println("|Jumlah Kamar yang Dipesan : " + jumlah);
        return jumlah;
    }
    public void setTotal(){
        total = jumlah*250000;
        pajak = total*(0.10);
        results = total+pajak;
    }
    public double getTotal(){
        System.out.println("");
        System.out.println("|Total Tagihan : " + jumlah + " x Rp 250.000");
        System.out.println("               : " + total + " + Pajak 10%");
        System.out.println("               : " + total + " + " + pajak);
        System.out.println("               : " + results + " Rupiah");
        return results;
    }
    public void Inputan(){
        System.out.println("");
        System.out.print("|Silakan Masukkan Nama Anda   : ");
        nama = input.nextLine();
        System.out.print("|Silakan Verifikasi Nomor KTP : ");
        KTP = input.nextLine();
        System.out.print("|Sudah Melakukan Swab Sebelumnya? (S/B) : ");
        swab = input.nextLine();
        System.out.print("|Jumlah Kamar yang Ingin di Pesan : ");
        jumlah = input.nextInt();
    }
}
