
public class Test {

	private String input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inserisci un nome");
		

	}
	
	public boolean isPalindromo(String in) {
		boolean condition=false;
		boolean ex=false;
		char a;
		char b;
		
		this.input=in;
		int letter=in.length();
		for(int i=0;i<letter;i++) {
				a=in.charAt(i);
				b=in.charAt(letter);
				if(a==b) {
					in=in.substring(a, b);
					condition=true;
				}
				else i=letter;
		}
		return condition;
	}

	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
}
