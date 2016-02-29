package com.rxn1d.courses;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("---> START Calculator application <---");

        double numb1 = 0;
        double numb2 = 0;
        String[0] in = Double.parseDouble(ConsoleReader.readFromConsole());
        String[0] in = numb1;
        String[1] in = o;
        String[2] in = Double.parseDouble(ConsoleReader.readFromConsole());
        String[2] in = numb2;


        if (o.equals("+")) {
            System.out.println(numb1 + " + " + numb2 + " = " + add(numb1,numb2));
            return;
        }
        if (o.equals("-")) {
            System.out.println(numb1 + " + " + numb2 + " = " + sub(numb1,numb2));
            return;
        }
        if (o.equals("*")) {
            System.out.println(numb1 + " + " + numb2 + " = " + mul(numb1,numb2));
            return;
        }
        if (o.equals("/")) {
            System.out.println(numb1 + " + " + numb2 + " = " + div(numb1,numb2));
            return;
        }
    }

    public double add(double numb1, double numb2) {
        return numb1 + numb2;
    }

    public double sub(double numb1, double numb2) {
        return numb1 - numb2;
    }

    public double mul(double numb1, double numb2) {
        return numb1 * numb2;
    }

    public double div(double numb1, double numb2) {
        return numb1 / numb2;
    }

        // для того, чтобы читать данные из консоли спользуйте данную конструкцию
        String[] in = ConsoleReader.readFromConsole();
        System.out.println("---> EXIT Calculator application <---");

    }
}
