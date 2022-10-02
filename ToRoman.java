class ToRoman {
    public static String toRoman(String[] numbers, String[] operator) throws Exception {
        String l = Calc.calculation(ToArabic.toArabic(numbers), operator);
        String[] result_first = l.split("\\s");
        int s = result_first.length;
        int result = Integer.parseInt(result_first[s-1]);
        StringBuilder res = new StringBuilder();

        //Последовательно отнимаем от результата числа, пока не дойдём до нуля
        if (result > 0) {
            while (result >= 100) {
                res.append("C");
                result -= 100;
            }
            while (result >= 90) {
                res.append("XC");
                result -= 90;
            }
            while (result >= 50) {
                res.append("L");
                result -= 50;
            }
            while (result >= 40) {
                res.append("XL");
                result -= 40;
            }
            while (result >= 10) {
                res.append("X");
                result -= 10;
            }
            while (result >= 9) {
                res.append("IX");
                result -= 9;
            }
            while (result >= 5) {
                res.append("V");
                result -= 5;
            }
            while (result >= 4) {
                res.append("IV");
                result -= 4;
            }
            while (result >= 1) {
                res.append("I");
                result -= 1;
            }
        }
        else throw new Exception("В римской системе нет отрицательных чисел и нуля. Повторите ввод.");
        return res.toString();
    }
}
