import java.util.Scanner;

public class TugasKeempat {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("=====Menghitung luas dan keliling=====");
                System.out.println("=============Bangun Datar=============");
                System.out.println("1. Lingkaran\n2. Persegi\n3. Persegi Panjang\n4. Segitiga\n5. Exit");
                System.out.println("pilih menu = ");
                int pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        while (true){
                            Scanner scan = new Scanner(System.in);
                            System.out.println("menu lingkaran");
                            System.out.println("masukkan rusuk = ");
                            double r = input.nextDouble();
                            Lingkaran l = new Lingkaran();
                            l.HLingkaran(r);
                            while (true){
                                System.out.println("1. luas\n2.keliling");
                                System.out.println("pilih menu = ");
                                int menu = input.nextInt();
                                switch (menu){
                                    case 1 :
                                        System.out.println(" luas lingkaran = "+l.luas());
                                        break;
                                    case 2 :
                                        System.out.println(" keliling lingkaran = "+l.keliling());
                                        break;
                                }
                            }
                        }

                    case 2:
                        while (true) {
                            Scanner scan = new Scanner(System.in);
                            System.out.println("menu persegi");
                            System.out.println("masukkan sisi = ");
                            double s = input.nextDouble();
                            Persegi p = new Persegi();
                            p.HPersegi(s);
                            while (true) {
                                System.out.println("1. luas\n2.keliling");
                                System.out.println("pilih menu = ");
                                int menu = input.nextInt();
                                switch (menu) {
                                    case 1:
                                        System.out.println(" luas persegi = " + p.luas());
                                        break;
                                    case 2:
                                        System.out.println(" keliling persegi = " + p.keliling());
                                        break;
                                }
                            }
                        }
                    case 3:
                        while (true) {
                            Scanner scan = new Scanner(System.in);
                            System.out.println("menu persegi panjang");
                            System.out.println("masukkan panjang = ");
                            double p = input.nextDouble();
                            System.out.println("masukkan lebar = ");
                            double l = input.nextDouble();
                            PersegiPanjang pj = new PersegiPanjang();
                            pj.HPersegiPanjang(p,l);
                            while (true) {
                                System.out.println("1. luas\n2.keliling");
                                System.out.println("pilih menu = ");
                                int menu = input.nextInt();
                                switch (menu) {
                                    case 1:
                                        System.out.println(" luas persegi panjang = " + pj.luas());
                                        break;
                                    case 2:
                                        System.out.println(" keliling persegi panjang = " + pj.keliling());
                                        break;
                                }
                            }
                        }

                    case 4:
                        while (true) {
                            Scanner scan = new Scanner(System.in);
                            System.out.print("Masukkan Nilai Sisi Alas : ");
                            double sa = input.nextDouble();
                            System.out.print("Masukkan Nilai Sisi Tinggi : ");
                            double st = input.nextDouble();
                            System.out.print("Masukkan Nilai Sisi Miring : ");
                            double sm = input.nextDouble();
                            Segitiga se = new Segitiga();
                            se.HSegitiga(sa,st,sm);
                            while (true) {
                                System.out.println("1. luas\n2.keliling");
                                System.out.println("pilih menu = ");
                                int menu = input.nextInt();
                                switch (menu) {
                                    case 1:
                                        System.out.println(" luas segitiga = " + se.luas());
                                        break;
                                    case 2:
                                        System.out.println(" keliling segitiga = " + se.keliling());
                                        break;
                                }
                            }
                        }
                    case 5:
                        System.exit(0);

                }
                System.out.println("-------------------------------------");
            }
        }
    }

    interface BangunDatar{

    }
    class Persegi implements BangunDatar{
        double s;
            public void HPersegi(double s){
                this.s=s;
            }
            public double luas(){
                return s*s;
            }
            public double keliling(){
                return s*4;
            }
    }

    class PersegiPanjang implements BangunDatar{
        double pa;
        double l;
            public void HPersegiPanjang(double pa, double l){
                this.pa=pa;
                this.l=l;
            }
            public double luas(){
                return pa*l;
            }
            public double keliling(){
                return 2*(pa+l);
            }
    }
    class Segitiga implements BangunDatar{
        double sa; //Sisi Alas
        double st; //Sisi Tinggi
        double sm; //Sisi Miring
            public void HSegitiga(double sa, double st, double sm){
                this.sa=sa;
                this.st=st;
                this.sm=sm;
            }
            public double luas(){
                return (sa*st)/2;
            }
            public double keliling(){
                return sa+st+sm;
            }
    }

    class Lingkaran implements BangunDatar{
        double r;
            public void HLingkaran(double r){
                this.r=r;
            }
            public double luas(){
                return (22*r*r)/7;
            }
            public double keliling(){
                return (22*2*r)/7;
            }
    }


