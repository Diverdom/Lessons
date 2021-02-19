package taskM8;
/* Задача 8
Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/

import java.util.Random;

public class TaskM8 {
    public static void main(String[] args) {

        Random rand = new Random(); // создаем рандомайзер
        int x = rand.nextInt();
        int secondNumber = x / 10; //определяем значение предпоследней цифры
        int number = x % 10; //определяем значение последней цифры

        if (secondNumber == 1) {
            System.out.println(x + " рублей"); //если значение предпоследней цифры равно 1 - окончание фразы будет "рублей"
        }
        //далее определяем правильное склонение, исходя из значения последней цифры в числе

        else if (number == 1) {
            System.out.println(x + " рубль");
        }
        if (number == 5 || number == 6 || number == 7 || number == 8 || number == 9 || number == 0) {
            System.out.println(x + " рублей");
        }
        if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            System.out.println(x + " рубля");
        }
    }
}



