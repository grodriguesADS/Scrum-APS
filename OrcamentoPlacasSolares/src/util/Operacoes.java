package util;
import java.text.DecimalFormat;

public class Operacoes {
	
	private String EnergiarGeradaPorDia;

	private String EnergiarGeradaPorMes;
	
	private String QuantidadeDePaines;
	
	
	public String getEnergiarGeradaPorDia() {
		return EnergiarGeradaPorDia;
	}



	public String getEnergiarGeradaPorMes() {
		return EnergiarGeradaPorMes;
	}



	public String getQuantidadeDePaines() {
		return QuantidadeDePaines;
	}


	
	/**
	 * Funcao que determina quantas placas solares sao necessaria para o
	 * consumo de energia que a residencia precisa.
	 * 
	 * Irradiacao por regiao: 
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
		int potenciaPainel = 0;
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
		
		switch (potencia) {
		case "Canadian Solar(340 W)":
			potenciaPainel = 340;
			break;
		case "Yingli Solar(310 W)":
			potenciaPainel = 310;
			break;
		case "Trina Solar(335 W)":
			potenciaPainel = 335;
			break;
		case "Globo Brasil(320 W)":
			potenciaPainel = 320;
			break;
	
		}

		float energiaGerada = (int) (potenciaPainel*irradiacaoSolar*(1 - 0.20)); 
		float qtdPaineis = consumoMensal/(energiaGerada *30);
		DecimalFormat df = new DecimalFormat();
		DecimalFormat dfP = new DecimalFormat("0");
		EnergiarGeradaPorDia = ("Energia gerada por dia: " + df.format(energiaGerada) + " kWh/dia");
		EnergiarGeradaPorMes = ("Energia gerada por mes: " + df.format(energiaGerada * 30) + " kWh/mes");
		QuantidadeDePaines = ("Quantidade de paineis: " + dfP.format(qtdPaineis * 1000));
	}
}
