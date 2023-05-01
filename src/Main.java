public class Main {
    public static void main(String[] args) {

        tasc1();
        tasc2();
        tasc3();
        tasc4();
        tasc5();
//        tasc6();
//        tasc7();
    }

    public static void tasc1() {
        System.out.println("Задача 1");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void tasc2() {
        System.out.println("Задача 2");

        for (int i = 10; i >= 0; i--) {
            System.out.println("Число равно: " + i);
        }

    }

    public static void tasc3() {
        System.out.println("Задача 3");

        for (int i = 17; i > 1; i /= 2) {
            System.out.println("Число равно: " + i);
        }
    }
    public static void tasc4() {
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i --) {
            System.out.println("Число: " + i);
        }
    }
    public static void tasc5() {
        System.out.println("Задача 5");


    }
}
