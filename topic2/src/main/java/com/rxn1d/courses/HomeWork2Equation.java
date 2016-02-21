package com.rxn1d.courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    public static void main(String[] args) throws IOException {
        System.out.println("Введите пожалуйста коэфициенты a, b, c. (b не равно 0)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);

        double x1;
        double x2;
        double D = ((b*b) - (4*a*c));

        if (D>0){
            x1 = ((-b) + Math.sqrt(D))/(2*a);
            x2 = ((-b) - Math.sqrt(D))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        }
        else if (D==0){
            x1 = ((-b)/(2*a));
            System.out.println("Решение имеет два двукратных корня = " + x1);
        }
        else if ((D<0)||(b==0)){
            System.out.println("Уравнение не имеет решения.");
        }

    }

    public static int solveEquation(int a, int b, int c) {
      return 0;
    }
}
