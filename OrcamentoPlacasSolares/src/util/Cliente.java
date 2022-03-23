package util;

import java.util.concurrent.atomic.AtomicLong;

public class Cliente {
	private static AtomicLong idCounter = new AtomicLong();
	private long idCliente;
	private String nomeCliente;
	private String emailCliente;
	private int numeroCliente;
	
	
	public Cliente (String nome, String email, int numero) {
		 setId(idCounter.getAndIncrement());
		 this.nomeCliente = nome;
		 this.emailCliente = email;
		 this.numeroCliente = numero; 
	}
	
	public String getNome() { return nomeCliente; }
	
	public void setNome(String nome) { this.nomeCliente = nome; } 
	
	public String getEmail() { return emailCliente; }
	
	public void setEmail(String email) { this.emailCliente = email; }
	
	public int getNumero() { return numeroCliente; }
	
	public void setNumero(int numero) { this.numeroCliente = numero; }
	
	public static AtomicLong getIdCounter() { return idCounter; }
	
	public static void setIdCounter(AtomicLong idCounter) { Cliente.idCounter = idCounter; }
	
	public long getId() { return idCliente; }
	
	public void setId(long id) { this.idCliente = id; }
	
	
}
