public class DataDosen23 {
    void dataDosen(Dosen23[] arrayOfDosen){
        System.out.println("=====DATA SELURUH DOSEN===== ");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Kode Dosen                  : " + arrayOfDosen[i].kode);
            System.out.println("Nama                        : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin               : " + (arrayOfDosen[i].jenisKelamin ? "Laki-Laki" : "Perempuan"));
            System.out.println("Usia                        : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------------");
        }
        
    }
    void jmlDosenPerJk(Dosen23[] arrayDosen){
        int dosenPria= 0;
        int dosenWanita = 0;
        for (Dosen23 dosen23 : arrayDosen) {
            if (dosen23.jenisKelamin) {
                dosenPria++;
            } else {
                dosenWanita++;
            }
        }
        System.out.println("Jumlah dosen berjenis kelamin pria  : " + dosenPria);
        System.out.println("Jumlah dosen berjenis kelamin wanita    : " + dosenWanita);
        System.out.println("---------------------------------------------------------");
    }
    void rerataUsiaDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int jmlPria = 0, jmlWanita = 0, jmlDosenPria = 0, jmlDosenWanita = 0;;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                jmlPria += arrayOfDosen[i].usia;
                jmlDosenPria++;
            } else {
                jmlWanita += arrayOfDosen[i].usia;
                jmlDosenWanita++;
            }
        }
        int rata2Pria = (jmlPria/jmlDosenPria);
        int rata2Wanita = (jmlWanita/jmlDosenWanita);
        System.out.println("Rata-rata usia dosen pria   : " + rata2Pria);
        System.out.println("Rata-rata usia dosen wanita : " + rata2Wanita);
        System.out.println("---------------------------------------------");
    }
    void infoDosenPalingTua(Dosen23[] arrayOfDosen) {
       int dosenTertua = 0, indeksDosen = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenTertua) {
                dosenTertua = arrayOfDosen[i].usia;
                indeksDosen = i;
            }
        }
            System.out.println("Data dosen tertua             : ");
            System.out.println("Kode Dosen                      : " + arrayOfDosen[indeksDosen].kode);
            System.out.println("Nama                            : " + arrayOfDosen[indeksDosen].nama);
            System.out.println("Jenis Kelamin                   : " + (arrayOfDosen[indeksDosen].jenisKelamin ? "Laki-Laki" : "Perempuan"));
            System.out.println("Usia                            : " + arrayOfDosen[indeksDosen].usia);
            System.out.println("------------------------------------");
    }
    void infoDosenPalingMuda(Dosen23[] arrayOfDosen) {
        int dosenTermuda = 0, indeksDosen = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenTermuda) {
               dosenTermuda = arrayOfDosen[i].usia;
               indeksDosen = i; 
            }
        }
    }
}
