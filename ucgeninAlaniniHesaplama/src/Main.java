import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler
        int a,b,c,Alan,u;
        Scanner deger=new Scanner(System.in);

        //Kullanıcıdan alan hesaplamak için çevrenin uzunluklarını istiyouruz
        System.out.print("1. kenar uzunluğu Girin");
        a = deger.nextInt();

        System.out.print("2 . Kenar uzunluğu girin");

        b=deger.nextInt();

        System.out.print(("3. Kenar uzunluğunu girin"));
        c=deger.nextInt();

        //Formülümüz
        u=(a+b+c)/2;

        Alan= (int) (Math.sqrt(u-a)*(u-b)*(u-c));

        //Sonuç yazdırma
        System.out.print("Ückenin Alanı: "+Alan);
        



    }
}