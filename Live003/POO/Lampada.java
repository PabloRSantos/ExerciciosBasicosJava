package Live003.POO;

//LAMPADA � UM OBJETO
public class Lampada {

	private boolean estado = false;
	
	
	//m�todo
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
