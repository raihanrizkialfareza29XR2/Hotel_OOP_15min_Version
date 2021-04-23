package Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Reguler reguler = new Reguler();
        VIP vip = new VIP();
        Suites suites = new Suites();

        hotel.Pilihlah();
        if (hotel.pilihan == 1){
            reguler.Inputan();
            reguler.setInfo(reguler.nama, reguler.KTP, reguler.swab);
            reguler.getInfo();
            reguler.setKamar(reguler.jumlah);
            reguler.getKamar();
            reguler.setTotal();
            reguler.getTotal();
        }else if (hotel.pilihan == 2){
            vip.Inputan(); // copas reguler.inputan
            vip.setInfo(reguler.nama, reguler.KTP, reguler.swab);
            vip.getInfo();
            vip.setKamar(reguler.jumlah);
            vip.getKamar();
            vip.setTotal();
            vip.getTotal();
        }else if (hotel.pilihan == 3){
            suites.Inputan(); // copas vip.inputan
            suites.setInfo(reguler.nama, reguler.KTP, reguler.swab);
            suites.getInfo();
            suites.setKamar(reguler.jumlah);
            suites.getKamar();
            suites.setTotal();
            suites.getTotal();
        }
    }
}
