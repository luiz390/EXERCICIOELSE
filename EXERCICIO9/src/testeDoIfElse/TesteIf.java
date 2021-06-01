package testeDoIfElse;

import java.util.Scanner;

public class TesteIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("digite um numero ");
		n1 = sc.nextInt();
		System.out.println("digite outro numero");
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println("MARIA");
		}
		else {
			System.out.println("JOSEFA");
		}
	}

}
