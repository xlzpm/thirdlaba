//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        System.out.print("Введите ограничение: ");
        double N = input.nextDouble();
        double sum = 0;
        if (x <  1 && x >= -1){
            for (double n = 1;  n <= N; n++){
                sum += (Math.pow(-1, n) * Math.pow(x, n + 1)) / (n + 1);
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Не верно задано число");
        }
    }
}