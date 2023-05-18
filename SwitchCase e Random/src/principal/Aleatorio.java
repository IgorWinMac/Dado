package principal;

import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gerador = new Random();
				
		int num = gerador.nextInt(9) + 1;
		
		System.out.println("O número sorteado foi: "+num);
	
	}

}
