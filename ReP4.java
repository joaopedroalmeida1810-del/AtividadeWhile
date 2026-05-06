package Rep;

import java.util.Scanner;

public class ReP4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int quantidade = 0;
		double soma = 0;
		int continuar = 1;

		while (continuar == 1) {
		int acertos = 0;
		int i = 1;
		quantidade++;

		System.out.println("Aluno " + quantidade);

		while (i <= 10) {
		System.out.print("Resposta questao " + i + ": ");
		String resp = ler.next();
		if (i == 1 && resp.equals("A")) acertos++;
		if (i == 2 && resp.equals("B")) acertos++;
		if (i == 3 && resp.equals("C")) acertos++;
		if (i == 4 && resp.equals("D")) acertos++;
		if (i == 5 && resp.equals("E")) acertos++;
		if (i == 6 && resp.equals("E")) acertos++;
		if (i == 7 && resp.equals("D")) acertos++;
		if (i == 8 && resp.equals("C")) acertos++;
		if (i == 9 && resp.equals("B")) acertos++;
		if (i == 10 && resp.equals("A")) acertos++;
		i++;
		}

		soma += acertos;
		System.out.println("Acertos: " + acertos);
		System.out.print("Outro aluno? (1-Sim / 0-Nao): ");
		continuar = ler.nextInt();
		}
		double media = soma / quantidade;
		System.out.println("Total Alunos: " + quantidade);
		System.out.println("Media Turma: " + media);

		ler.close();
		}
		}
