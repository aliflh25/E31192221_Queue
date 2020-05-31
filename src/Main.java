
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RVT
 */
public class Main {

    static void menu() {
        System.out.println("Pilih Menu");//pilihan menu
        System.out.println("1. Enqueue");//pertama
        System.out.println("2. Dequeue");//kedua
        System.out.println("3. PRINT");//ketiga
        System.out.println("4. Exit");//keempat
    }

    public static void main(String[] args) {//method main
        Scanner scan = new Scanner(System.in);
        int pil = 0;//pilihan = 0
        System.out.println("Masukkan nilai maksimal : ");//tampilkan "Masukkan nilai maksimal
        int m = scan.nextInt();//masukkan variable m
        Queue qq = new Queue(m); //queue panjangnya ditentuan variable m 
        do {//perulangan
            menu();
            pil = scan.nextInt();//masukkan pilihan
            switch (pil) {//cek menggunakan switch case
                case 1:
                    System.out.println("Masukkan nilai data : ");//tampilkan "Masukkan nilai data"
                    int dataIn = scan.nextInt();//disimpan di variable dataIn
                    qq.enqueue(dataIn);//memanggil objek dan method
                    break;//perulangan berhenti
                case 2:
                    int dataOut = qq.dequeue();//data disimpan di dataOut
                    if (dataOut != 0) {//jika dataOut bukan 0
                        System.out.println("Data yang terambil : " + dataOut);//tmpilkan "Data yang terambil"
                    }
                    break;//perulangan berhenti
                case 3:
                    qq.print();//memanggil method print
                    break;//perulangan berhenti
            }
        } while (pil != 4);//jika pilihan bukan 4
        System.out.println("Data tidak ada");//tampilkan "Data tidak ada"
    }
}
