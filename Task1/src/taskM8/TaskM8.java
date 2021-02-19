package taskM8;
/* Задача 8
Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/

import java.util.Random;

public class TaskM8 {
    public static void main(String[] args) {

        Random rand = new Random();                      // создаем рандомайзер
        int x = rand.nextInt();

        int secondNumber = (x / 10) % 10;                //создаем переменнуи и присваиваем значение предпоследней цифры числа
        int number = x % 10;                             //создаем переменнуи и присваиваем значение последней цифры

        switch (secondNumber) {                          //Применяем оператор SWITCH
            case (1): {                                  //если значение предпоследней цифры == 1 - окончание фразы будет "рублей"
                System.out.println(x + " рублей");
            }
            break;                                       //останавливаем выполнение кейса


            default:                                     //по умолчанию, все значения !=1 дают "true"

                                                         //далее определяем правильное склонение, исходя из значения последней цифры в числе

                if (number == 1) {                       //выбираем правильный падлеж для "рубль"
                    System.out.println(x + " рубль");
                }
                if (number == 5 || number == 6 || number == 7 || number == 8 || number == 9 || number == 0) {
                    System.out.println(x + " рублей");
                }
                if (number == 2 || number == 3 || number == 4) {
                    System.out.println(x + " рубля");
                }
                break;                                   //останавливаем выполнение кейса
        }
    }
}



