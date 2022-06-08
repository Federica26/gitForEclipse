import java.util.*;

public class ContatoreStringhe {

	public static String[] vet = {"Sereno", "Nome", "Caro", "Tre", "Pane", "Ponte"};
	public static int num=4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Le stringhe di lunghezza "+num+" sono: "+ Contatore(vet));

	}
	
	public static int Contatore(String[] a) {
		int result=0;
		String prova=null;
		
		for(int i=0;i<a.length; i++) {
			prova=a[i];
			if(prova.length()==num)
				result++;
		}
		return result;
	}

}
