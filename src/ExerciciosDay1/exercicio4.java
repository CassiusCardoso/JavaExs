package ExerciciosDay1;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        /* Exercício 4: Estatísticas de notas (nível médio)
Tópicos envolvidos: Arrays, laços, operadores aritméticos, Scanner
Peça ao usuário quantas notas deseja cadastrar. Armazene todas em um array. Depois:
Calcule a média
Mostre a maior e a menor nota
Mostre quantas notas foram acima da média
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as notas deseja adicionar à lista:");
        int n = sc.nextInt();
        double[] notas = new double[n]; // Usar double para casas decimais

        // Não dá para fazer com o for each por que ele não consegue acessar os indíces
        // O for each não acessa valores de uma array
        // Por isso o for each é utilizado somente para ler os valores

        // Esse loop for é para criar a condição de quantas notas terão na lista
        for (int i = 0; i < n; i++) {
            System.out.println("Digite quantas notas quer adicionar a sua nota: " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }


        // Cálculo
        double soma = 0;
        // Esse tipo de atribuição é útil quando eu quero comprarar valores
        // Digamos que a array seja: {10, 15, 20, 1}
        // maior[0] começa com 10, e a cada iteração do laço, ele compara o valor com notas[i]
        // Se houver algum valor maior que 10, a variável é reatribuida com maior = notas[i]
        double maior = notas[0];
        double menor = notas[0];

        for (int i = 0; i < n; i++) {
            soma += notas[i];
            if (notas[i] > maior) maior = notas[i];
            if (notas[i] < menor) menor = notas[i];
            }

        double media = soma / n;

        // Verificar quantos valores estão acima da média
        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > media) acimaMedia++;
            }

        System.out.println("-------- Estatísticas---------------");
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média: " + media);
        System.out.println("Quantidade de notas acima da média: " + acimaMedia);

        sc.close();
    }
}

