import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, select;
        System.out.print("Sayı : ");
        number1 = input.nextInt();
        System.out.print("Sayı : ");
        number2 = input.nextInt();

        System.out.println("1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme");
        System.out.print("İşlem ? : ");
        select = input.nextInt();


        switch (select){
            case 1:
                System.out.println("Toplam : "  + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma : " + (number1 * number2));
                break;
            case 4:
                switch (number2){
                    case 0:
                        System.out.println("Geçersiz");
                    break;
                    default:
                    System.out.println("Bölme : " + (number1 / number2));
                    break;

                }
                break;
            default:
                System.out.println("Tekrar Deneyinizi");

                /**
                 * @author Erdem AYDEMİR.
                 */


        }

    }
}
