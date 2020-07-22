package servicios;

public class ServicioCalculadora {
	
	public double sumar(Integer num1, Integer num2) {
		if (num1!=null && num2!=null) {
		return (num1+num2);
		}
		else return -100;
	}// fin sumar
	
	public  double restar(Integer num1, Integer num2) {
		if (num1!=null && num2!=null) {
			return (num1-num2);
		}
		else return -100;
	}// fin restar
	
	public double multiplicar(Integer num1, Integer num2) {
		if (num1!=null && num2!=null) {
			return (num1*num2);
		}
		else return -100;
	}// fin multi
	
	public double dividir(Integer num1, Integer num2) {
		if (num1!=null && num2!=null) {
			double numA=num1; double numB=num2;
			if (numB > 0) { 
				return (numA/numB);
			}
			else return -100;	
		}
		else return -100;
	}// fin divi
	
}
