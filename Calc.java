import java.lang.constant.Constable;

class Calc{
    public static String calculation(String[] numbers, String[] operator) throws Exception {
        String opr = operator[operator.length - 1];
        return  ("" + operation(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]), opr));
    }

    static Constable operation(int num1, int num2, String op) throws Exception {
        return switch (op){                                             /*      Проверка операции      */
            case "*" -> "Результат = " + (num1 * num2);                 /*  и её выполнение, в случае  */
            case "+" -> "Результат = " + (num1 + num2);                 /* удовлетворительной операции */
            case "-" -> "Результат = " + (num1 - num2);
            case "/" -> "Результат = " + (num1 / num2);
            default -> throw new Exception("Калькулятор принимает операции " +
                    "сложения, вычитания, деления и умножения. Повторите ввод.");
        };
    }
}
