import java.util.Scanner;
public class MataKuliah23 {
    public String kode;
    public String nama;
    public int sks;
    public int jmlJam;
    public String dummy;

    public MataKuliah23() {

    }

    public MataKuliah23(String kode, String nama, int sks, int jmlJam) {
        this.kode   = kode;
        this.nama   = nama;
        this.sks    = sks;
        this.jmlJam = jmlJam;
    }

    void tambahData(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("SKS           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            jmlJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------------");

    }

    void cetakInfo(){
            System.out.println("Kode           : " + kode  );
            System.out.println("Nama           : " + nama);
            System.out.println("SKS            : " + sks);
            System.out.println("Jumlah Jam     : " + jmlJam);
            System.out.println("-----------------------------------------");
    }
}
