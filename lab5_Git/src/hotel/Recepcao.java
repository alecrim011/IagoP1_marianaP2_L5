package hotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcao {
	private List<Estadia> estadias;
	private Estadia estadia;

	public Recepcao() {

		this.estadias = new ArrayList<Estadia>();

	}

	public void checkIn(String nome, String tipo, int idade, int dias,
			double valor) throws Exception {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);

	}

	public void checkOut(String nome) {
		for (Estadia estadia : estadias) {
			if (estadia.getNome().equalsIgnoreCase(nome)) {
				estadias.remove(estadia);
			}

		}

	}

	public int getNumHospedes() {
		return estadias.size();
	}

	public double getLucroTotal() {
		double estadia = 0.0;
		for (int i = 0; i < estadias.size(); i++) {
			estadia += estadias.get(i).getValor();

		}
		return estadia;
		

	}
	@Override
	public String toString(){
		for (int i = 0; i < estadias.size(); i++) {
			return estadia.getNome() + "(" + estadia.getTipo() + "): " + estadia.getDias() + "dias com o preco de R$ " + estadia.getValor();
 			
		}
	}

}
