package com.rxn1d.courses;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWork2Equation {
    /**
     * Метод должен вернуть решение квадратического уравнения.
     * <p>Например:
     * Найти решение уравнение вида 5x^2 + 2x + 11
     *
     * @param a коэфициент для x^2
     * @param b коэфициент x
     * @param c константа
     * @return решение уравнения
     */
    public static int solveEquation(int a, int b, int c) {
        a = 5;
        b = 2;
        c = 11;
        int x1 = 0, D;
        D = ((b*b) - (4*a*c));
        System.out.println("D = " + D);

        if (D > 0){
            x1 = (int) ((-b) + Math.sqrt(D))/(2*a);
        }
        else if (D == 0){
            x1 = ((-b)/(2*a));
        }
        else if ((D < 0)){
            x1 = 0;
        }
        return x1;
    }
}

