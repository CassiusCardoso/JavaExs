package ExercicioDay2;

import java.util.Scanner;

public class tests2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();

        sc.close();

        System.out.println(verificaNumeroPrimo(numero1));
    }
    // Função que calcula se o número é primo ou não
    public static String verificaNumeroPrimo(int a) {
        if(a <= 1) {
            return "Não é primo";
        }
        for (int i = 2; i <a; i++){
            if(a % i == 0){
                return "Não é primo";
            }
        }
        return "Primo";
    }
}
