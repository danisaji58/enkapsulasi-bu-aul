public class objeksiswa{

    private String nama;
    private int usia;
    private double nilai;
                
        public String getNama() {
            return nama;
        }
                
        public void setNama(String nama) {
            this.nama = nama;
        }
                
        public int getUsia() {
             return usia;
        }
        
        public void setUsia(int usia) {
            if (usia > 0) {
                this.usia = usia;
            } else {
            System.out.println("Maaf. Umur anda tidak memenuhi syarat!");
            }
        }
        
         public double getNilai() {
            return nilai;
        }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Waw! Anda terlalu jenius, silahkan coba lagi ");
        }
    }
}