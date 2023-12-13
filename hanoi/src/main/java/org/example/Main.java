package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de discos: ");
        int numDiscos = scanner.nextInt();

        int movimentos = TorreDeHanoi.torreDeHanoi(numDiscos, 'A', 'C', 'B');

        System.out.println("Quantidade de movimentos necessários: " + movimentos);

        scanner.close();
    }
}
