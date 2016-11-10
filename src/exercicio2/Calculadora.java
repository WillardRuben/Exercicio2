package exercicio2;
import java.math.*;



public class Calculadora {
	
	private BigInteger ValorCorrente;
	
	public Calculadora(){
		this.ValorCorrente = BigInteger.ZERO; 
	}
	public void soma(BigInteger valor){
		this.ValorCorrente = this.ValorCorrente.add(valor); 
	}
	public void subtracao(BigInteger valor){ 
		this.ValorCorrente = this.ValorCorrente.subtract(valor);
	}
	public void multiplicacao(BigInteger valor){
		this.ValorCorrente = this.ValorCorrente.multiply(valor);
	}
	public void divisao(BigInteger valor){
		this.ValorCorrente = this.ValorCorrente.divide(valor);
	}
	public void potencia(BigInteger base, int valor){
		this.ValorCorrente = base;
		this.ValorCorrente = this.ValorCorrente.pow(valor);
	}

	@Override
	public String toString(){
		return "Valor corrente: " + this.ValorCorrente;
	}
	@Override
	public boolean equals(Object object){
		return this.ValorCorrente.equals(object);
	}
}
