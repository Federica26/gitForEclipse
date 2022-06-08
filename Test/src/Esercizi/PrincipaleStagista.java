package Esercizi;

public class PrincipaleStagista {

	public static void main(String[] args) {
		Stagista s1=new Stagista("Alberto", "Rondi", 16);
		Stagista s2=new Stagista("Rebecca", "Antolini", 32);
		
		if(s2.minoreDi(s1.getEta())==true)
		{
			System.out.println("Lo stagista "+s2.getNome()+" "+ s2.getCognome()+" e' minore di "+s1.getNome()+" "+s1.getCognome());
		}
		else
			System.out.println("Lo stagista "+s1.getNome()+" "+ s1.getCognome()+" e' minore di "+s2.getNome()+" "+s2.getCognome());
		// TODO Auto-generated method stub

	}

}
