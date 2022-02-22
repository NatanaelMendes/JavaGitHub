package exercicioDio01;

public class Aplicação {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		carro1.setCor("Azul");
		carro1.setModelo("Uno");
		carro1.setCapacidadeTanque(30);

		System.out.println(carro1.getCor());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalTanque(6.70));

		Carro carro2 = new Carro("Prata", "Palio", 45);

		System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalTanque(6.70));
	}
}
