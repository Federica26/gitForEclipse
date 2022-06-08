import java.util.*;

public class ProdottoElementiArray {

	private static int[] vet = { 1, 13, 2 ,9,80};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I nuovi valori ottenuti sono: " +Prodotto(vet));

	}
	//Arrays.toString(Prodotto(vet))}

	public static int[] Prodotto(int[] v) {
		int[] finale=new int[v.length];
		InizializzaVettore(v);
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				while (i != j) {
					if(finale[i]==0)
					{
						finale[i]=v[i];
					}
					else
					finale[i] = finale[i] * v[j];
				}
			}
		}
		return finale;
	}
	
	public static int[] InizializzaVettore(int[] v)
	{
		for(int i =0;i<v.length;i++)
		{
			v[i]=0;
		}
		return v;
	}
	
	public int[] getVet() {
		return vet;
	}

	public void setVet(int vet[]) {
		this.vet = vet;
	}

}
