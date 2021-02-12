package taskM4;

public class TaskM4 {


    public static void main(String[] args) {


        int number = 1234; //исходное число

        int first = number / 1000; // первая цифра

        int a = first*1000;
        int b = number-a;
        int second = b / 100;    //вторая цифра

        int c = second*100;
        int d = number - a -c;
        int third = d /10;    //третья цифра

        int e = third*10;
        int fourth = number - a - c -e;   //четвертая цифра


        System.out.print(fourth);
        System.out.print(third);
        System.out.print(second);
        System.out.print(first); //что-то я тут затупил... пришлось хуевертить импровизацию... через жопу)

    }
}
