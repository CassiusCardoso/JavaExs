package ExerciciosDay1;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        /*
        Tópicos envolvidos: Scanner, tipos primitivos, operadores aritméticos, if/else
        Faça um programa que peça dois números ao usuário
        E uma operação (+, -, *, /).
        Mostre o resultado da operação escolhida.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o número 2: ");
        int n2 = sc.nextInt();

        sc.nextLine();
        System.out.println("Escolha um operador aritmético: + | - | * | /");
        String operador = sc.nextLine();

        if (operador.equals("+")){
            int resultado = n1 + n2;
            System.out.println("O resultado de n1 + n2 = " + resultado);

        }
        else if (operador.equals("-")){
            int resultado = n1 - n2;
            System.out.println("O resultado de n1 - n2 = " + resultado);
        }
        else if (operador.equals("*")){
            int resultado = n1 * n2;
            System.out.println("O resultado de n1 * n2 = " + resultado);
        }
        else if (operador.equals("/")){
            int resultado = n1 / n2;
            System.out.println("O resultado de n1 / n2 = " + resultado);
        }
        sc.close();
    }
}
