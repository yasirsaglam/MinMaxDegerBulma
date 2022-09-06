import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int adet = input.nextInt();
        int sayi, max = 0, min = 0;
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            sayi = input.nextInt();
            if (i == 1) {
                max = sayi;
                min = sayi;
            }
            if (sayi >= max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
