import java.util.Scanner;

public class Conv {
    public static void main(String[] args) {
        System.out.print("Введите белорусский рубль: ");
        Scanner scan = new Scanner(System.in);
        double blr = scan.nextDouble();
        double kof = 0.398406374501992;
        double usd = blr * kof;
        System.out.println("Получаем " + usd + "$");
        scan.close();
    }
}
