import java.util.Scanner;

public class TugasKetiga {
    public static void main(String[] args) {
        Hitung TugasKetiga = new Hitung();
        System.out.println("=====Menghitung Bangun Datar=====");
        TugasKetiga.lingkaran();
        TugasKetiga.persegi();
        TugasKetiga.persegipanjang();
        TugasKetiga.segitiga();
    }
}


class Hitung {
    void lingkaran() {
        Scanner scan = new Scanner(System.in);
        double luas, phi = 3.14;
        int r;
        System.out.println("menghitung luas lingkaran");
        System.out.println("masukkan jari jari = ");
        r = scan.nextInt();
        luas = phi * r * r;
        System.out.println("luas lingkaran = " + luas);
    }
    void persegi(){
        int sisi, luas;
        Scanner scan = new Scanner(System.in);
        System.out.println("menghitung luas persegi");
        System.out.println("masukkan sisi persegi = ");
        sisi = scan.nextInt();
        luas = sisi*sisi;
        System.out.println("luas persegi = "+luas);
    }
    void persegipanjang(){
        int panjang, lebar,luas;
        Scanner scan = new Scanner(System.in);
        System.out.println("menghitung luas persegi panjang");
        System.out.println("masukkan panjang = ");
        panjang = scan.nextInt();
        System.out.println("masukkan lebar = ");
        lebar = scan.nextInt();
        luas = panjang*lebar;
        System.out.println("luas persegipanjang = "+luas);
    }
    void segitiga(){
        int alas, tinggi;
        Scanner scan = new Scanner(System.in);
        System.out.println("menghitung luas segitiga");
        System.out.println("masukkan nilai alas = ");
        alas = scan.nextInt();
        System.out.println("masukkan nilai tinggi = ");
        tinggi = scan.nextInt();
        double luas = 0.5 * alas * tinggi;
        System.out.println("luas segitiga = "+luas);
    }
}