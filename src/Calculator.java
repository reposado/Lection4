public class Calculator {

    public int a;
    public int b;
    //public char res;

    public Calculator() {
        this.a = 0;
        this.b = 0;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static int add(int a, int b) {
        return a + b;

    }
    public static int subs(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;


    }




}