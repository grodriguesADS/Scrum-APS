package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import telas.JanelaSimulacao;
import telas.Orcamento;






public class OuvinteBtOrcamento implements ActionListener  {

    private Orcamento janela;

    public Orcamento getJanela() {
        return janela;
    }

    public OuvinteBtOrcamento (Orcamento janela) {
        this.janela = janela;
    }
    public void actionPerformed(ActionEvent e) {
    	String regiao = janela.getRegiao().getSelectedItem().toString();
    	String consumo = janela.getConsumoDoCliente().getText();
    	String potencia = janela.getPotencia().getSelectedItem().toString();
     
      janela.dispose();
      new JanelaSimulacao(regiao, consumo, potencia);      

}
}
