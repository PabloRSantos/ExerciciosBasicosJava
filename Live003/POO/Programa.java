package Live003.POO;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
								//parametro
		Scanner in = new Scanner(System.in);
		
		String texto = "Vin�cius";
		
		Lampada minhaLampada = new Lampada();
		Lampada segundaLamp = new Lampada();
		
		//n�o quero deixar fazer isso
		//minhaLampada.estado = true;
		
		minhaLampada.acender();
		System.out.println("A l�mpada est� " + minhaLampada.status());
		
		minhaLampada.apagar();
		System.out.println(minhaLampada.status());
		
		minhaLampada.acender();
		System.out.println("A segunda lamp: " + segundaLamp.status());
	}
}
