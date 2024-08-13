/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputnama;

/**
 *
 * @author Ramzy
 */
import java.util.Scanner;

public class InputNama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama lengkap
        System.out.print("Masukkan nama anda: ");
        String namaLengkap = scanner.nextLine();

        // Meminta pengguna memasukkan panjang karakter nama belakang
        System.out.print("Berapa panjang karakter nama belakang anda: ");
        int panjangNamaBelakang = scanner.nextInt();

        // Menentukan posisi awal nama belakang dengan menggunakan panjang nama belakang
        int posisiNamaBelakang = namaLengkap.length() - panjangNamaBelakang;

        // Mengambil nama belakang menggunakan method substring
        String namaBelakang = namaLengkap.substring(posisiNamaBelakang);

        // Menampilkan hasil
        System.out.println("Jadi nama belakang adalah " + namaBelakang);

        // Menutup scanner
        scanner.close();
    }
}

