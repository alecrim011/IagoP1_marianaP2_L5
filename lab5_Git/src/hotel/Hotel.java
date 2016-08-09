package hotel;

public class Hotel {
	Recepcao recepcao = new Recepcao();
	
	
	
	public Hotel(){
		
	}
	
	public void checkIn(String nome, String tipo, int idade,int dias, double valor)throws Exception{
		recepcao.checkIn(nome, tipo, idade, dias, valor);
		
	}
	
	public void checkOut(String nome){
		recepcao.checkOut(nome);
		
	}
	
	public int numDeHospedes(){
		return recepcao.getNumHospedes();
		
	}
	
	public double GetLucroTotal(){
		return recepcao.getLucroTotal();
	}
	
	
	
	


}
