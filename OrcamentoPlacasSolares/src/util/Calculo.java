package util;
import java.text.DecimalFormat;

public class Calculo {

	public Calculo(String potencia, String regiao, String consumo) {
		int potenciaPainel = Integer.parseInt(potencia);
		float irradiacaoSolar = 0;
		int consumoMensal = Integer.parseInt(consumo);
		if(regiao.equals("Nordeste")) {
			irradiacaoSolar = (float) 5.9;
			
		}else if(regiao.equals("")) {
			irradiacaoSolar = (float) 5.9;
		}
		
	/*
	 * 
	 * Nordeste	5,9
		Centro-Oeste	5,7
		Sudeste	5,6
		Norte	5,5
		Sul	5,0
	 */
		
		float energiaGerada = (int) (potenciaPainel*irradiacaoSolar*(1 - 0.20)); 
		float qtdPaineis = consumoMensal/(energiaGerada *30);
		DecimalFormat df = new DecimalFormat();
		DecimalFormat dfP = new DecimalFormat("0");
		System.out.println("Energia gerada por dia: " + df.format(energiaGerada) + " kWh/dia");
		System.out.println("Energia gerada por mes: " + df.format(energiaGerada * 30) + " kWh/mes");
		System.out.println("Quantidade de paineis: " + dfP.format(qtdPaineis * 1000));
		
	}
}
