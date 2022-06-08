import java.util.Arrays;

public class SommaArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet = {1,2,45,9,3,-3,29,-80};
		System.out.println("La somma dei valori e' pari a: " + sum(vet));

	}
	
	public static int sum(int[] v)
	{
		int somma=0;
		for(int i=0;i<v.length;i++)
		{
		if(v[i]>0)
		{
			somma=somma+v[i];
		}
		}
		return somma;
		
	}

}
