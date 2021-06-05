package taskM21;
/*Задание 21
Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения. */

public class TaskM21 {
    public static void main(String[] args) {

        String string1 = "Whoop";

        Long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            string1 += "-whoop";
        }
        Long finish1 = System.currentTimeMillis();

        Long start2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder(string1);
        for (int i = 0; i < 100000; i++) {
            builder.append("-whoop");
        }
        Long finish2 = System.currentTimeMillis();

        Long start3 = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer(string1);
        for (int i = 0; i < 100000; i++) {
            buffer.append("-whoop");
        }
        Long finish3 = System.currentTimeMillis();

        System.out.println("via String: " + (finish1 - start1) + " ms.");
        System.out.println("via StringBuilder: " + (finish2 - start2) + " ms.");
        System.out.println("via StringBuffer: " + (finish3 - start3) + " ms.");
    }
}
