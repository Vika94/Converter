import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Conv {
    public static void main(String[] args) {

        /*System.out.print("Введите валюту: ");
        Scanner scan = new Scanner(System.in);
        String nameCurrency = scan.nextLine();

        System.out.print("Введите сумму: ");
        Scanner scan1 = new Scanner(System.in);
        int sum = scan1.nextInt();

        String currency[] = {"USD", "EUR", "RUB"};
        double kof[] = {0.398, 0.313, 3.3};
        double result = 0;
        String text = "";
        for (int i = 0; i < kof.length; i++) {
            if (nameCurrency.equals(currency[i])) {
                result = sum * kof[i];
                text = currency[i];
                System.out.println(result + " " + text);
            }
         */
        //Задача 1.массив четных от 2-20
        /*
        int[] number = new int[10];
        int j = 0;
        for (int i = 2; i <= 20; i = i + 2) {
            number[j] = i;
            j++;
        }
        for (int numb : number) {
            System.out.print(numb + " ");
        }
        System.out.println();
        for (int numb : number) {
            System.out.println(numb);
        }

         */

        //Задача 2 массив нечетеных в обратке
        /*
        int[] odd = new int[50];
        int j = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            odd[j] = i;
            j++;
        }
        for (int odds : odd) {
            System.out.print(odds + " ");
        }
        System.out.println();
        for (int a = odd.length - 1; a >= 1; a--) {
            System.out.print(odd[a] + " ");
        }
         */
        // Задача 3.Рандом с количество четных
        /*
        int array[] = new int[15];
        int even = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print(even);
         */
        //Задача 4 рандом с заменой нечетного индекса на 0
        /*int array[] = new int[20];
        int odd = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(array[i]);

         */
        //Задача 5.два массива найти среднее и вычислить большее
       /* int[] numb = new int[5];
        int[] numb1 = new int[5];
        Random random = new Random();
        for (int i = 0; i < numb.length; i++) {
            numb[i] = random.nextInt(15);
            System.out.print(numb[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numb.length; i++) {
            numb1[i] = random.nextInt(15);
            System.out.print(numb1[i] + " ");
        }
        double average = 0;
        double average1 = 0;
        for (int i = 0; i < numb.length; i++) {
            average += numb[i];
            average1 += numb1[i];
        }
        System.out.println();
        if (average < average1)
            System.out.println("Среднее арифмитическое первого массива больше второго");
        else if (average > average1)
            System.out.println("Среднее арифмитическое первого массива меньше второго");
        else if (average == average1)
            System.out.println("Среднее арифмитическое первого массива равно второму");

        */
        //Задача 6.является ли массив возрастающим
       /* int[] numb = new int[4];
        Random random = new Random();
        for (int i = 0; i < numb.length; i++) {
            numb[i] = random.nextInt(10);
            System.out.print(numb[i] + " ");
        }
        boolean grow = true;
        for (int i = 1; i < numb.length; i++) {
            if (numb[i] <= numb[i - 1]) {
                grow = false;
                break;
            }
        }
        System.out.println();
        if (grow)
            System.out.println("Массив явлется возрастающим");
        else
            System.out.println("Массив не явлется возрастающим");

        */
        //Задача 7. Определить максимальное и сообщить индекс последнего вхождения
        /*int[] numb = new int[12];
        int maxNumber = 0;
        int maxIndex = 0;
        Random random = new Random();
        for (int i = 0; i < numb.length; i++) {
            numb[i] = random.nextInt(15);
            System.out.print(numb[i] + " ");
            if (maxNumber <= numb[i]) {
                maxNumber = numb[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("Максимальный индекс" + " " + maxIndex);

         */
        //Задача 8.с 3я массивами
       /* int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        double[] mas3 = new double[10];
        Random random = new Random();
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = random.nextInt(9);
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = random.nextInt(9);
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = (double) mas1[i] / mas2[i];
            System.out.print(mas3[i] + " ");
        }
        System.out.println();
        int element = 0;
        for (int i = 0; i < mas3.length; i++) {
            if (mas3[i] % 1 == 0)
                element++;
        }
        System.out.print("Количествор целых элементов в 3 массиве" + " - " + element);

        */
        //Задача 9
        /*int n;
        int a;
        int lSum = 0;
        int rSum = 0;
        do {
            System.out.print("Введите целое положительное число: ");
            Scanner scan1 = new Scanner(System.in);
            n = scan1.nextInt();
            if (n % 2 != 0 || n < 1)
                System.out.print("Ошибка.");
        }
        while (n % 2 != 0 || n < 1);
        int[] mas = new int[n];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(15);
            System.out.print(mas[i] + " ");
        }
        a = mas.length / 2;
        for (int i = 0; i < a; i++) {
            lSum += mas[i];
            rSum += mas[n - 1 - i];
        }
        if (lSum < rSum)
            System.out.print("Сумма левой половины массива больше правой");
        else if (lSum > rSum)
            System.out.print("Сумма левой половины массива меньше правой");
        else if (lSum == rSum)
            System.out.print("Сумма левой половины массива равна правой");

         */
        //Задача 10
       /* int n = 0;
        int a;
        int s1 = 0;
        int s2 = 0;
        int j = 0;
        do {
            System.out.print("Введите число: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                Random random = new Random();
                if (n > 3) {
                    int[] mas1 = new int[n];
                    for (int i = 0; i < mas1.length; i++) {
                        mas1[i] = random.nextInt(n);
                        System.out.print(mas1[i] + " ");
                        if (mas1[i] % 2 == 0) {
                            j++;
                        }
                    }
                    System.out.println("");
                    if (j != 0) {
                        int[] mas2 = new int[j];
                        j = 0;
                        for (int i = 0; i < mas1.length; i++) {
                            if (mas1[i] % 2 == 0) {
                                mas2[j] = mas1[i];
                                System.out.print(mas2[j] + " ");
                                j++;
                            }
                        }
                    } else {
                        System.out.println("Четных чисел нет");
                    }
                }
            }
        } while (n <= 3);

        */
        //Найти произведение элементов, кратных 3.
        /*int mas[] = {2, 3, 5, 8, 9, 12, 1, 4, 15, 18, 19, 21};
        Random random = new Random();
        int j = 1;
        for (int i = 0; i < 12; i++) {
            if (mas[i] % 3 == 0) {
                j = j * mas[i];
            }
        }
        System.out.print(j + " ");

         */
        //Найти среднее арифметическое элементов с нечетными номерами.
       /* int[] mas = {2, 5, 18, 7, 4, 19, 6, 2, 7, 22};
        int j = 0;
        double sum = 0;
        double average = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[j] = i + 1;
            j++;
            sum = sum + j;
            average = sum / (mas.length / 2);
        }
        System.out.print(average);

        */


        //

    }
}











