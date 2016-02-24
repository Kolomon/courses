package com.rxn1d.courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWork2String {
    /**
     * Метод должен вернуть количество четных чисел в строке.
     * <p>Например:
     * дана строка - 1_4_8_11_22, ответ - 3
     *
     * @param s строка типа число1_число2_число3_число4
     * @return количество четных числе в строке
     */
    public static int countEvenInString(String s) {
        String[] result = s.split("_");
        int even = 0;
        for (int j = 0; j < result.length; j++) {
            if ((Integer.parseInt(result[j]) % 2 == 0)) even++;
        }
       return even;
    }

    /**
     * Метод должен удалить указанный символ из строки (кроме случая, если
     * символ находится на первой, последней или срединной позиции)
     * <p>Например:
     * данна строка - xabxxxx, символ - x, ответ - xabx
     *
     * @param symbol символ который необходимо удалить
     * @param s      исходная строка
     *
     * @return результирующая строка
     */
    public static String removeSymbolFromString(String symbol, String s) {
        String[] s1 = s.split("");
        String done = "";

        for (int i = 0; i < s.length(); i++){
            if ( s1[i] != symbol) done += s1[i];
            if ( s1[0] == symbol) done += s1[0];
            if ( s1[s.length() - 1] == symbol) done += s1[s.length() - 1];
            if ((s.length()/2)!=0 && ( s1[s.length() / 2 + 1 ] == symbol)) done += s1[s.length() / 2 + 1];
        }
        return done ;
    }
}

