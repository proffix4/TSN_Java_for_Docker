import java.util.Scanner;

public class Main {
    // Вычисление квадратного уравнения
    public static void main(String[] args) {
        double a, b, c; // Входные переменные
        double x1, x2; // Искомые значения
        double d; // Дискриминант
        try {
            Scanner sc = new Scanner(System.in); //Создаем объект для ввода данных с консоли
            System.out.println("*Решение квадратного уравнения");
            System.out.print("Введите a=");
            a = sc.nextDouble(); // Ввод значения "a" с консоли
            System.out.print("Введите b=");
            b = sc.nextDouble(); // Ввод значения "b" с консоли
            System.out.print("Введите c=");
            c = sc.nextDouble(); // Ввод значения "c" с консоли
            d = (b * b) - 4 * a * c; // Расчет дискриминанта
            x1 = (-b + Math.sqrt(d)) / (2 * a); // Расчет "x1"
            x2 = (-b - Math.sqrt(d)) / (2 * a); // Расчет "x2"
            if (!(Double.isNaN(x1)) && (!Double.isInfinite(x1)) // Проверка существования значений
                    && (!(Double.isNaN(x2)) && (!Double.isInfinite(x2)))) {
                System.out.format("x1=%.3f%nx2= %.3f%n", x1, x2); // Вывод ответа
            } else {
                System.out.println("Нет решения!"); // Нет решения
            }
            sc.close(); // Закрываем ввод с консоли
        } catch (Exception e) { // Ввели вместо цифр буквы
            System.out.println("Неверные входные данные!");
        }
    }
}