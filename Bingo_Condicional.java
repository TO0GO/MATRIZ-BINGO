package com.yepez;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bingo_Condicional {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

    String [][] bingo;
    bingo=new String[5][5];

    Set<Integer> usados=new HashSet<>();//coleccion
    
    for(int i=0;i<bingo.length;i++){
        for(int j=0;j<bingo[i].length;j++){
            int aux;
            do{
                aux=(int)(Math.random()*100)+1;
            }while(usados.contains(aux));
           
            usados.add(aux);
            bingo[i][j]=String.valueOf(aux);
            
        }
    } 
    
    for(int i=0;i<bingo.length;i++){
        for(int j=0;j<bingo[i].length;j++){
            System.out.print(bingo[i][j]+"\t");
        }
        System.out.println();
    }

    while(true){
        System.out.print("Ingrese la fila: ");
        int fila=sc.nextInt();
        System.out.print("Ingrese la columna: ");
        int  columna=sc.nextInt();

        bingo[fila][columna]="X";

        for(int i=0;i<bingo.length;i++){
        for(int j=0;j<bingo[i].length;j++){
            System.out.print(bingo[i][j]+"\t");
        }
        System.out.println();
    }


    }

    }
    
}
