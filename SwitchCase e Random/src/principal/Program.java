package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gerador = new Random();
		
		Scanner entrada = new Scanner(System.in);

		int opcao = gerador.nextInt(7) + 1;

		//System.out.println("Digite um número da semana: ");
		//opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.err.println("Dígito Inválido!");
			break;
		}

		entrada.close();
	}

}
