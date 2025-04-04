package secao10;

public class LaçoForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-----------------------");
		
		for (String obj : vect) { //Para cada string obj, contida no vetor vect, faça:
			System.out.println(obj);
		}

	}

}
