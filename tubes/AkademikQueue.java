package tubes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AkademikQueue {

	private Queue<Mahasiswa> queue;

    public AkademikQueue() {
        queue = new LinkedList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        queue.add(mahasiswa);
        System.out.println(mahasiswa.getNama() + " telah ditambahkan ke dalam antrean.");
    }

    public void layaniMahasiswa() {
        Mahasiswa mahasiswa = queue.poll();
        if (mahasiswa != null) {
            System.out.println("Melayani " + mahasiswa + " Silahkan hubungi helpdesk berikut: 089688483321 untuk keluhan");
        } else {
            System.out.println("Antrean kosong, tidak ada mahasiswa untuk dilayani.");
        }
    }

    public void lihatAntrean() {
        if (queue.isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            System.out.println("Mahasiswa dalam antrean:");
            for (Mahasiswa m : queue) {
                System.out.println(m);
            }
        }
    }
    
    public static void main(String[] args) {
        AkademikQueue akademikQueue = new AkademikQueue();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa ke Antrean");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Antrean");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // consume newline
            
            switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM mahasiswa: ");
                int nim = scanner.nextInt();
                scanner.nextLine();  // consume newline
                Mahasiswa mhs = new Mahasiswa(nama, nim);
                akademikQueue.tambahMahasiswa(mhs);
                break;
            case 2:
                akademikQueue.layaniMahasiswa();
                break;
            case 3:
                akademikQueue.lihatAntrean();
                break;
            case 4:
                System.out.println("Terima kasih! Program selesai.");
                break;
            default:
                System.out.println("Pilihan tidak valid, coba lagi.");
        }
    } while (pilihan != 4);
    
    scanner.close();
}
}

