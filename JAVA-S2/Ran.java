import java.util.Scanner;

class Siswa {
    //simpen variable
    private String nama;
    private int usia;
    private double nilai;

    // getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter gae umur
    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    // Getter dan Setter gawe nilai
    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}

public class Ran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Siswa s = new Siswa();
        
    
        System.out.println("Masukkan Nama anda : ");
        String nama = input.nextLine();
        s.setNama(nama);
        
        System.out.println("Masukkan Umur anda : ");
        int usia = input.nextInt();
        s.setUsia(usia);
        
        System.out.println("Berapakah Nilai anda ? ");
        double nilai = input.nextDouble();
        s.setNilai(nilai);
        
        
        System.out.println("=== Data Siswa ===");
        System.out.println("Nama  : " + s.getNama());
        System.out.println("Usia  : " + s.getUsia());
        System.out.println("Nilai : " + s.getNilai());

        input.close();
    }
}
