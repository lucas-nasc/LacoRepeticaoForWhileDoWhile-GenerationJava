package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int n1,par=0,impar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o numero desejado ");
			n1 =leia.nextInt();
			if(n1%2 ==0){
				par++;
			}else {
				impar++;
			}
			
		}
	
		System.out.println("Total de numeros pares: " + par);
		System.out.println("Total de numeros pares: " + impar);

	}

}
