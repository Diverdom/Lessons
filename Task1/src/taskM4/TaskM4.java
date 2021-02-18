package taskM4;

import java.util.Scanner;

public class TaskM4 {
    /*Задание 4
Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.
*/
    public static void main(String[] args) {

        System.out.println("Enter four-digit number");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result;

        result = number % 10; //получили первую цифру через остаток от деления на 10
        number /= 10; //откинули последний знак в числе и присвоили новое значение перенной

        result = (result * 10) + (number % 10); //сдвинули первую цифру влево через умножение на 10
        // и прибавили остаток от деления (получили реверсированное 2х значное число)
        number /= 10; //откинули второй знак из числа и присвоили новое значение переменной

        result = (result * 10) + (number % 10); //сдвинули число еще раз и прибавили третью цифру
        number /= 10;//откинули третий знак из числа и присвоили новое значение переменной

        result = (result * 10) + (number % 10); //сдвинули число еще раз и прибавили четвертую цифру

        System.out.println("Reversed number is " + result);

        scanner.close();

    }


}
