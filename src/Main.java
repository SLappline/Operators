import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Вводим числа с клавиатуры и записываем в переменные numx, numy и numz
        System.out.print("Введите число x: ");
        Scanner first = new Scanner(System.in);
        int numx = first.nextInt();
        System.out.print("Введите число y: ");
        Scanner second = new Scanner(System.in);
        int numy = second.nextInt();
        System.out.print("Введите число z: ");
        Scanner three = new Scanner(System.in);
        int numz = three.nextInt();
        //Находим среднее арифметическое введенных чисел и записываем в переменную a
        double a = (numx + numy + numz) / 3;
        //Вывод для проверки посчитанного среднего арифметического
        System.out.println(a);
        //Создаем переменную и записываем в нее деление среднего арифметического на 2
        //с округлением в меньшую сторону Math.floor
        double b;
        b = Math.floor(a/2);
        //Преобразуем найденное число b в тип int и записываем в переменную b2
        //Можно не использовать, тогда увидим (например: 11.0)
        //int b2 = (int) b;
        //Выводим для проверки значения
        //System.out.println(b2);
        //Если полученное число b2 больше 3, то выводим "Программа выполнена корректно" наче "Попробуйте еще раз..."
        if (b > 3){
            System.out.println("Программа выполнена корректно");
        }
        else {
            System.out.println("Попробуйте еще раз..");
        }
    }
}