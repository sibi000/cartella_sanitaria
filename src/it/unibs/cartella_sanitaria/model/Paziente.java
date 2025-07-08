package it.unibs.cartella_sanitaria;

import java.util.*;

public class Paziente {
	
	// dati del paziente
	private String nome ;			// nome
	private String cognome ;			// cognome 
	private Genere genere ;			// maschio o femmina
	private String indirizzo ;		// indirizzo della abitazione
	private String telefono ;		// numero di telefono
	private String email ;			// email
	private Date   data_nascita ;	// data di nascita
	private String luogo_nascita ;	// luogo di nascita
	private String codfisc ;			// codice fiscale
	private String codsan ;			// codice sanitario
	private Sangue sangue ;			// gruppo sanguinio ed Rh
	
	// costruttore
	public Paziente(String nome, String cognome, Genere genere, String indirizzo, String telefono, String email, Date data_nascita, String luogo_nascita,
			String codfisc, String codsan, Sangue sangue) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.genere = genere;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.email = email;
		this.data_nascita = data_nascita;
		this.luogo_nascita = luogo_nascita;
		this.codfisc = codfisc;
		this.codsan = codsan;
		this.sangue = sangue;
	}
	


	// getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_nascita() {
		return data_nascita;
	}

	public void setData_nascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}

	public String getLuogo_nascita() {
		return luogo_nascita;
	}

	public void setLuogo_nascita(String luogo_nascita) {
		this.luogo_nascita = luogo_nascita;
	}

	public String getCodfisc() {
		return codfisc;
	}

	public void setCodfisc(String codfisc) {
		this.codfisc = codfisc;
	}

	public String getCodsan() {
		return codsan;
	}

	public void setCodsan(String codsan) {
		this.codsan = codsan;
	}

	public Sangue getSangue() {
		return sangue;
	}

	public void setSangue(Sangue sangue) {
		this.sangue = sangue;
	}
	
	
		
}