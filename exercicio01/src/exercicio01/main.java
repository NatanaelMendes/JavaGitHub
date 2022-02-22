/**
 * 
 */
package exercicio01;

import java.util.Scanner;

/**
 * @author natan
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int aux = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i - 1; j++) {
				System.out.print(' ');
				aux++;
			}
			for (int k=0 + aux; k < n; k++) {
				System.out.print('*');
			}
			aux = 0;
			System.out.println();

		}

	}

}
