package exercicio2;
import java.math.BigInteger;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Calculadora objeto = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		String parada = new String() ;
		BigInteger num;
		System.out.println("Calculadora");
		while(!(parada.equalsIgnoreCase("n"))){
			System.out.println("1-Soma");
			System.out.println("2-Subtração");
			System.out.println("3-Multiplicação");
			System.out.println("4-Divisão");
			System.out.println("5-Potência");
			System.out.print("opção: ");
			int opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite um número: ");
			    num = teclado.nextBigInteger();
				objeto.soma(num);
				break;
			case 2:
				System.out.println("Digite um número: ");
			    num = teclado.nextBigInteger();
				objeto.subtracao(num);
				break;
			case 3:
				System.out.println("Digite um número: ");
			    num = teclado.nextBigInteger();
				objeto.multiplicacao(num);
				break;
			case 4:
				BigInteger teste = BigInteger.ZERO;
				System.out.println("Digite um número: ");
			    num = teclado.nextBigInteger();
			    if(num.equals(teste)){
			    	System.out.println("Impossível divisão por 0");
			    	System.out.println("Digite novamente: ");
				    num = teclado.nextBigInteger();
			    }
				objeto.divisao(num);
				break;
			case 5:
				System.out.println("Digite o valor da base: ");
			    num = teclado.nextBigInteger();
			    System.out.println("Digite o valor do expoente: ");
				int exp = teclado.nextInt();
				objeto.potencia(num,exp);
				break;
			default:
				break;
			}
			System.out.println(objeto);
			
			System.out.println("Continuar? S ou N: ");
			parada = teclado.next();
			if((!parada.equalsIgnoreCase("S"))||(!parada.equalsIgnoreCase("N"))){
				System.out.println("Digite S ou N: ");
				parada = teclado.next();
			}
		}
	}	
}
		