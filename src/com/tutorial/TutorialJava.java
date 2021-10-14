package com.tutorial;

//Class tanpa constructor
class Polos{
String dataString;
int dataInteger;
}

//clas dengan controctur
class Mahasiswa{
    String nama;
    String nim;
    String jurusan;

    //ini adalah contructor di panggil saat object saat pertama kali di buat
    // Mahasiswa(){
    //     System.out.println("ini adalah contructorcls");
    // }
    //contructor dengan parameter
    Mahasiswa(String inputNama, String inputNim, String inputJurusan){
        nama=inputNama;
        nim=inputNim;
        jurusan=inputJurusan;

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
    }
}

public class TutorialJava {
    
    public static void main(String[] args) throws Exception{

        //instance membuat object

        Mahasiswa mahasiswa1=new Mahasiswa("agung","123","sistem informasi");
        Mahasiswa mahasiswa2=new Mahasiswa("setiawan","321","TI");

        // Polos polos =new Polos();
        
        // polos.dataString="ini string";
        // polos.dataInteger=0;

        // System.out.println(polos.dataString);
        // System.out.println(polos.dataInteger);

    }
}
