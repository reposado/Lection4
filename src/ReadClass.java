import java.util.Scanner;

public class ReadClass {

    public int readNextDouble() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        if (sc.hasNextDouble()) {
            i = (int) sc.nextDouble();
        }
        else {
            System.out.println("Вы ввели не целое число");
        }
        return i;
    }
}