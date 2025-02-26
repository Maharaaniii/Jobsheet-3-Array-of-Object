import java.util.Scanner;
public class MataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah   : ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();
        MataKuliah23[] arrayOfMataKuliah = new MataKuliah23[jmlMatkul];

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke- " + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah23();
            arrayOfMataKuliah[i].tambahData();
           
        }

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("==========Cetak Info Matakuliah==========");
            arrayOfMataKuliah[i].cetakInfo();
        }

        
        
    }
}
