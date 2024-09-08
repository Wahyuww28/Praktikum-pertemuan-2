package com.Tugas;

public class OperatorMain {
    public static void main(String[] args) {
        Rumus Rumus = new Rumus();

        int tambah = Rumus.Tambah(20, 10);
        System.out.println("Hasil pertambahan : " + tambah);

        int kurang = Rumus.Kurang(10, 5);
        System.out.println("Hasil pengurangan : " + kurang);

        int kali = Rumus.Perkalian(10, 3);
        System.out.println("Hasil perkalian : " + kali);

        int bagi = Rumus.Pembagian(21, 2);
        System.out.println("Hasil Pembagian : " + bagi);

    }
}
