package ExercicioDay2;

import java.util.Scanner;

public class tests3 {
    public static void main(String[] args){

     try{
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();


        sc.close();
     } catch (Exception e){
         System.out.println("Erro número inválido: " + e);
     }

    }
}
