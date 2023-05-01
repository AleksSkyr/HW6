public class Main {
    public static void main(String[] args) {

        tasc1();
        tasc2();
        tasc3();
        tasc4();
        tasc5();
        tasc6();
        tasc7();
    }

    public static void tasc1() {
        System.out.println("Задача 1");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Цикл " + i + " ");
        }
    }

    public static void tasc2() {
        System.out.println("Задача 2");

        for (int i = 10; i >= 0; i--) {
            System.out.println("Число равно: " + i + " ");
        }

    }

    public static void tasc3() {
        System.out.println("Задача 3");

        for (int i = 17; i > 1; i /= 2) {
            System.out.println("Число равно: " + i + " ");
        }
    }
    public static void tasc4() {
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i --) {
            System.out.println("Число: " + i + " ");
        }
        int i = 10;
        while (i <= -10) {
            System.out.println("Число: " + i + " ");
            i = i + 4;
        }
    }
    public static void tasc5() {
        System.out.println("Задача 5");

        for (int g = 1904; g <= 2096; g = g + 4) {
            System.out.println("Высокосные года: " + g + " ");
        }
        int g = 1904;
        while (g <= 2096) {
            System.out.println("Bысокосный год: " + g + " ");
            g = g + 4;
        }
    }
    public static void tasc6() {
        System.out.println("Задача 6");

        for (int n = 7; n <=98; n = n + 7) {
            System.out.println("Числа: " + n + " ");
        }
    }
    public static void tasc7() {
        System.out.println("Задача 7");

        for (int n = 1; n < 512; n = n * 2){
            System.out.print("Числа: " + n + " ");
        }
    }
}
