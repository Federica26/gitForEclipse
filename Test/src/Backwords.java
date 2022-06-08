
public class Backwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "reticolo";
		System.out.println("La stringa invertita e': " + Invert(word));

	}

	public static String Invert(String a) {
		
		char[] res=new char[a.length()];
		int num = a.length();
		/*
		for (int i = 0; i < num; i++) {
				res[i] = a.charAt(i);

		}
		*/
		for (int i = 0; i < num; i++) {
			if (i != num) {
				res[i] = a.charAt(num - 1);
				res[num - 1] = a.charAt(i);
				num--;
			}else res[i]=a.charAt(i);

		}
		String result=new String(res); 
		return result;
	}
}
