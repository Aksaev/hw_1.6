public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sumValue = 0;
        int maxValue = arr[0];
        int minValue = arr[0];
        int index = 0;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        System.out.println("Домашнее задание. Урок 1.6. Массивы ч.2");
        System.out.println("---------");

        // Задание 1
        System.out.println("Задание 1");
        for (int i = 0; i < arr.length; i++) {
            sumValue = sumValue + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumValue + " рублей.");
        System.out.println("---------");

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            } else if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxValue + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minValue + " рублей.");
        System.out.println("---------");

        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i < arr.length; i++) {
            index = i + 1;
        }
        if ((sumValue % index)  == 0) {
            System.out.printf("Средняя сумма трат за месяц составила %d рублей.\n" , sumValue / index);
        } else {
            System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n" , (double) sumValue / index);
        }
        System.out.println("---------");

        // Задание 4
        System.out.println("Задание 4");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("\n---------");
    }

    // Получение массива случайных чисел
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}