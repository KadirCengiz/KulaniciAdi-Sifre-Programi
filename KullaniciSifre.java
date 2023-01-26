import java.util.Scanner;
public class KullaniciSifre {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        String kullanici,sifre;

        //Kullanıcı İsmi ve Şifre girme işleminin hazırlanması.

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı ismi giriniz: ");
        kullanici  = input.nextLine();

        System.out.print("Şifreyi giriniz: ");
        sifre  = input.nextLine();

        //Kullanıcı ismi ve Şifresinin karşılaştırılması.

        if (kullanici.equals("patika") && sifre.equals("java12345")) {
            System.out.println("Giriş yaptınız");
        } else if (!kullanici.equals("userName") && !sifre.equals("java12345")) {
            System.out.println("Hatalı giriş yaptınız!\nŞifrenizi sıfırlamak istermisiniz? \n1-Evet \n2-Hayır");
            System.out.print("Seçiminiz:");

            //Hatalı şifrenin sıfırlandıktan sonra, yeni şifrenin oluşturulması işlemi.

            int secim;
            secim = input.nextInt();
            if (secim == 1) {
                String NewPassword;
                Scanner yeni = new Scanner(System.in);
                System.out.print("Yeni Şifrenizi Giriniz:");
                NewPassword = yeni.nextLine();

                if (sifre.equals(NewPassword)) {
                    System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz! Şifre oluşturalamadı \nLütfen başka şifre giriniz.");
                } else if (!sifre.equals(NewPassword)) {
                    System.out.print("Yeni şifreniz Oluşturuldu.");
                }
            }
        }
    }
}