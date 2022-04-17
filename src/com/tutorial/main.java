class Mahasiswa {

    String nama;
    Integer nim;
}

public class main{

    public static void main(String[] args) {
        System.out.println("Hello Rani");

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "usep";
        mahasiswa1.nim = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Rani";
        mahasiswa2.nim = 18;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.nim);

    }
}