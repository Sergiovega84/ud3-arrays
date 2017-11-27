package com.sergiovega.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("introducir texto: ");
        String texto = br.readLine();
        String letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int [] recuento = contarletras (texto,letra);
        visualizarRecuento(recuento, letra);

    }
    private static void visualizarRecuento (int [] recuento, String letra){
        System.out.print("letra");
        System.out.println();
        for (int i = 0; i < 26; i++) {
            System.out.println(letra.charAt(i)+": "+recuento[i]);
        }
    }
    private static int [] contarletras (String texto, String letra){
        int [] recuento = new int[26];
        for (int i = 0; i < 26 ; i++) {
            recuento[i]=0;
        }
        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j <letra.length() ; j++) {
                if (texto.toUpperCase().charAt(i)==letra.charAt(j)) recuento [j]++;
            }
        }
        return recuento;
    }
    }

