package com.rxn1d.courses;

import java.io.BufferedReader;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {


    public static void main(String[] args) {

        System.out.println("---> START Calculator application <---");
        String[] in = ConsoleReader.readFromConsole();

        double numb1 = 0;
        double numb2 = 0;
        double result = 0;
        String symbol = "";

        numb1 = Double.parseDouble(in[0]);
        numb2 = Double.parseDouble(in[2]);

        result = calc1(numb1, numb2, in[1]);
        System.out.println("Result = " + result);
        while (true){
            in = ConsoleReader.readFromConsole();
            if(in[0].equals("exit")){
                System.out.println("---> EXIT Calculator application <---");
                break;
            }
            numb2 = Double.parseDouble(in[1]);
            result = calc1(result, numb2, in[0]);
            System.out.println(result);
            break;
        }
    }

    public static double calc1(double n1, double n2, String symbol) {
        if (symbol.equals("+")) {
            return n1 + n2;
        }
        if (symbol.equals("-")) {
            return n1 - n2;
        }
        if (symbol.equals("*")) {
            return n1 * n2;
        }
        if (symbol.equals("/")) {
            return n1 / n2;
        }
        else {
            System.out.println("---");
            return 0;
        }
    }
}