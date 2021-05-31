package taskM19;
/*Задание 19
Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/

public class TaskM19 {
    public static void main(String[] args) {

        String string = " Имеется     строка с текстом.  ";
        string = string.trim();
        string = string.replaceAll("[\\s]{2,}", " ");


        if (string.length() > 0) {
            int counter = 1;
            char symbol;

            for (int i = 0; i < string.length(); i++) {
                symbol = string.charAt(i);
                if (symbol == ' ') {
                    counter++;
                }
            }
            System.out.println("given string contains " + counter + " words.");
        }
        else {
            System.out.println("Given string is empty");
        }


    }
}
