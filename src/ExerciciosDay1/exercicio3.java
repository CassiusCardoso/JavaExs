package ExerciciosDay1;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        /*
        Tabuada com for e while (nível médio)
Tópicos envolvidos: Laços for, while, Scanner
Peça um número ao usuário e mostre a tabuada dele de 1 a 10, usando um for. Depois, repita usando while.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular a tabuada: ");
        int n = sc.nextInt();
        int contadora = 1;
        while(contadora < 10){
            contadora++;
            System.out.println(n + " x " + contadora + " = " + n * contadora);
        }
        /* for (int i = 1; i < 11; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        } */
        sc.close();
    }
}
