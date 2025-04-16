package ExerciciosDay1;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        /*
        Classificação de idade (nível fácil)
Tópicos envolvidos: Scanner, condicionais, tipos primitivos
Peça a idade de uma pessoa e informe a categoria:
0 a 12: Criança
13 a 17: Adolescente
18 a 59: Adulto
60+: Idoso
Utilize if, else if, e else.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade <= 12){
            System.out.println("Você é uma criança");
        }
        else if( 13 <= idade && idade <= 17){
            System.out.println("Você é um adolescente");
        }
        else if( 18 <= idade && idade <= 59){
            System.out.println("Você é um adulto");
        }
        else{
            System.out.println("Você é um idoso");
        }
        sc.close();
    }
}
