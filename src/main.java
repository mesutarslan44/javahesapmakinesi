import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /* Switch Case ile Hesap Makinesi */
        int sayi1,sayi2,secim;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: " );
        sayi1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: " );
        sayi2=input.nextInt();
        System.out.println("Yapmak istediğiniz işlem nedir ?  \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme" );
        System.out.print("Seçiminiz: " );
        secim=input.nextInt();
        switch (secim){
            case 1:
                System.out.println("Toplam: " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma: " + (sayi1*sayi2));
                break;
            case 4:
                if (sayi2 != 0){
                System.out.println("Bölme: " + (sayi1/sayi2));

                }   else{
                System.out.println("Bir Sayı 0'a Bölünemez ! ");
                }
            break;
        }
    }

}