import java.util.Objects;
import java.util.Scanner;

//Здравствуйте!
public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println(" "); //Отделяю для лучшей читаемости текста
        System.out.println("Чтобы произвести вычисления, введите" +
                " два целых арабских или римских числа от 1 до 10 с арифметической операцией между ними.");
        System.out.println("Калькулятор принимает операции сложения, вычитания, умножения и деления нацело.");
        System.out.println("Введите STOP, чтобы прекратить вычисления.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String input = userInput.replaceAll(" ", ""); //Возможность вводить строку с пробелами и без них

        while (!Objects.equals(input, "STOP")){                                              /*        Блок        */
            System.out.println(calc(input));                                                    /*    для упрощения   */
            userInput = scanner.nextLine();                                                     /*       тестов       */
            input = userInput.replaceAll(" ", "");
        }
    }
    public static String calc(String input) throws Exception {
        String[] numbers = input.split("\\W");  //Получили операнды
        String[] operator = input.split("\\w"); //Получили отдельно операцию
        String[] arabic  = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        //Создали массив и заполнили приемлемыми входными данными для арабских чисел
        String[] roman  = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        //Создали массив и заполнили приемлемыми входными данными для римских чисел

        switch (numbers.length) {
            case 1 -> throw new Exception("Единственное число не является математической операцией. Повторите ввод.");
            case 2 -> {
                for (int i = 0; i < 10; i++) {                                           /* Проверка на совместимость */
                    if (Objects.equals(numbers[0], arabic[i])) {                         /*    систем счисления и     */
                        for (int j = 0; j < 10; j++) {                                   /* удовлетворения диапазону  */
                            if (Objects.equals(numbers[1], arabic[j])) {
                                return Calc.calculation(numbers, operator);
                            } else if (Objects.equals(numbers[1], roman[j])) {
                                throw new Exception("Используются одновременно разные системы счисления." +
                                        " Повторите ввод.");
                            }
                        }
                    } else if (Objects.equals(numbers[0], roman[i])) {
                        for (int j = 0; j < 10; j++) {
                            if (Objects.equals(numbers[1], roman[j])) {
                                //String result = Calc.calculation(ToArabic.toArabic(numbers), operator);
                                return ("Результат = " + (ToRoman.toRoman(numbers, operator)));
                            } else if (Objects.equals(numbers[1], arabic[j])) {
                                throw new Exception("Используются одновременно разные системы счисления." +
                                        " Повторите ввод.");
                            }
                        }
                    }
                }
            }
            default -> throw new Exception("Формат математической операции " +
                    "не удовлетворяет требованию: два операнда и один оператор. Повторите ввод.");
        }
        return("Калькулятор принимает арабские и римские числа от 1 до 10. Повторите ввод.");
    }
}