import java.util.Arrays;

public class ShiftArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet = {1,2,4,9,3};
		System.out.println("La sequenza shiftata e': " + Arrays.toString(shift(vet)));

	}
	
	public static int[] shift(int[] v)
	{
		int[] v2=new int[v.length];
		int temp=v[v.length-1];
		for(int i=0;i<v.length;i++)
		{
			if(i==(v.length-1))
			{
				v2[0]=temp;
			}
			else v2[i+1]=v[i];
		}
		return v2;
	}

}
