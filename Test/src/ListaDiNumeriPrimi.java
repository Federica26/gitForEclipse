import java.util.*;

public class ListaDiNumeriPrimi {
	
	private static int[] vet= {1,3,2,6,5,8,32,13,67,80,0,4,72};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I numeri primi contenuti nell'array sono: "+getNumeriPrimi(vet));

	}
	
	public static List<Integer> getNumeriPrimi(int[] lista){
		List<Integer> finale=new ArrayList<>();
		for(int i=0;i<lista.length; i++)
		{
			if(vet[i]%1!=0 || vet[i]%2!=0 || vet[i]%3!=0 || vet[i]%5!=0)
			{
				finale.add(vet[i]);
			}
		}
		
		return finale;
	}

	public int[] getVet() {
		return vet;
	}

	public void setVet(int vet[]) {
		this.vet = vet;
	}
}
