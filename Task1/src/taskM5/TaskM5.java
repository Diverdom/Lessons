package taskM5;

public class TaskM5 {


    public static void main(String[] args) {


        int number = 1235; //исходное число

        int first = number / 1000; // первая цифра

        int a = first*1000;
        int b = number-a;
        int second = b / 100;    //вторая цифра

        int c = second*100;
        int d = number - a -c;
        int third = d /10;    //третья цифра

        int e = third*10;
        int fourth = number - a - c -e;   //четвертая цифра

        System.out.println(first != second & second != third & third != fourth & first != third & first != fourth
                & second != fourth);   // Выводит в консоль значение "True" в случае если все цифры числа уникальны.


        //ГДЕ МОЯ ПЕЧЕНЬКА БЛДЖАД?!!
    }
}
