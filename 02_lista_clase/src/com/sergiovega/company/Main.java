package com.sergiovega.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(("¿cuantos alumnos hay en clase? "));
        int alumnos = Integer.parseInt(br.readLine());

        String[] nombre = new String[alumnos];
	    String busqueda;

    do {

        for (int i = 0; i < alumnos; i++) {
            System.out.println("Introduduzca nombre y apellido: ");
            nombre[i] = br.readLine();
        }
        System.out.print("Buscar por letra o fin para finalizar: ");
        busqueda = br.readLine();

        for (int i = 0; i < alumnos; i++) {
            if (nombre[i].charAt(0) == busqueda.charAt(0)) {
                System.out.println(nombre[i]);
            }

        }
    } while (!busqueda.equalsIgnoreCase("fin"));

    }
}
