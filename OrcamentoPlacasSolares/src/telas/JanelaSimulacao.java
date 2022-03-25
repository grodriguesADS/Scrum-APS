package telas;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import util.Operacoes;

public class JanelaSimulacao extends JanelaPadrao {
	private String potencia;
	private String regiao;
	
	private Operacoes operacao;

	public JanelaSimulacao(String regiao, String consumo, String potencia) {	
		
		super("Relatorio");
		operacao = new Operacoes(potencia, regiao, consumo);
		
		this.potencia = potencia;
		this.regiao = regiao;
		adicionarLabel();
		
		
	
	
	}

	private void adicionarLabel() {
		String text = "Considerando o tipo da placa " + potencia + " a regiao " + regiao;
		text += "\n "+operacao.getEnergiarGeradaPorDia();
		text += "\n "+ operacao.getEnergiarGeradaPorMes();
		text += "\n "+ operacao.getQuantidadeDePaines();
		JTextArea relatorio = new JTextArea(text);
		relatorio.setEditable(false);
		relatorio.setLineWrap(true);
		relatorio.setBounds(100, 100, 700, 300);
		relatorio.setBackground( new Color(20, 92, 255));
		
		add(relatorio);
	}
	
	

}
