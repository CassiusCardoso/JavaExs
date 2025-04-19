package ExercicioDay2;

import java.util.Scanner;

public class tests {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o n1: ");
        double n1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o n2: ");
        double n2 = sc.nextDouble();
        sc.nextLine();

        System.out.println(soma(n1, n2));
    }

        public static double soma(double n1, double n2){
        return n1 + n2;
    // Criar um método que soma dois números

    }
}
