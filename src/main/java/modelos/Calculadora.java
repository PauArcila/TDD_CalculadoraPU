package modelos;

public class Calculadora {
	
	Integer primerNumero;
	Integer segundoNumero;
	
	public Calculadora(Integer primerNumero, Integer segundoNumero) {
		this.primerNumero = primerNumero;
		this.segundoNumero = segundoNumero;
	}
	public Integer getPrimerNumero() {
		return primerNumero;
	}
	public void setPrimerNumero(int primerNumero) {
		this.primerNumero = primerNumero;
	}
	public Integer getSegundoNumero() {
		return segundoNumero;
	}
	public void setSegundoNumero(int segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	@Override
	public String toString() {
		return "Calculadora [primerNumero=" + primerNumero + ", segundoNumero=" + segundoNumero + "]";
	}	

}
