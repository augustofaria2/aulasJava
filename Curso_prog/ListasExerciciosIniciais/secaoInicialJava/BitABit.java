package secaoInicialJava;
public class BitABit {

	public static void main(String[] args) {
		
		int n1 = 89; // 0101 1001
		int n2 = 60; // 0011 1100
		
		//1 = verdadeiro 0 = falso
		
		System.out.println(n1 & n2); //Só é verdadeiro quando ambos bits são verdadeiros (E)
		System.out.println(n1 | n2); //É verdadeiro quando houver ao menos 1 verdadeiro (OU)
		System.out.println(n1 ^ n2); //É verdadeiro apenas quando 1 for verdadeiro (XOR / OU exclusivo)
		
		/*Scanner sc = new Scanner(System.in);
		 * int mask = 32; (00100000) pode ser colocado assim: int mask = 0b10000 (não precisa dos 0 antes do 1)
		 * int n = sc.nextInt();
		 * 
		 * if((n & mask) != 0){
		 * 		System.out.println("6th bit is true!");
		 * }else{
		 * 		System.out.println("6th bit is false!");
		 * }
		 * 
		 * sc.close();
		 */
		
	
	}

}