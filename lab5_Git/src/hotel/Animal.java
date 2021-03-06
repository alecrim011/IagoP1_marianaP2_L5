package hotel;

public class Animal {
	private String nome;
	private String tipo;
	private int idade;
	
	public Animal(String nome, String tipo, int idade) throws Exception{
		if (nome == null || nome.trim().equals("")){
			throw new Exception("Nome nao pode ser nulo ou vazio.");
		}
		
		if (tipo == null || tipo.trim().equals("")){
			throw new Exception("Tipo nao pode ser nulo ou vazio.");
		}
		
		if (idade < 0){
			throw new Exception("Idade tem que ser maior que zero.");
		}
		
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		
	}

	public String getNome() {
		return nome;
	}


	public String getTipo() {
		return tipo;
	}


	public int getIdade() {
		return idade;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal novoAnimal = (Animal) obj;
			if (novoAnimal.getNome().equals(nome) && novoAnimal.getTipo().equals(tipo)) {
				return true;
			}
		}
		return false;
	}
	
	
}
