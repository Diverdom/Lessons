package taskM18;
/*Задание 18
Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.
Задание 19*/

public class TaskM18 {

    public static void main(String[] args) {

        String string = "Для работы с датой и временем обычно используется класс GregorianCalendar. В простейшем случае при создании объекта данного класса указывается конструктор без параметров. Также можно использовать конструктор с двумя параметрами – объектами типа TimeZone “часовой пояс” и Locale – локаль. Конструктор может также содержать текущее время и дату. Для этого можно использовать конструктор с тремя параметрами в виде целых чисел: год, месяц, число. К этим параметрам могут быть добавлены два числа: часы и минуты, или три числа: часы минуты и секунды.";
        int counter = 0;
        char symbol;

        for(int i=0; i< string.length();i++){
            symbol = string.charAt(i);

            if (symbol ==',' || symbol == '.' || symbol == '!' || symbol == '?' || symbol == ';' || symbol == ':'
                    || symbol== '-'|| symbol == '"'|| symbol == '(' || symbol == ')' ){
            counter++;
            }
        }
        System.out.println("Given string contains " + counter + " punctuation marks.");

    }
    }
