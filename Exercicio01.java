package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero (menor): ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo numero(maior): ");
		num2 = leia.nextInt();
		if(num1 >num2) {
			System.out.println("Intervalo invalido.");
			System.exit(0);
	}
		System.out.println("No intervalo entre " + num1 + " e " + num2 );
		for(int i = num1; i <= num2; i++) {
			if(i%3 == 0 && i % 5==0) {
				System.out.println(i + " é mutilplo de 3 e 5");
			}
		}
  }

}
