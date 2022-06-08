
public class Triangolo implements IMetodoGeometrico {
	private double base;
	private double altezza;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	
	public Triangolo(double base, double altezza)
	{
		this.altezza=altezza;
		this.base=base;
	}
	
	
	@Override
	public double calcoloPerimetro(double base, double altezza) {
		// TODO Auto-generated method stub
		double perimetro=0;
		double lato=Math.sqrt(Math.pow(altezza, 2)+(Math.pow((base/2), 2)));
		perimetro=base+(lato*2);
		return perimetro;
	}

	@Override
	public double calcoloArea(double base, double altezza) {
		// TODO Auto-generated method stub
		double area=(base*altezza)/2;
		return area;
	}

}
