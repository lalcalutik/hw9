import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ = arr[i] + summ;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");
    }

    private static void task2() {
        System.out.println("Task 2");
        int[] arr = generateRandomArray();
        int maxSpending = 0;
        int minSpending = 200001;
        for (final int current : arr) {
            if (current > maxSpending) {
                maxSpending = current;
            }
            if (current < minSpending) {
                minSpending = current;
            }
        }

            System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей.");
            System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей.");
    }

    private static void task3() {
        System.out.println("Task 3");
        int[] arr = generateRandomArray();
        int summ = 0;
        double average;
        for (int i = 0; i < arr.length; i++) {
            summ = arr[i] + summ;
        }
        average = (double) summ / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    private static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}