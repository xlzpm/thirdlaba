import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Random rd = new Random();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = rd.nextInt(50);
            }
        }
        sortMainDiagonal(array);
        printArray(array);
    }

    public static void sortMainDiagonal(int[][] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j][j] < array[j-1][j-1]) {
                // меняем элементы на диагонали, пока текущий не станет больше предыдущего
                int temp = array[j][j];
                array[j][j] = array[j-1][j-1];
                array[j-1][j-1] = temp;
                j--;
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

