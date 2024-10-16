public class Main {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'a': // hem a hem de A için aynı şeyi verir
            case 'A':
                System.out.println("Mükemmel Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel Geçtiniz");
                break;
            case 'C':
                System.out.println("Güzel Geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default: // Yukarıda ki şeylerin dışında bir durum olursa
                System.out.println("Geçersiz Not Girdiniz");
        }


    }
}