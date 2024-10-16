public class Main {
    public static void main(String[] args) {

        boolean dogruYanlis = true ; // Bellekte 1 Byte yer kaplar ölçülebilir uzunluk değildir doğruyu veya yanlışı ifade eder.
        char tekAlan = 'x' ; // Tekli karakterleri tutabilir örneğin 1,y,a,4 gibi yanlızca tek alanlık yer kaplar.
        byte sayiByte = 127 ; // Tam sayı tipinde -128'den +127 ye kadar değer alır 1 byte büyüklüğünde veri tutar.
        short sayiShort = 32767 ; // Tam sayı tipinde -32768 den +32867 ye kadar değer alır bellekte 2 byte yer kaplar.
        int sayiInt = 12; // bellekte 4 byte yer kaplar -2147483648 den +2147483648 e kadar veri tutabilir
        long sayiLong = 92233720 ; //-9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 8 byte yer kaplar
        double sayiDobule = 3.4 ; // ondalık sayıları tutmak istediğimiz zaman kullanırız

    }
}