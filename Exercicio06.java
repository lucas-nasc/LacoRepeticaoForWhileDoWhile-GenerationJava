package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		int n1,media=0;
		float soma=0,res;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero");
			n1 = leia.nextInt();
			
			if(n1 %3 ==0 && n1 != 0) {
				soma += n1;
				media++;
		
			}
		}while(n1 !=0);
		res = soma/media;
		
		System.out.println("A media de todos os numeros multiplos de 3 é: " + res );
	}

}
