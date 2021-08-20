import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double kdvTutari, kdvDahilTutar;
        System.out.println("Kdv Hesabı Yapılacak Tutarı Giriniz : ");
        Scanner input = new Scanner(System.in);
        double miktar = input.nextDouble();

        double kdvOrani = (miktar>1000) ? 0.08 : 0.18;
        kdvTutari = miktar * kdvOrani;
        kdvDahilTutar = miktar + kdvTutari;

        System.out.println("Ana Para: " + miktar);
        System.out.println("Uygulanan KDV Oranı: % " + kdvOrani*100);
        System.out.println("Kdv Tutarı: " + kdvTutari);
        System.out.println("Kdv Dahil Tutarı: " + kdvDahilTutar );

    }
}
