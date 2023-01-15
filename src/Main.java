import java.util.Scanner;

public class Main {
    static void palindrom(int a) {
        int temp = a, lastBas, basamak = 0;
        while (temp != 0) {
            lastBas = temp % 10;
            basamak = (basamak * 10) + lastBas;
            temp /= 10;
        }
        if (basamak == a) {
            System.out.println(a + " sayısı bir Palindrom sayısıdır.");
        }else {
            System.out.println(a + " sayısı bir Palindrom sayısı değildir !!!");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        palindrom(sayi);
    }
}
