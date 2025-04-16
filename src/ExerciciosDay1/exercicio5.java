package ExerciciosDay1;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        /* Lista de compras com ArrayList (nível médio)
Tópicos envolvidos: ArrayList, laços, Scanner, condicionais
Crie um programa que permita:
Adicionar itens à lista de compras
Remover itens
Mostrar todos os itens
Use um menu com switch para as opções:
         */
        Scanner sc = new Scanner(System.in);

        // Perguntando ao usuário qual produto quer
        System.out.println("Qual produto deseja adicionar à lista: ");
        String item = sc.nextLine();

        ArrayList<String> lista = new ArrayList<String>();
        // Menu com o switch como se fosse um while em Python
        System.out.println("1 - Adicionar / 2 - Remover / 3 - Mostrar / 4 - Sair");
        int resposta = sc.nextInt();
        boolean executando = true;
        while (executando){
            switch(resposta){
                case 1:
                    System.out.println("Digite o nome do produto que deseja adicionar à lista:");
                    lista.add(item);
                    break;
                case 2:
                    lista.remove(item);
                    break;
                case 3:
                    lista.get(1);
                    break;
                case 4:
                    executando = false;
                    break;
        }
    }
    }
}
