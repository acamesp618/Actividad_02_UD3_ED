/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_02_ud3_ed;

/**
 * Se importa el API Scanner para que el usuario pueda ingresar
 * una nota y el programa pueda leerlo
 */

import java.util.Scanner;

/**
 * Programa que al insertar una nota entre 0 y 10 responde
 * con una calificacion
 * 
 * @author Adrian Campos
 */

public class Ejercicio20MEJORA {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /** Pedimos al usuario que inserte una nota*/
        System.out.print("Escribe tu nota: ");
        int nota = sc.nextInt();
        
        /**
         * Segun la nota que haya escrito, se califica de la
         * siguiente manera
         */
        switch (nota) {
            /** Para las notas entre 0-4 se imprime "Insuficiente"*/
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            /** Para la nota 5 se imprime "Suficiente"*/
            case 5:
                System.out.println("Suficiente");
                break;
            /** Para la nota 6 se imprime "Bien"*/
            case 6:
                System.out.println("Bien");
                break;
            /** Para las notas 7 u 8 se imprime "Notable"*/
            case 7,8:
                System.out.println("Notable");
                break;
            /** Para las notas 9 o 10 se imprime "Sobresaliente"*/
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            /** Para las notas que no esten dentro del rango imprime
             *  un error
             */
            default:
                System.out.println("ERROR: Nota no valida");
        }
        /** Es el mismo programa pero con un switch como expresion*/        
        String notafinal = switch (nota) {
            case 0,1,2,3,4 -> "Insuficiente";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7,8 -> "Notable";
            case 9,10 -> "Sobresaliente";
            default -> "ERROR_no_valido";
        };
        
        /** El resultado para el switch como expresion se debe imprimir fuera*/
        System.out.println("La nota es: " + notafinal);
        }
    }

