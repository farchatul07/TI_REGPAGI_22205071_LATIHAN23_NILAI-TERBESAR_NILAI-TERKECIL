/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan23;
import java.util.Scanner;
/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : Program ini berisi program untuk Mengitung Program Nilai Terbesar dan Terkecil Nilai Mahasiswa
 */
public class Latihan23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukan Nama Petugas : ");
        String namaPetugas = scanner.nextLine();
        
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int banyaknyaNilaiMahasiswa = scanner.nextInt();

        int[] nilaiMahasiswa = new int[banyaknyaNilaiMahasiswa];
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;
        
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        
        System.out.println("\n");
        System.out.println("====Hasil Nilai Mahasiswa====");
        System.out.println("\n");
        System.out.println("Nilai Terbesar: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil: " + nilaiTerkecil);
        System.out.println("\n");
        System.out.println("Petugas: " + namaPetugas);

        scanner.close();
    }
}
