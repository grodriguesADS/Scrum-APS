package telas;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import ouvintes.OuvinteBotoes;





public class CadastroCliente extends JanelaPadrao {
	
	 private JTextField EmailCliente;
	 private JTextField NomeCliente;
	 
	public JTextField getEmailCliente() {
		return EmailCliente;
	}

	public JTextField getNomeCliente() {
		return NomeCliente;
	}

		public CadastroCliente() {
	      super("Cadastro Cliente");
	        adicionarLabel();
	        adicionarTextField();
	        adicionarLabel2();
	        adicionarTextField2();
	      
	        adicionarLabel4();
	        adicionarComboBox();
	        adicionarBotao();
	        
	     
	        
	        setVisible(true);
	        
	    }
	  
		
	    public void adicionarLabel () {
	        JLabel texto = new JLabel("Nome do Cliente: ");	        
	        texto.setBounds(380, 100, 140, 44);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    public void adicionarTextField () {
	        NomeCliente = new JTextField();
	        NomeCliente.setBounds(380, 130, 250, 44);
	        NomeCliente.setEnabled(true);
	        
	        add(NomeCliente);
	    }
	    
	    public void adicionarLabel2() {
	        JLabel texto = new JLabel("Email:");	        
	        texto.setBounds(380, 180, 140, 44);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    public void adicionarTextField2 () {
	        EmailCliente = new JTextField();
	    
	        EmailCliente.setBounds(380, 210, 250, 44);
	        EmailCliente.setEnabled(true);
	        
	        add(EmailCliente);
	    }

	    public void adicionarLabel4 () {
	        JLabel texto = new JLabel("Sexo: ");
	        
	        texto.setBounds(380, 260, 230, 60);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    private void adicionarComboBox() {
	        String[] opcoes = {"Masculino", "Feminino", "Outro"};
	        JComboBox<String> comboBox = new JComboBox<String>(opcoes);
	        
	        comboBox.setBounds(380, 300, 250, 44);
	       
	        add(comboBox);
	    }
	    public void adicionarBotao () {
	        
	        JButton botao = new JButton("Salvar");
	       
	        botao.setBounds(450, 400, 90, 44);
	        botao.setToolTipText("Clique Para Confirmar");
	     //   ouvinteBtCadastraCliente ouvinteCliente = new ouvinteBtCadastraCliente (this);
	     //   botao.addActionListener(ouvinteCliente);
	       // botao.addMouseListener(new ouvinteBotoes(botao));
	        add(botao);
}
}
