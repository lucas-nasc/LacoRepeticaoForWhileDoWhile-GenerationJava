package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int idade,pessoasMenor=0,pessoasMaior=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a sua idade");
		idade = leia.nextInt();
		
		
		while(idade >=0) {
			if(idade < 21) {
			pessoasMenor++;
		}else if(idade > 50) {
			pessoasMaior++;
		}
			
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

	}
		System.out.println("Total de pessoas menores de 21 anos: " + pessoasMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + pessoasMaior);

}
}
