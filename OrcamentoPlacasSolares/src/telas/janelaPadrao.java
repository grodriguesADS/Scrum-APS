package telas;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;





@SuppressWarnings("serial")
public class janelaPadrao extends JFrame {
	

	private JMenuBar barraDeMenu; 
	private JButton voltar;
	
	public JButton getVoltar() {
		return voltar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}

	public janelaPadrao(String titulo) {
		Color fundo = new Color(238,130,238);		

			getContentPane().setBackground(Color.red);
			setTitle(titulo);
			setSize(1000,600);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);	
			setLayout(null);
			
			setMinimumSize(new Dimension(200, 300));
			
			
			setVisible(true);

			
			
	//		ouvinteMenuBar ouvinteMenuBar = new ouvinteMenuBar(this);
			
			//	if(!(this instanceof janelaAdmin || this instanceof janelaLogin || this instanceof janelaEsqueceuSenha)) {
			//		barraDeMenu = new JMenuBar();		
			//		setJMenuBar(barraDeMenu);
			//	}
			
			
			/*
			JMenu menuOpcoes = new JMenu("Opcoes");
			menuOpcoes.setBackground(getForeground());			
			barraDeMenu.add(menuOpcoes);
			
			JMenuItem itemMenu = new JMenuItem("Menu");
			itemMenu.addActionListener(ouvinteMenuBar);
			menuOpcoes.add(itemMenu);
			
			JMenuItem itemListar = new JMenuItem("Listar");
			itemListar.addActionListener(ouvinteMenuBar);			
			menuOpcoes.add(itemListar);
			
			JMenuItem itemNovo = new JMenuItem("Novo");
			itemNovo.addActionListener(ouvinteMenuBar);
			menuOpcoes.add(itemNovo);
			
			JMenuItem itemBuscarAgendamento = new JMenuItem("Buscar Agendamento");
			itemBuscarAgendamento.addActionListener(ouvinteMenuBar);			
			menuOpcoes.add(itemBuscarAgendamento);
			
			JMenuItem itemSair = new JMenuItem("Sair");
			itemSair.addActionListener(ouvinteMenuBar);			
			menuOpcoes.add(itemSair);
			
			
			if(!(this instanceof janelaMenu)) {
				ImageIcon img = new ImageIcon("img/icons8-seta-esquerda.png");
				JButton voltar = new JButton();
				voltar.setBounds(10,10,50,50);
				voltar.setOpaque(false);
				voltar.setContentAreaFilled(false);
				
				voltar.addActionListener(new ouvinteBtVoltar(this));
				add(voltar);
			}
			
			*/
}
	
}



