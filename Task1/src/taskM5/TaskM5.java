package taskM5;

import java.util.Scanner;

public class TaskM5 {
/* Задание 5
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
*/

    public static void main(String[] args) {

        System.out.println("Enter four-digit number");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int first, second, third, four;
        boolean result;

        first = (number % 10); //получили первую цифру через остаток от деления на 10
        number /= 10; //откинули последний знак в числе и присвоили новое значение перенной

        second = number % 10; //получили вторую цифру через остаток от деления на 10
        number /= 10; //откинули второй знак из числа и присвоили новое значение переменной

        third = number % 10; //получили третью цифру через остаток от деления на 10
        number /= 10;//откинули третий знак из числа и присвоили новое значение переменной

        four = number % 10; //получили четвертую цифру через остаток от деления на 10

        result = (first != second && first != third && first != four && second != third
                && second != four && third != four); // определяем уникальность цифр в числе

        System.out.println(result); //выводим булево значение

        scanner.close();
    }
}