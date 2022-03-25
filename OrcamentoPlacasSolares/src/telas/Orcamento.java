package telas;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import ouvintes.OuvinteBtOrcamento;



public class Orcamento extends JanelaPadrao {
	
	 private JComboBox PotenciaDaPlaca;
	 private JTextField ConsumoDoCliente;
	 private JComboBox Regiao;
	 

	public JComboBox getPotencia() {
		return PotenciaDaPlaca;
	}
	
	public JTextField getConsumoDoCliente() {
		return ConsumoDoCliente;
	}
	
	public JComboBox getRegiao() {
		return Regiao;
	}

		public Orcamento() {
	      super("Orcamento");
	        adicionarLabel();
	        adicionarLabel2();
	       
	      
	        adicionarComboBox();
	        
	        adicionarComboBox2();
	        
	        adicionarTextField2();
	      
	        adicionarLabel4();
	       
	        adicionarBotao();
	        
	     
	        
	        setVisible(true);
	        
	    }
	  
		
	    public void adicionarLabel () {
	        JLabel texto = new JLabel("Potencia da Placa: ");
	        
	        texto.setBounds(380, 100, 140, 44);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    public void adicionarComboBox() {
	        String[] opcoes = {"Canadian Solar(340 W)", "Yingli Solar(310 W)", 
	        		"Trina Solar(335 W)", "Globo Brasil(320 W)"};
	        PotenciaDaPlaca = new JComboBox<String>(opcoes);
	       
	        PotenciaDaPlaca.setBounds(380, 130, 200, 44);
	        
	        add(PotenciaDaPlaca);
	    }
	    
	    public void adicionarLabel2 () {
	        JLabel texto = new JLabel("Regiao: ");
	        
	        texto.setBounds(380, 190, 140, 44);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }

	    public void adicionarComboBox2() {
	        String[] opcoes = {"Nordeste", "Sul", "Suldeste", "Centro-Oeste", "Norte"};
	        Regiao = new JComboBox<String>(opcoes);
	       
	        Regiao.setBounds(380, 220, 140, 44);
	        
	        add(Regiao);
	    }

	    public void adicionarLabel4 () {
	        JLabel texto = new JLabel("Consumo do Cliente (kwh Mês): ");
	        
	        texto.setBounds(380, 260, 230, 60);
	        texto.setForeground(Color.black);
	        
	        add(texto);

	    }
	    private void adicionarTextField2() {
	    	ConsumoDoCliente = new JTextField();       

	    	ConsumoDoCliente.setBounds(380, 300, 250, 44);
	    	ConsumoDoCliente.setEnabled(true);
	        
	        add(ConsumoDoCliente);

	    }
	    public void adicionarBotao () {
	        
	        JButton botao = new JButton("Simular");
	       
	        botao.setBounds(450, 400, 150, 44);
	        botao.setToolTipText("Clique Para Confirmar");
	        OuvinteBtOrcamento ouvinteOrcamento = new OuvinteBtOrcamento (this);
	        botao.addActionListener(ouvinteOrcamento);
	       // botao.addMouseListener(new ouvinteBotoes(botao));
	        add(botao);
}
}
