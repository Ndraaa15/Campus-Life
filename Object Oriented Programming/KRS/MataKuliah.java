package src.OOP_C.KRS;

public class MataKuliah {
    private String nama;
    private String kode;
    private int sks;

    //Bisa menggunakan contructor overloading
    public MataKuliah(String nama, String kode, int sks) {
        this.nama = nama;
        this.kode = kode;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSKS(){
        return sks;
    }
    public void printMK(){
        System.out.println(nama + ", " + kode + ", " + sks + " SKS");
    }


    static MataKuliah MK1 = new MataKuliah("Sistem Operasi", "SO-TIF-A", 3);
    static MataKuliah MK2 = new MataKuliah("Algoritma dan Struktur Data", "ASD-TIF-A", 4);
    static MataKuliah MK3 = new MataKuliah("Kewarnagenaraan", "KWN-TIF-A", 2);
    static MataKuliah MK4 = new MataKuliah("Kewirausahaan", "KWR-TIF-A", 2);
    static MataKuliah MK5 = new MataKuliah("Pemrograman Berorientasi Objek", "PBO-TIF-A", 5);
    static MataKuliah MK6 = new MataKuliah("Aljabar Linear", "AL-TIF-A", 3);
    static MataKuliah MK7 = new MataKuliah("Statistik dan Teori Peluang", "Stat-TIF-A", 3);
    static MataKuliah MK8 = new MataKuliah("Metode Numerik", "MN-TIF-A", 4);
    static MataKuliah MK9 = new MataKuliah("Desain dan Analisis Algoritma", "DAA-TIF-A", 4);
    static MataKuliah MK10 = new MataKuliah("Pemrograman Website", "PW-TIF-A", 4);
}
