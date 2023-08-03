package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int n1,soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			n1 = leia.nextInt();
			if(n1 > 0) {
				soma += n1;
			}
			
			
			
		}while(n1 != 0);
		
		System.out.println("A soma dos numeros positivos é: " + soma);
		
		
		

	}

}
