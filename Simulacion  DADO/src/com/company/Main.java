package com.company;

import com.company.Dado;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
        static Dado dado = new Dado();

    public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
                int opcion = 0;

                System.out.println("SIMULACION DE DADO");
                System.out.println("1. LANZAR");
                System.out.println("2. Resultados Anteriores");
                System.out.println("3. Salir");
                try {
                System.out.print("OPCION:");
                opcion = Integer.parseInt(br.readLine());

                } catch (Exception e){

                }

                switch (opcion) {

                case 1:
                         System.out.println(dado.lanzar() );
                System.out.println ();
                break;

                case 2:
                System.out.println ();
                System.out.println("Resultado Anteriores");
                dado.resultados();
                System.out.println ();
                break;

                case 3:
                System.out.println();
                System.out.println("Adios ...");
                System.exit(0);
                System.out.println ();
                break;
default:
        System.out.println ();
        System.out.println("Opcion Incorrecta intentalo nuevamente");
        System.out.println ();

        }
     }
   }
 }




