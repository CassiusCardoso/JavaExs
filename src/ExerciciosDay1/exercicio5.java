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

        // Criando a array lista
        ArrayList<String> lista = new ArrayList<String>();

        // Variável de condição para controlar o loop while
        boolean executando = true;

        while (executando){
            // Menu com o switch como se fosse um while em Python
            // A pergunta precisa ficar dentro do loop logo no começo, antes dos cases. Isso para perguntar mais de uma vez
            System.out.println("1 - Adicionar / 2 - Remover / 3 - Mostrar / 4 - Sair");
            int resposta = sc.nextInt();
            sc.nextLine(); // Limpar o ENTER pendente
            switch(resposta){
                case 1:
                    // Perguntando ao usuário qual produto quer
                    System.out.println("Digite o nome do produto que deseja adicionar à lista:");
                    String item = sc.nextLine();
                    lista.add(item);
                    System.out.println("Item digitado com sucesso!");
                    break;
                case 2:

                    // Lista ao usuário os itens que existem na lista
                    System.out.println("Itens disponíveis para remover: " + lista);
                    // Captura a resposta do usuário para verificar o item
                    System.out.println("Qual o item que você deseja remover: ");
                    String itemRemovido = sc.nextLine();

                    // IF para verificar se a resposta que o usuário digitou existe na lista
                    if (lista.contains(itemRemovido)){
                        lista.remove(itemRemovido);
                        System.out.println("Item removidado com sucesso!");
                    }

                    break;
                case 3: // Case que mostra todos os itens da lista

                    StringBuilder resultado = new StringBuilder();
                    resultado.append("Itens da lista: \n");

                    // ArrayList tem o método .size() para retonar o tamanho e não .length()
                    for (int i = 0; i < lista.size(); i++){
                        resultado.append("- " + lista.get(i)).append("\n");
                    }
                    System.out.println(resultado.toString());
                    break;
                case 4:
                    executando = false;
                    System.out.println("Programa finalizado com sucesso!");
                    break;
        }
    }
        sc.close();
    }
}
