package telas;

import javax.swing.JButton;

import ouvintes.OuvinteJanelaMenu;




@SuppressWarnings("serial")
public class JanelaMenu extends JanelaPadrao {
	
	public JanelaMenu(String titulo) {
		super(titulo);
		
	}


	private int largura = 377;
	private int altura = 44;
	private int marginleft = 320;
	
	public JanelaMenu() {
		super("Menu");
		
		adicionarOpcoes();
		repaint();
		
		setVisible(true);
		
	}
	

	private void adicionarOpcoes() {		
		
		JButton agendamento = new JButton("Orcamento");
		agendamento.setBounds(marginleft, 140 , largura , altura);
		//agendamento.addMouseListener(new ouvinteBotoes(agendamento));
		agendamento.addActionListener(new OuvinteJanelaMenu(this));
		add(agendamento);
		
		JButton geradorDeRelatorioa = new JButton("Cadastrar Cliente");
		geradorDeRelatorioa.setBounds(marginleft, 200 , largura , altura);
		//geradorDeRelatorioa.addMouseListener(new ouvinteBotoes(geradorDeRelatorioa));
		geradorDeRelatorioa.addActionListener(new OuvinteJanelaMenu(this));
		add(geradorDeRelatorioa);
		
		/*
		JButton adicionarColaboradoraServico = new JButton("Associar Colaborador a Serviço");
		adicionarColaboradoraServico.setBounds(60, 260 , z , w);
		adicionarColaboradoraServico.addMouseListener(new ouvinteBotoes(adicionarColaboradoraServico));
		adicionarColaboradoraServico.addActionListener(new ouvinteDoBtAdicionarServico(this));
		add(adicionarColaboradoraServico);		
		
		JButton EnviarEmailAoscolaboradores = new JButton("Enviar Mala Direta");
		EnviarEmailAoscolaboradores.setBounds(60, 320 , z , w);
		EnviarEmailAoscolaboradores.addMouseListener(new ouvinteBotoes(EnviarEmailAoscolaboradores));
		EnviarEmailAoscolaboradores.addActionListener(new ouvinteEnviarEmailMenu(this));
		add(EnviarEmailAoscolaboradores);		
		*/
		
		

	}
 }
