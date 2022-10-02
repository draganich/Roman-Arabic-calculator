class ToArabic {
    public static String[] toArabic(String[] numbers) {

        //Топорный метод для перевода из римских чисел в арабские
        int numI = 0, numII = 0;

        switch(numbers[0]){
            case "X" -> numI = 10;
            case "IX" -> numI = 9;
            case "VIII" -> numI = 8;
            case "VII" -> numI = 7;
            case "VI" -> numI = 6;
            case "V" -> numI = 5;
            case "IV" -> numI = 4;
            case "III" -> numI = 3;
            case "II" -> numI = 2;
            case "I" -> numI = 1;
        }
        switch(numbers[1]){
            case "X" -> numII = 10;
            case "IX" -> numII = 9;
            case "VIII" -> numII = 8;
            case "VII" -> numII = 7;
            case "VI" -> numII = 6;
            case "V" -> numII = 5;
            case "IV" -> numII = 4;
            case "III" -> numII = 3;
            case "II" -> numII = 2;
            case "I" -> numII = 1;
        }

        numbers[0] = String.valueOf(numI);
        numbers[1] = String.valueOf(numII);

        return(numbers);
    }
}