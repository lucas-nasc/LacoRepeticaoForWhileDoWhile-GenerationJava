package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int back=0,front=0,hmobile=0,mfullstack=0;
		int idade,categoria,sexo;
		String escolha;
		String continuar = "S"; 
		
		Scanner leia = new Scanner(System.in);
		
		while(!continuar.equalsIgnoreCase("N")) {
			
			System.out.println("digite sua idade ");
			idade = leia.nextInt();
			System.out.println("Digite o Sexo"
					+ "1 – Masculino\r\n"
					+ "2 – Feminino\r\n"
					+ "3 – Outros\r\n"
					+ "");
			sexo = leia.nextInt();
			System.out.println("Categoria:\r\n"
					+ "1 – Backend\r\n"
					+ "2 – Frontend\r\n"
					+ "3 – Mobile\r\n"
					+ "4 – FullStack\r\n"
					+ "");
			categoria = leia.nextInt();
			
			if(categoria == 1) {
				back++;
				
			}else if(sexo == 2 && categoria ==2) {
				front++;
			}else if(sexo == 1 && categoria ==3 && idade >40 ) {
				hmobile++;
				
			}else if(sexo == 2 && categoria == 4 && idade < 30) {
				mfullstack++;
			}
			System.out.println("Deseja continuar a leitura dos dados de um novo colaboradore ou não (S/N)");
			continuar = leia.next();
			
		
			
	
			
		}
		System.out.println("O número de pessoas desenvolvedoras Backend é " + back);
		System.out.println("O número de pessoas desenvolvedoras Front-End é " + front);
		System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos é " + hmobile);
		System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos é " + mfullstack );
		

	}

}
