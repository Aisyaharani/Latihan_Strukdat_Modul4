 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat4;

import java.util.*;

/**
 *
 * @author AISYAH
 */
public class Mahasiswa {

    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 202220000));
        mhs.put("2", new Mahasiswa("Agus", "3A", "Sistem Operasi", 202220001));
        mhs.put("3", new Mahasiswa("Arro", "3B", "Struktur Data", 202220002));

        System.out.println("Masukkan ID :");
        input = scan.nextLine();
        data = mhs.get(input);

        if (data != null) {
            System.out.println("Data Mahasiswa \t :" + data.nama);
            System.out.println("Kelas \t :" + data.kelas);
            System.out.println("Matkul Praktikum \t :" + data.matkulPraktikum);
            System.out.println("NIM \t :" + data.nim);
        }
        scan.close();
    }
}
