package com.sergiovega.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = r.nextInt(100);
                matriz2[i][j] = r.nextInt(100);
            }
        }
        System.out.println("Matriz 1:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%4d", matriz1[i][j]);
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Matriz 2:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%4d", matriz2[i][j]);
            }
            System.out.println();
        }

        System.out.println("     \n" +
                "¿Qué deseas hacer con ellas? \n" +
                "1 - La suma de las 2 matrices \n" +
                "2 - El producto de la primera por un escalar \n" +
                "3 - El producto de las 2 matrices \n" +
                "4 - La transpuesta de la segunda matriz \n" +
                "5 - Salir \n" +
                "Opción: ");
        char x = br.readLine().charAt(0);

        switch (x) {
            case '1':
                System.out.println("La matriz suma es: ");
                visualizar(sumaDeMatrices(matriz1, matriz2)));
                break;
            case '2':
                System.out.println("El pruducto  es: ");
                visualizar(productoescalar(matriz1,matriz2));
                break;
            case '3':
                System.out.println();
                visualizar(producto2matrices(matriz1,matriz2));
                break;
            case '4':
                System.out.println();
                visualizar(trasnpuesta2(matriz1,matriz2));
                break;
            default:
                System.out.println("Opción elegida incorrecta");
                break;
        }
    }

    private static void visualizar(int[][] matriz) {

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%4d", matriz [i][j]);
            }System.out.println();
        }
    }


    public static  int[][] sumaDeMatrices (int[][] matriz1, int[][] matriz2){
        int[][] matriz3 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matriz3;
    }
    public static int productoescalar (int matriz1, int matriz2) {
        int[][] matriz3 = new int[4][4];
        return matriz3;
    }
    public static int producto2matrices (int matriz1, int matriz2) {
        int[][] matriz3 = new int[4][4];
        return matriz3;
    }
    public static int trasnpuesta2 (int matriz1, int matriz2) {
        int[][] matriz3 = new int[4][4];
        return matriz3;
    }

}
