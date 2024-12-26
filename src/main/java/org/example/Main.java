package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio= new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int chute = 0;

        System.out.println("Bem vindo ao jogo do número secreto!");

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            chute = leitor.nextInt();
            tentativas++;

            if (chute == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (chute < numeroAleatorio) {
                System.out.println("O número secreto e maior!");
            } else {
                System.out.println("O número secreto e menor!.");
            }
        }

        if (tentativas == 5 && chute != numeroAleatorio) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);
        }
    }

}