package Live003.POO;

//LAMPADA É UM OBJETO
public class Lampada {

	private boolean estado = false;
	
	
	//método
	public void acender() {
	/*     void -> significa sem retorno	
		executa, faz o que tem que fazer  e finaliza
		sem retornar nada.	
	*/
		estado = true;
		// ... outra coisa 
	}
	
	
	public void apagar() {
		estado = false;
	}
	
	
	public String status() {
		if (estado == true) {
			return "Acesa";
		} else {
			return "Apagada";
		}
	}
}
