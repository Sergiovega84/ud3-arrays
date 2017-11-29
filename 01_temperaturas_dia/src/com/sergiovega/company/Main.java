package com.sergiovega.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE, total = 0;
        double [] temperatura = new double[24];

        System.out.print("Introduzca temperatura de cada hora: ");

        for (int i = 0; i < 24; i++) {
            System.out.print("hora ",i);
            temperatura[i] = Double.parseDouble(br.readLine());
            total += temperatura [i];
            if (temperatura [i] < min) min = temperatura [i];
            if (temperatura [i] > max) max = temperatura [i];
        }
        System.out.println("Tabla");
        for (int i = 0; i < 24; i++) {
            System.out.format("%02d ",i);
            for (int j = 0; j < temperatura [i]; j++) {
                System.out.println("*");
            }
            System.out.println(" " + temperatura [i]);
            if (temperatura [i] ==max) {
                System.out.println(" --> MAX");
            }else if (temperatura [i] == min) {
                System.out.println(" --> MIN");
            }else System.out.println(" ");
        }
        System.out.println("Media: %d", total / 24);
    }
}
