package belajarkelasdanmethod;

public class Manusia {
    
    public String nama, jenisKelamin, agama, pekerjaan;
    public int umur;
    
    public Manusia(){   //Constructor
        
        System.out.println("Dari Constructor");
        KartuNama("Novaldi", "Laki - laki", "Islam", "Mahasiswa", 19);
       
    }
    
    
    
    public void KartuNama(String _nama, String _Jk, String _agama, 
            String _pekerjaan, int _umur ){
       
        this.nama = _nama;
        this.jenisKelamin = _Jk;
        this.agama = _agama;
        this.pekerjaan = _pekerjaan;
        this.umur = _umur;
        
        System.out.println("Dari Method");
        System.out.println("Kartu Nama Saya");
        
         System.out.println("Nama = " + nama);
         System.out.println("Jenis Kelamin = " + jenisKelamin);
         System.out.println("Agama = " + agama);
         System.out.println("Umur = " + umur);
         System.out.println("Pekerjaan = "+ pekerjaan);
        
        
    }

    public String KartuNama(String saya, String lakilaki, String lama, String mahasisa, String umurr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
