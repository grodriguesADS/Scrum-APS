package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import telas.CadastroCliente;
import telas.Orcamento;




public class OuvinteJanelaMenu implements ActionListener {
private JFrame janela;
	
	public OuvinteJanelaMenu(JFrame janela) {
		this.janela = janela;
		
	}
	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();		
		if(botao.getText().equals("Orcamento")) {
			janela.dispose();
			new Orcamento();
		}else if(botao.getText().equals("Cadastrar Cliente")) {
			janela.dispose();
			new CadastroCliente();
		}
		
	}
}
