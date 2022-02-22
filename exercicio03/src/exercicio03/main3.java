package exercicio03;

import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;

public class main3 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String entrada = leitor.next();
		int aux = 0;
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(0, 1);
		int x = 0;
		for (int j = 0; j < entrada.length(); j++) {
			x ^= 1 << (entrada.charAt(j) - 'a');
			aux += m.containsKey(x) ? m.get(x) : 0;
			for (int i = 0; i < 26; ++i) {
				aux += m.containsKey(x ^ (1 << i)) ? m.get(x ^ (1 << i)) : 0;
			}
			if (m.containsKey(x))
				m.put(x, m.get(x) + 1);
			else
				m.put(x, 1);
		}
		System.out.println(aux);
	}
}
