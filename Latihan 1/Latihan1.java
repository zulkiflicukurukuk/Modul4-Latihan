import java.util.Scanner;
import java.lang.Math;

public class Latihan1 {
    public static int angka;
    public static Scanner objInput = new Scanner(System.in);
    public static double akarKuadrat(int n){
        return Math.sqrt(n);
    }
    public static double pangkat(int n,int p){
        return Math.pow(n,p);
    }
    public static double logaritma(int n){
        return Math.log(n);
    }
    public static double faktorial(int n){
        return (n==1 || n == 0 ) ?  1 :  n * faktorial(n - 1);
    }

    public static void inputan(){
        System.out.print("Masukkan Angka : ");
        angka = objInput.nextInt();
    }
    public static void main(String[] args) {
        int chooser, pangkat;
        double hasil = 0;
        while (true) {
            System.out.println("== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operator : ");
            
            chooser = objInput.nextInt();
            if (chooser != 5)
                inputan();
            switch (chooser) {
                case 1:
                    hasil = akarKuadrat(angka);
                    System.out.println("Hasil akar kuadrat dari : " + angka + " adalah " + hasil);
                    break;
                case 2:
                    System.out.print("Masukkan Pangkat : ");
                    pangkat = objInput.nextInt();
                    hasil= pangkat(angka,pangkat);
                    System.out.println( + angka + " pangkat " + pangkat + " adalah " + hasil);
                    break;
                case 3:
                    hasil = logaritma(angka);
                    System.out.println("Logaritma natural dari " + angka + " adalah " + hasil);
                    break;
                case 4:
                    hasil = faktorial(angka);
                    System.out.println("Faktorial dari " + angka + " adalah " + hasil);
                    
                    break;
                case 5:
                    objInput.close();
                    System.out.println("Terima kasih telah menggunakan kalkulator ini .");
                    System.exit(0);
                    break;
            }
           
        }
    }
}