import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        //1
        pintThreeWords();
        //2
        checkSumSign();
        //3
        printColor();
        //4
        compareNumbers();
        //5
        System.out.println(between10And20(randomInRange(0, 10), randomInRange(0, 10)));
        //6
        numberSign(randomInRange(-100, 100));
        //7
        System.out.println(forNegativeNumber(randomInRange(-100, 100)));
        //8
        printString("Tell me why", randomInRange(0, 4));
        //9
        System.out.println(forLeapYear(randomInRange(0, 2024)));
        //10
        inverseArr();
        //11
        fillArr();
        //12
        sixByTwoArr();


    }

    // 1
    static void pintThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // 2
    static void checkSumSign() {
        int a = randomInRange(-100, 100);
        int b = randomInRange(-100, 100);
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    // 3
    static void printColor() {
        int value = randomInRange(-50, 150);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    // 4
    static void compareNumbers() {
        int a = randomInRange(-100, 100);
        int b = randomInRange(-100, 100);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    static boolean between10And20(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    // 6
    static void numberSign(int a) {
        boolean isPositive = a >= 0;
        if (isPositive) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // 7
    static boolean forNegativeNumber(int a) {
        return a < 0;
    }

    // 8
    static void printString(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(string + " ");
        }
        
    }

    //9
    static boolean forLeapYear(int year) {
        return (year % 4 == 0 || year % 400 == 0) && year % 100 != 0;
    }

    //10
    static void inverseArr() {
        int[] arr = {0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] ^ 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //11
    static void fillArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //12
    static void sixByTwoArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr2 = new int[9];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                arr2[count] = arr[i];
                count++;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }

    static int randomInRange(int min, int max) {
        int rangeCoefficient = max - min + 1; // коэффициент, устанавливающий рандомный диапозон чисел
        int lowBorder = min; // нижняя граница
        int result = (int) (Math.random() * rangeCoefficient + lowBorder);
        return result;
    }

}