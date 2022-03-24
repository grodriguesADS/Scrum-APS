package util;
import java.text.DecimalFormat;

public class Operacoes {
	
	/**
	 * Função que determina quantas placas solares é necessaria para o
	 * consumo de energia que a residencia precisa.
	 * 
	 * Irradiação por região: 
	 *   Nordeste	5,9
	 *   Centro-Oeste	5,7
	 *   Sudeste	5,6
	 *   Norte	5,5
	 *   Sul	5,0
	 * 
	 * @param String potencia, String regiao, String consumo
	 * @return quantidade de paineis
	 */
	public Operacoes(String potencia, String regiao, String consumo) {
		int potenciaPainel = Integer.parseInt(potencia);
		float irradiacaoSolar = 0;
		int consumoMensal = Integer.parseInt(consumo);
		switch (regiao.toUpperCase()) {
		case "NORDESTE":
			irradiacaoSolar = 5.9f;
			break;
		case "CENTRO-OESTE":
			irradiacaoSolar = 5.7f;
			break;
		case "SUDESTE":
			irradiacaoSolar = 5.6f;
			break;
		case "NORTE":
			irradiacaoSolar = 5.5f;
			break;
		case "SUL":
			irradiacaoSolar = 5.0f;
			break;
		
		}

		float energiaGerada = (int) (potenciaPainel*irradiacaoSolar*(1 - 0.20)); 
		float qtdPaineis = consumoMensal/(energiaGerada *30);
		DecimalFormat df = new DecimalFormat();
		DecimalFormat dfP = new DecimalFormat("0");
		System.out.println("Energia gerada por dia: " + df.format(energiaGerada) + " kWh/dia");
		System.out.println("Energia gerada por mes: " + df.format(energiaGerada * 30) + " kWh/mes");
		System.out.println("Quantidade de paineis: " + dfP.format(qtdPaineis * 1000));
		
	}
}
