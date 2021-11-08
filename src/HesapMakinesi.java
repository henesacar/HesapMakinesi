import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, c;

        System.out.print("İlk sayıyı giriniz: ");
        a = scn.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = scn.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçin: \n 1 - Toplam \n 2 - Çıkarma \n 3 - Çarpma \n 4 - Bölme");
        c = scn.nextInt();
        switch (c) {
            case 1:
                System.out.println("İşlem sonucunuz: " + (a + b));
                break;
            case 2:
                System.out.println("İşlem sonucunuz: " +(a-b));
                break;
            case 3:
                System.out.println("İşlem sonucunuz: " +(a*b));
                break;
            case 4:
                System.out.println("İşlem sonucunuz: " +(a/b));
                break;
            default:
                System.out.println("Lütfen geçerli bir rakam giriniz.");
        }

    }
}
