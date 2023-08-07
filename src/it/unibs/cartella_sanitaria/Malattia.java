package it.unibs.cartella_sanitaria;

import java.util.*;

public class Malattia {

	// dati della eventuale malattia
	private String nome_malattia ;	// nome della malattia
	private Date inizio ;		// data di inizio malattia
	private Date fine ;			// data di eventuale fine malattia
	private String sintomi ;		// eventuali sintomi della malattia
	private String diagnosi ;	// diagnosi medica
	private String terapia ;		// terapia associata
								// esami associati
	
	
	// costruttore
	public Malattia(String nome_malattia, Date inizio, Date fine, String sintomi, String diagnosi, String terapia) {
		super();
		this.nome_malattia = nome_malattia;
		this.inizio = inizio;
		this.fine = fine;
		this.sintomi = sintomi;
		this.diagnosi = diagnosi;
		this.terapia = terapia;
	}

	
	// getter e setter
	public String getNome_malattia() {
		return nome_malattia;
	}


	public void setNome_malattia(String nome_malattia) {
		this.nome_malattia = nome_malattia;
	}


	public Date getInizio() {
		return inizio;
	}


	public void setInizio(Date inizio) {
		this.inizio = inizio;
	}


	public Date getFine() {
		return fine;
	}


	public void setFine(Date fine) {
		this.fine = fine;
	}


	public String getSintomi() {
		return sintomi;
	}


	public void setSintomi(String sintomi) {
		this.sintomi = sintomi;
	}


	public String getDiagnosi() {
		return diagnosi;
	}


	public void setDiagnosi(String diagnosi) {
		this.diagnosi = diagnosi;
	}


	public String getTerapia() {
		return terapia;
	}


	public void setTerapia(String terapia) {
		this.terapia = terapia;
	}
	
}
