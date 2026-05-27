package com.yepez;

import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String[][] bingo = new String[5][5];

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                int numero = rd.nextInt(100) + 1;
                bingo[i][j] = String.valueOf(numero);
            }
        }

        
        System.out.println("Números de Bingo:");
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                System.out.print(bingo[i][j] + "\t");
            }
            System.out.println();
        }

       
        System.out.print("\nIngresa un número que salió: ");
        String entrada = sc.nextLine();

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                if (bingo[i][j].equals(entrada)) {
                    bingo[i][j] = "X";
                }
            }
        }

        
        System.out.println("\nCartón actualizado:");
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                System.out.print(bingo[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}


