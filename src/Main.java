public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        System.out.println("Задача 1:");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    private static void task2() {
        System.out.println("Задача 2:");
        int[] arr = generateRandomArray();
        int maxExpenses = Integer.MIN_VALUE;
        int minExpenses = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < minExpenses) {
                minExpenses = j;
            } else if (j > maxExpenses) {
                maxExpenses = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. " +
                "Максимальная сумма трат за день составила " + maxExpenses + " рублей.");
    }

    private static void task3() {
        System.out.println("Задача 3:");
        int[] arr = generateRandomArray();
        float allExpenses = arr[0];
        for (int i = 1; i < arr.length; i++) {
            allExpenses += arr[i];
        }
        float averageExpenses = allExpenses / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила " + averageExpenses + " рублей.");
    }

    private static void task4() {
        System.out.println("\nЗадача 4:");
        int[] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}