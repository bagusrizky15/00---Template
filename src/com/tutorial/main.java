class Mahasiswa {

    String nama;
    Integer nim;
}

class Dosen{
    String nama;
    String NIK;


    //constructor dengan parameter
    Dosen(String inputNama, String inputNIK){
        nama = inputNama;
        NIK = inputNIK;

        System.out.println(nama);
        System.out.println(NIK);
    }
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

        Dosen dosen1 = new Dosen("Ngadiman", "19201");
        Dosen dosen2 = new Dosen("Sas", "2292");

    

    }
}