package belajarkelasdanmethod;

/**
 *
 * @author ridho
 */
public class BelajarKelasDanMethod {

    
    public static void main(String[] args) {
        
        A objA = new A();    //Membuat Objek dari kelas A       //4
        B objB = new B();
        
        Manusia objManusia = new Manusia();
        
        System.out.println("\n");
        
        objManusia.KartuNama("Anggi", "Perempuan", "Islam", "Mahasiswa", 19);
        
        
        
//        objA.X = 10;   //5
//        objA.Y = 15;    //6
//        
//        objB.X = 20;
//        objB.Y = 30;
//        objB.Z = 40;
//        
//        objA.TampilkanNilaiXY();    //7
//        objA.TampilkanTeks("Tommy");
//        objA.TampilkanNilai(10, 50);
//        
//        objB.TampilkanNilaiXYZ();
//        objB.TampilkanTeks("Jhony");
        
//        
    }

}

class A{    //1
    
    int X, Y;       //2
        
    void TampilkanNilaiXY(){        //3
        System.out.println("Nilai X = " + X + "Nilai Y = "+ Y);
    }
    
    public void TampilkanTeks(String teks){         //8
         System.out.println("Teks = " + teks);
    }
    
     public void TampilkanNilai(int nilai1, int nilai2){         //10
         System.out.println("Teks = " + nilai1 + " dan " + nilai2);
         
    }
    
}

class B extends A{
    
    int Z;
    public void TampilkanNilaiXYZ(){
        System.out.println("Nilai X = "+ X +" Nilai Y = "+ Y + " Nilai Z = "+ Z);
    }
    
    public void TampilkanTeks(){
        
    }
    
}
