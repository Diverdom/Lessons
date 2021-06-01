package taskM20;
/*Задание 20
Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.*/

public class TaskM20 {
    public static void main(String[] args) {

        String text = "It reads characters from the input sequence.";
        text = text.trim();
        text = text.replaceAll(" +", " ");
        StringBuilder result = new StringBuilder();
        char symbol;

        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);

            if (symbol == ' '|| symbol == ','|| symbol == '.'){
                result.append(text.charAt(i-1));
            }
        }
        System.out.println(result);





    }
}
