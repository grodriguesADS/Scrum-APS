package telas;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import ouvintes.OuvinteBtOrcamento;
import ouvintes.ouvinteBotoes;






public class Orcamento extends JanelaPadrao {
	
	 private JTextField PotenciaDaPlaca;
	 private JTextField ConsumoDoCliente;
	 private JComboBox Regiao;
	 

	public String getPotencia() {
		return PotenciaDaPlaca.getText();
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
	        adicionarTextField();
	        adicionarLabel2();
	        adicionarComboBox();
	        
	        adicionarComboBox2();
	      
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
	    public void adicionarTextField () {
	    	PotenciaDaPlaca = new JTextField();	        
	        
	    	PotenciaDaPlaca.setBounds(380, 130, 250, 44);
	    	PotenciaDaPlaca.setEnabled(true);
	        
	        add(PotenciaDaPlaca);
	    }
	    
	    public void adicionarLabel2() {
	        JLabel texto = new JLabel("Regiao:");
	        
	        texto.setBounds(380, 180, 140, 44);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    public void adicionarComboBox() {
	        String[] opcoes = {"Nordeste", "Sul", "Suldeste"};
	        Regiao = new JComboBox<String>(opcoes);
	       
	        Regiao.setBounds(380, 220, 140, 44);
	        
	        add(Regiao);
	    }

	    public void adicionarLabel4 () {
	        JLabel texto = new JLabel("Consumo do Cliente (kwh): ");
	        
	        texto.setBounds(380, 260, 230, 60);
	        texto.setForeground(Color.black);
	        
	        add(texto);

	    }
	    private void adicionarComboBox2() {
	    	ConsumoDoCliente = new JTextField();       

	    	ConsumoDoCliente.setBounds(380, 300, 250, 44);
	    	ConsumoDoCliente.setEnabled(true);
	        
	        add(ConsumoDoCliente);

	    }
	    public void adicionarBotao () {
	        
	        JButton botao = new JButton("Relatorio");
	       
	        botao.setBounds(450, 400, 90, 44);
	        botao.setToolTipText("Clique Para Confirmar");
	        OuvinteBtOrcamento ouvinteOrcamento = new OuvinteBtOrcamento (this);
	        botao.addActionListener(ouvinteOrcamento);
	       // botao.addMouseListener(new ouvinteBotoes(botao));
	        add(botao);
}
}
