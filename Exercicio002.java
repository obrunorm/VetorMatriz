package ExercicioVetorMatriz;

import java.util.Scanner;

public class Exercicio002 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[] lancamento = new double[10];
		double soma = 0.0, maior = 0.0, media = 0.0;

		int x, maiorPontuacao = 0;
				

		for(x=0; x <= 9; x++){

			System.out.println("Digite os Lan�amentos: ");
			lancamento[x] = ler.nextInt();
										
			soma = soma + lancamento[x];
			media = soma / 10;

			if(lancamento[x] == maior){
				maiorPontuacao++;
				
			}if(maior < lancamento[x]){
				maior = lancamento[x];
			}
		}
		System.out.println("A soma dos lan�amentos �: " + soma);
		System.out.println("\nA m�dia dos lan�amentos �: " + media);
		System.out.println("\nA quantidade do maior lan�amento �: " + (maiorPontuacao+1) + " e o maior lan�amento foi: " + maior);
		
	}

}