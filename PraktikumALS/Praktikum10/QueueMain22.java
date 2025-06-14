package Praktikum10;


import java.util.Scanner;

public class QueueMain22 {
    public static void menu() {
        System.out.println("Masukkan operasi yang ingin dilakukan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan kapasitas queue: ");
    int n = sc.nextInt();
    Queue22 Q = new Queue22(n);
    int pilih = sc.nextInt();

    do {
        menu();
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
            if (Q.IsFull()) {
                System.out.println("Queue sudah penuh");
                pilih = 0;
            } else {
            System.out.print("Masukkan data baru: ");
            int dataMasuk = sc.nextInt();
            Q.enqueue(dataMasuk);
            }
            break;
            case 2:
            if (Q.IsEmpty()) {
                System.out.println("Queue kosong");
                pilih = 0;
            }
            int dataKeluar = Q.Dequeue();
            if (dataKeluar != 0) {
                System.out.println("Data yang dikeluarkan: " + dataKeluar);
                break;
            }
            case 3:
            Q.print();
            break;
            case 4:
            Q.peek();
            break;
            case 5:
            Q.clear();
            break;
        }
    } while (pilih ==  1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
}


}