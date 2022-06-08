public class Calcolatrice {

	private double a;
	private double b;


	public static double somma(double a, double b) {
		return a + b;
	}

	public static double sottrazione(double a, double b) {
		return a - b;
	}

	public static double moltiplicazione(double a, double b) {
		return a * b;
	}

	public static double divisione(double a, double b) {
		if (b != 0)
			return a / b;
		else
			return -0.9;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
