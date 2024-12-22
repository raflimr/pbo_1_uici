package custompackage.program;

public class TestProgram {

  // Melakukan inisialisasi Variable
  String namaTeman;
  
  // Melakukan inisialisasi variable dengan menambahkan nilai default serta menggunakan metode one line 
  String namaSaya = "Joni", namaKamu = "Yana", namaLain;

  int sudutKiri, sudutKanan, sudutAtas = 90;

  int jumlahBuku = 2;

  int jumlahBukuTotal = 30;

  // untuk menampilkan text pada console
  // public = bisa akses oleh Class manapun
  // void = tidak mengambilkan nilai apapun
  // helloWorld = nama fungsi 
  // String name = parameter bertipe string bernama name
  public void helloWorld(String name) {
    System.out.println("Hello world, from test program " + name); // isi code
  }

  public void inisiasiVariable(String nama) {
    namaSaya = nama;

    jumlahBuku = jumlahBuku + jumlahBuku;

    System.out.println(namaSaya + " memiliki " + jumlahBuku + " buku.");

  }

}