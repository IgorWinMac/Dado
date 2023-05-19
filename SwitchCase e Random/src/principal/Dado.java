package principal;

import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random gerador = new Random();

		int dado1, dado2, dado3, soma;
		int total = 0;
		int bonus2 = 2;
		int bonus6 = 6;

		dado1 = gerador.nextInt(6) + 1;
		dado2 = gerador.nextInt(6) + 1;
		dado3 = gerador.nextInt(6) + 1;

		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		System.out.println("Dado 3: " + dado3);

		soma = dado1 + dado2 + dado3;

		System.out.println("A soma dos valores é " + soma);

		if (dado1 == dado2 && dado1 == dado3 && dado2 == dado3) {
			System.out.println("Você é muito sortudo!");
			System.out.println("Pontos de bônus: " + bonus6);
			total = soma + bonus6;
			System.out.println("Soma total: "+total);
		} else if (dado1 == dado2 || dado1 == dado3 || dado3 == dado2) {
			System.out.println("Pontos de bônus: " + bonus2);
			total = soma + bonus2;
			System.out.println("Soma total: "+total);
		}
		
		if(total < 15) {
			System.out.println("Lamento, mas você perdeu!");
		}else{
			System.out.println("Parabéns, você ganhou!");
		}
		
	}

}
