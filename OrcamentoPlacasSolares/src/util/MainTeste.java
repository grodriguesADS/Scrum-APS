package util;

import java.text.DecimalFormat;

import javax.swing.SwingUtilities;

import telas.JanelaMenu;
import telas.JanelaPadrao;

public class MainTeste {
	public static void main (String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				JanelaPadrao t = new JanelaMenu();
				
			}
		
	});
}
}