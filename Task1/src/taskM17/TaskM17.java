package taskM17;
/*Задание 17
Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
*/

public class TaskM17 {
    public static void main(String[] args) {
        int[][] array = new int[19][19];
        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= i && j < array[i].length - i) {
                    array[i][j] = 1;
                }
            }
        }

        for (int i = array.length - 1; i >= args.length / 2; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= array[i].length - 1 - i && j <= i){
                    array[i][j] = 1;
                }
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
