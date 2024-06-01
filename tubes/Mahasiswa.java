package tubes;

public class Mahasiswa {
	private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim;
    }
	
}


