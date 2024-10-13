/**
 * MahasiswaDemo21
 */
public class MahasiswaDemo21 {

    public static void main(String[] args) {
        Mahasiswa21 m1 = new Mahasiswa21();
        Mahasiswa21 m2 = new Mahasiswa21();

        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatra Utara";
        m1.kelas = "2A";

        m2.nim = "123654";
        m2.nama = "Selvia Salsabilla";
        m2.alamat = "Sawojajar 1, Maalang, Jawa Timur";
        m2.kelas = "2G";

        m1.displayBiodata();

        m2.displayBiodata();
    }
}