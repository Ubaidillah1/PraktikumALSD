package Praktikum6;

import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;
        
        Mahasiswa22 m1 = new Mahasiswa22("123","Zidan", "2A", 3.2);
        Mahasiswa22 m2 = new Mahasiswa22("124","Ayu", "2A", 3.5);
        Mahasiswa22 m3 = new Mahasiswa22("125","Sofi", "2A", 3.1);
        Mahasiswa22 m4 = new Mahasiswa22("126","Sita", "2A", 3.9);
        Mahasiswa22 m5 = new Mahasiswa22("127","Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarka IPK(DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
    }
}
