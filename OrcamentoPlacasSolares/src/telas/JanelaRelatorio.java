package telas;

import java.awt.Color;

import javax.swing.JLabel;

public class JanelaRelatorio extends JanelaPadrao {
	String potencia;
	String regiao;
	

	public JanelaRelatorio(String regiao, String consumo, String potencia) {
		
		super("Relatorio");
		this.potencia = potencia;
		this.regiao = regiao;
		adicionarLabel();
	
	
	}

	private void adicionarLabel() {
		String text = "Considerando o tipo da placa " + potencia + " a regiao " + regiao;
		text += " ";
		JLabel relatorio = new JLabel(text);
		relatorio.setBounds(50, 44, 500, 300);
		relatorio.setForeground(Color.white);
		
		add(relatorio);
	}
	
	

}
