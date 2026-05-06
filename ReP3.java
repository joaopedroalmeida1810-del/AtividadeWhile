package Rep;

import java.util.Random;
import java.util.Scanner;

public class ReP3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random ran = new Random();

		int dragao;
		int direcao;
		int pontos = 0;

		System.out.println("Você está na caverna");

		dragao = ran.nextInt(3) + 1;

		System.out.println("Escolha uma direção: esquerda(1) frente(2) direita(3)");
		direcao = ler.nextInt();
		while (direcao != dragao) {
			pontos++;
			System.out.println("Você encontrou um tesouro! Pontos: " + pontos);

			System.out.println("Escolha outra direção: esquerda(1) frente(2) direita(3)");
			direcao = ler.nextInt();

			dragao = ran.nextInt(3) + 1;
		}

		System.out.println("Você encontrou o dragão");
		System.out.println("VOCE PERDEUUUU KKKKKKK");
		System.out.println("Pontos finais: " + pontos);

		ler.close();
	}
}
