import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet = { 1, 2, 45, 9, 3, -3, 29, -80 };
		int[] vet2 = { 19 };
		int[] risp = minAndMax(vet);
		System.out.println("Valore dell'array: " + Arrays.toString(vet));
		if (risp[0] == 0 && risp[1] == 0) {
			System.out.println("Non è possibile continuare l'operazione");
		} else
			System.out.println("Il valore massimo e' " + risp[0] + " e il valore minimo e' " + risp[1]);

	}

	public static int[] minAndMax(int[] v) {
		int max = 0;
		int min = 0;
		int[] result = new int[2];
		if (v.length < 2) {
			result[0] = 0;
			result[1] = 0;
		}
		else {
		for (int i = 0; i < v.length; i++) {
			if (v[i] > max)
				max = v[i];
			if (v[i] < min)
				min = v[i];
		}
		}
		result[0]=max;
		result[1]=min;
		return result;
	}

}
