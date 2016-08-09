package hotel;

import hotel.Animal;

public class Estadia {
	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor) throws Exception{
		if(dias <= 0){
			throw new Exception("Digite um numero de dias maior que zero.");
		}
		
		if(valor <= 0){
			throw new Exception("Digite um valor maior que zero.");
		}
		
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
		
	}

	public Animal getAnimal() {
		return animal;
	}

	public double getValor() {
		return valor;
	}

	public int getDias() {
		return dias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + dias;
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Estadia) {
			Estadia novaEstadia = (Estadia) obj;
			if (this.getValor() == novaEstadia.getValor() && this.getDias() == novaEstadia.getDias()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return animal.getNome() + ", " +animal.getTipo() + this.dias + "com o preco de R$" + this.valor;
	}
}
