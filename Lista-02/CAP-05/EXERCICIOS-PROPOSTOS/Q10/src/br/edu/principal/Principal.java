package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaPares = 0;
        int somaPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
            }

            if (ehPrimo(numero)) {
                somaPrimos += numero;
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);
        System.out.println("Soma dos números primos: " + somaPrimos);

        sc.close();
        
    }
 }  
