package com.rxn1d.courses;

import java.io.BufferedReader;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("---> START Calculator application <---");


        String[] in = ConsoleReader.readFromConsole();


        while (true) {
            if (in[0].equals("exit")){
                break;
            }
                if (in[1].equals("+")) {
                   in[0] + in[2] = in[4];
                }
                if (in[1].equals("-")) {
                    in[0]-in[2] = in[4];
                }
                if (in[1].equals("*")) {
                    in[0]*in[2] = in[4];
                }
                if (in[1].equals("/")) {
                    in[0] / in[2] = in[4];  // еще думаю. Нужно еще понять что к чему присваивать и как сделать действие со вторым числом.
                }
            }
        }

        // для того, чтобы читать данные из консоли спользуйте данную конструкцию
        String[] in = ConsoleReader.readFromConsole();
        System.out.println("---> EXIT Calculator application <---");

    }