package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nomecliente;
	private String email;
	private Date aniversario;
	
	public Cliente(String nomecliente, String email, Date aniversario) {
		this.nomecliente = nomecliente;
		this.email = email;
		this.aniversario = aniversario;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public String toString() {
	  return nomecliente + " (" + sdf.format(aniversario) + ") - " + email;
	}
	
	
}
