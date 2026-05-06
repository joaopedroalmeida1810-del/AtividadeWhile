package Rep;

import java.util.Scanner;
import java.util.Random;

public class ReP2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();

		int sorte = 0, numero, tentativa = 0;

		System.out.println("Digite um numero de 1 a 100: ");
		
		numero = aleatorio.nextInt(100);

		while (sorte != numero) {
			System.out.println("Escolha um número: ");
			sorte = ler.nextInt();
			tentativa++;

		}
		if (sorte > numero) {
			System.out.println("O numero é menor do que adicinou: " + sorte);
		} else if  (sorte < numero) {
			System.out.println("O numero é maior do que adicionou: " + sorte);
			
		}
		else {
			System.out.println("AEEEEEEEEE VOCÊ ACERTOU!!!!!!!!");
	
			System.out.println("total de tentativas " + tentativa);
			ler.close();
			
		}
	}
}