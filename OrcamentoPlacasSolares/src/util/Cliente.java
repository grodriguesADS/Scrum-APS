package util;

import java.util.concurrent.atomic.AtomicLong;

public class Cliente {
	private static AtomicLong idCounter = new AtomicLong();
	private long id;
	private String nome;
	private String email;
	private int numero;
	
	
	public Cliente (String nome, String email, int numero) {
		 setId(idCounter.getAndIncrement());
		 this.nome = nome;
		 this.email = email;
		 this.numero = numero; 
	}
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; } 
	
	public String getEmail() { return email; }
	
	public void setEmail(String email) { this.email = email; }
	
	public int getNumero() { return numero; }
	
	public void setNumero(int numero) { this.numero = numero; }
	
	public static AtomicLong getIdCounter() { return idCounter; }
	
	public static void setIdCounter(AtomicLong idCounter) { Cliente.idCounter = idCounter; }
	
	public long getId() { return id; }
	
	public void setId(long id) { this.id = id; }
	
}
