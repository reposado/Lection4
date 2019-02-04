import java.io.Console;
import java.util.Scanner;
import java.awt.*;
import java.util.ArrayList;

public class romanNumber {
    /*Массив Входных чисел, */
    static int[]A = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    static String[]R = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};


    public static String Roman(int N) {
        String result = "";
        int i;
        i = 12;
        while (N > 0) {
            while (A[i] > N)
                i--;
            result += R[i];
            N -= A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String romanNumber = Roman(number);
        System.out.println("В римском исчилении: " + romanNumber);
    }

}
