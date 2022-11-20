import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa(2255201, "Sandesh Arya Sandhika", "TIFRM22A", 181122));
        mahasiswaList.add(new Mahasiswa(2255202, "Muhammad Rival Agustin", "TIFRM22B", 181122));
        mahasiswaList.add(new Mahasiswa(2255203, "Abdu Sehabudin", "TIFRM22A", 181122));
        mahasiswaList.add(new Mahasiswa(2255204, "Ilyas Hidayatullah", "TIFIK22B", 181122));
        mahasiswaList.add(new Mahasiswa(2255205, "Restu Dhayu", "TIFE22C", 181122));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        mahasiswaList.remove(0);

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
    }
}