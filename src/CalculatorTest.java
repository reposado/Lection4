public class CalculatorTest {

    public static void main(String[] args) {

        ReadClass readClass = new ReadClass();
        int one;
        int two;

        System.out.print("Введите число: ");
        one = readClass.readNextDouble();
        System.out.print("Введите второе число: ");
        two = readClass.readNextDouble();

        Calculator calculator = new Calculator(one, two);

        System.out.println("Выберете действие: ");
        System.out.println("1. Сложить");
        System.out.println("2. Вычесть");
        System.out.println("3. Умножить");
        System.out.println("4. Разделить");
        System.out.println("0. Выход");
        System.out.println("Введите номер пункта: ");

        int action = (int) readClass.readNextDouble();

        switch (action) {
            case 1: System.out.println(calculator.add(one, two)); break;
            case 2: System.out.println(calculator.subs(one, two)); break;
            case 3: System.out.println(calculator.multi(one, two)); break;
            case 4:
                if (calculator.b == 0) {
                    System.err.println("E");
                }
                else {System.out.println(calculator.div(one, two));
                }
                break;
            case 0: break;
            default: System.out.println("Error");
        }


    }
}