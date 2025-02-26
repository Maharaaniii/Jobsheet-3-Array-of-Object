import java.util.Scanner;
public class DosenDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen23[] arrayOfDosen = new Dosen23[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("\nMasukkan Data Dosen ke-    " + (i + 1));
            System.out.print("Kode                  : " );
            String kode = sc.nextLine();
            System.out.print("Nama                  : " );
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin(P/L)    : " );
            char jk = sc.nextLine().charAt(0);
            boolean jenisKelamin = (jk == 'P' || jk == 'p');
            System.out.print("Usia                  : " );
            int usia = sc.nextInt();
            sc.nextLine();
            
            arrayOfDosen[i] = new Dosen23(kode, nama, jenisKelamin, usia);
            
        }

        System.out.println();
        System.out.println("\nData Dosen    :");
        for (Dosen23 Dosen : arrayOfDosen) {
            System.out.println("Kode Dosen                  : " + Dosen.kode);
            System.out.println("Nama                        : " + Dosen.nama);
            System.out.println("Jenis Kelamin               : " + (Dosen.jenisKelamin ? "Perempuan" : "Laki-Laki"));
            System.out.println("Usia                        : " + Dosen.usia);
            System.out.println("------------------------------------");
        }
        
       DataDosen23 dosen = new DataDosen23();
       dosen.dataDosen(arrayOfDosen);
       dosen.jmlDosenPerJk(arrayOfDosen);
       dosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
       dosen.infoDosenPalingTua(arrayOfDosen);
       dosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
