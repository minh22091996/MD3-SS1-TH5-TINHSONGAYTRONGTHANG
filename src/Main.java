import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner resul = new Scanner(System.in);
        System.out.println("nhap thang ");
        int moth = resul.nextInt();

        switch (moth){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 10 :
            case 12 :
                System.out.println("co 31 ngay");
                break;
            case 2 :
                System.out.println("co 28 hoac 29 ngay");
                break;
            case 4 :
            case 6 :
            case 8 :
            case 9 :
            case 11 :
                System.out.println("co 30 ngay");
                break;
            default:
                System.out.println("ban nhap sai roi");

        }

    }
}
