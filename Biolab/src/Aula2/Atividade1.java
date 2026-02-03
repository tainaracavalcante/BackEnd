package Aula2;

import java.util.Scanner;

public class Atividade1 {
    static void main() {


        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Saída de dados
        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("IMC: %.2f%n", imc);

        scanner.close();
    }
}
