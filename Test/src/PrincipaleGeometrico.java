
public class PrincipaleGeometrico{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a=4;
			double b=8;
			
			Rettangolo primo=new Rettangolo(a,b);
			System.out.println("Il perimetro del rettangolo e': "+primo.calcoloPerimetro(a, b));
			System.out.println("L'area del rettangolo e': "+primo.calcoloArea(a, b));
			
			Triangolo secondo=new Triangolo(a,b);
			System.out.println("Il perimetro del triangolo e': "+secondo.calcoloPerimetro(a, b));
			System.out.println("L'area del triangolo e': "+secondo.calcoloArea(a, b));
	}
}
