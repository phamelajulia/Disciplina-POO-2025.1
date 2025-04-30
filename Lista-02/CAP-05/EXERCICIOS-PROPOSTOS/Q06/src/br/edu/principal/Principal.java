package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalVista = 0.0;
        double totalPrazo = 0.0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Digite o código da transação " + i + " (V para à vista, P para a prazo): ");
            String codigo = sc.next().toUpperCase();

            System.out.println("Digite o valor da transação " + i + ": ");
            double valor = sc.nextDouble();

            if (codigo.equals("V")) {
                totalVista += valor;
            } else if (codigo.equals("P")) {
                totalPrazo += valor;
            } else {
                System.out.println("Código inválido. Ignorando transação.");
                i--; 
            }
        }

        double totalCompras = totalVista + totalPrazo;
        double primeiraPrestacao = totalPrazo / 3.0;

        System.out.println("\nResumo das transações:");
        System.out.println("Total de compras à vista:"+ totalVista);
        System.out.println("Total de compras a prazo:"+ totalPrazo);
        System.out.println("Total geral das compras:"+ totalCompras);
        System.out.println("Valor da primeira prestação das compras a prazo:"+ primeiraPrestacao);

        sc.close();
    }
}