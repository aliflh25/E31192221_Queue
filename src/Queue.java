/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RVT
 */
public class Queue {

    int max, size, depan, belakang;//deklarasi atribut
    int q[];//array q

    Queue(int m) {//constractor parameter m
        max = m;//maksimal sama dengan m
        create();//memanggil method create
    }

    void create() {
        q = new int[max];//inisialisasi array q
        size = 0;//size sama dengan 0
        depan = belakang = -1;//depan dan belakang =-1
    }

    boolean isEmpty() {//method untuk cek queue apakah masih kosong atau tidak
        if (size == 0) {//jika size sama dengan 0
            return true;//maka nilai benar
        } else {//atau jika tidak
            return false;//kembalikan nilai salah
        }
    }

    boolean isFull() {//method untuk cek queue apakah penuh atau tidak
        if (size == max) {//jika size maksimal
            return true;//maka nilai benar
        } else {//atau jika tidak
            return false;//kembalikan nilai salah
        }
    }
    
     void enqueue(int data) {//proses enqueue atau enambah data
          if (isFull()) {//jika queue penuh
                System.out.println("Antrian sudah penuh");//tampilkan "Antrian sudah penuh
          } else {//atau jika tidak
              if (isEmpty()) {//jika dalam keadaan kosong
                   depan = belakang = 0;//depan sama dengan belakang sama dengan 0
              } else{//jika tidak kosong akan dicek lagi apakah belakang sma dengan max-1
                  if (belakang == max - 1) {//jika belakang samadengan max-1
                       belakang = 0;//maka belakang sma dengan 0
                  }else {//atau
                      belakang++;//belakang incement
                  }
              }
              q[belakang] = data;//nilai array q = data
              size++;//size increment
          }
     }
     
      int dequeue() {//method dequeue atau pengambilan data
           int data = 0;//inisialisasi untuk menyimpan data yang akan diambil
           if (isEmpty()) {//pengecekan apakah queue dalam keadaan kosong, jika iya
               System.out.println("Antrian kosong");//tampilkan "Antrian kosong"
           }else {//atau
                data = q[depan];//variable data akan menyimpan nilai dari array q
                size--;//size decrement
                if (isEmpty()) {//jika queue dalam keadaan kosong
                    depan = belakang = -1;//depan sama dengan belekang sama dengan -1
                }else {//atau
                    if (depan == max - 1) {//jika depan sama dengan max -1
                         depan = 0;//maka depan sama dengan 0
                    }else {//atau
                        depan++;//depan increment
                    }
                }
           }
           return data;//mengembalikan nilai data yang telah diambil
      }
      
       void print() {//method print untuk menampilkan data
            if (isEmpty()) {//cek apakah queue dalam keadan kosong atau tidak, jika iya
                System.out.println("Antrian kosong");//tampilkan "Anrian kosomg"
            }else {//atau 
                 int i = depan;//inisialisasi i = depan
                  while (i != belakang) {//perulangan jika i tidak sama dengan belakang
                      System.out.print(q[i] + "-");//maka data akan dikurangi
                      i = (i + 1) % max;//dengan menampilkan index (i + 1) modulus max
                  }
                   System.out.println(q[i] + "-");//menampilkan array q yang memiliki index i
                   System.out.println("Jumlah antrian : " + size);// dan menampilkan jumlah antrian
            }
       }

}
