package exercicio02;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String entrada = leitor.next();
		int a = entrada.length();
		if (a < 6) {
			System.out.println(6-a);
		}
	}

}
