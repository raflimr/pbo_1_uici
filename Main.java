// Memanggil semua file Java yang ada folder program dalam folder custompackage 
// import custompackage.program.*; // custom
// Memanggil semua file bernama TestProgram yang ada folder program dalam folder custompackage
import custompackage.program.TestProgram;
import java.util.Scanner; // built-in

// Method yang akan dijalankan pertama kali oleh JVM
class Main {
  
  // Fungsi yang bisa diakses oleh siapapun dengan data nilai tidak bisa berubah serta tidak mengembalikan nilai apapun dengan nama fungsi Main
  public static void main(String[] args) {
    System.out.println("Hello World ");

    // Mencoba membuat Class Testprogram
    // new = untuk membuat objek baru
    // Nama variable class menjadi belajarJava
    TestProgram belajarJava = new TestProgram();
    belajarJava.helloWorld("Budi");
    /*
     * System.out.println("Masukan nama: \n");
     * Scanner myName = new Scanner(System.in);
     * String userName = myName.nextLine();
     * myName.close();
     * new TestProgram().helloWorld(userName);
     * new TestProgram().inisiasiVariable(userName);
     */
  }
}