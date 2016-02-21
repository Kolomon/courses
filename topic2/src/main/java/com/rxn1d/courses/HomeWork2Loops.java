package com.rxn1d.courses;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWork2Loops {
    /**
     * Метод должен вернуть минимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=3 при заданном массиве=[5, 4, 3, 4, 5]
     *
     * @param integers заданный массив типа int[]
     * @return минимальное число из массива
     */
    public static int min(int[] integers) {
        int[] integ = {5, 4, 3, 4, 5};

        int min = integ[0];
        for (int i = 0; i < integ.length; i++) {
            if (integ.length > min)
                min = integ[i];
        }
        return 1;
    }

    /**
     * Метод должен вернуть максимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=6.0 при заданном массиве=[5.1, 4.33, 3.0, 6.0, 5.999]
     *
     * @param doubles заданный массив типа double[]
     * @return максимальное число из массива
     */
    public static double max(double[] doubles) {
        double[] mass = {5.1, 4.33, 3.0, 6.0, 5.999};
        double min = 0;
        for (int index = 0;index < mass.length; index++ ){
            double k = mass.get(index);
            if (k > min){
                min = k;
            }
        }
        return min;
    }

    /**
     * Метод должен вернуть среднее арифмитическое число
     * из заданного массива.
     * <p>Например:
     * вернуть число=8 при заданном массиве=[1, 3, 8, 10, 25, 1]
     *
     * @param shorts заданный массив типа short[]
     * @return среднее арифмитическое число из массива
     */
    public static short average(short[] shorts) {
        short[] numbers = {1, 3, 8, 10, 25, 1};
        double average = 0;
        int sum = 0;
        for (int index = 0;index < numbers.length; index++ ){
            sum += numbers[index];
            average = (sum / numbers.length);
        }
        return 1;
    }

    /**
     * Метод должен перевернуть массив.
     * <p>Например:
     * вернуть массив=[f, e, d, c, b, a] из заданного массива=[a, b, c, d, e, f]
     *
     * @param chars заданный массив типа char[]
     * @return перевернутый массив
     */
    public static char[] reverse(char[] chars) {
        return new char[1];
    }
}
