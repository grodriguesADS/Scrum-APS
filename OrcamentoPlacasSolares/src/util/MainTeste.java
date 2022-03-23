package util;

import java.text.DecimalFormat;

public class MainTeste {
	public static void main (String[] args) {
		int consumoMensal = 300;
		int potenciaPainel = 340;
		float irradiacaoSolar = 5f;
		float energiaGerada = (int) (potenciaPainel*irradiacaoSolar*(1 - 0.20)); 
		float qtdPaineis = consumoMensal/(energiaGerada *30);
		DecimalFormat df = new DecimalFormat();
		DecimalFormat dfP = new DecimalFormat("0");
		System.out.println("Energia gerada por dia: " + df.format(energiaGerada) + " kWh/dia");
		System.out.println("Energia gerada por mes: " + df.format(energiaGerada * 30) + " kWh/mes");
		System.out.println("Quantidade de paineis: " + dfP.format(qtdPaineis * 1000));
	
	}
}
