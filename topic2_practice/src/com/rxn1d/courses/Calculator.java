package com.rxn1d.courses;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("---> START Calculator application <---");

        String[] in = ConsoleReader.readFromConsole();

        while (true) {
            if (in[0].equals("exit")) {
                break;
                if (in[1].equals("+")) {
                    System.out.println(numb1 + " + " + numb2 + " = " + add(numb1, numb2));
                    return;
                }
                if (in[1].equals("-")) {
                    System.out.println(numb1 + " + " + numb2 + " = " + sub(numb1, numb2));
                    return;
                }
                if (in[1].equals("*")) {
                    System.out.println(numb1 + " + " + numb2 + " = " + mul(numb1, numb2));
                    return;
                }
                if (in[1].equals("/")) {
                    System.out.println(numb1 + " + " + numb2 + " = " + div(numb1, numb2));
                    return;
                }
            }
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

