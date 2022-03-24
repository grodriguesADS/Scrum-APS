package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import telas.JanelaMenu;






public class OuvinteBtVoltar implements ActionListener {
private JFrame janela;
	
	public OuvinteBtVoltar(JFrame janela) {
		this.janela = janela;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bo = (JButton) e.getSource();	

		if(bo.getText().equals("") && !(janela instanceof JanelaMenu)) {
			janela.dispose();
			new JanelaMenu();
		}

	}
}
