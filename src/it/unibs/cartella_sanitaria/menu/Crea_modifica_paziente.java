package it.unibs.cartella_sanitaria;

import it.unibs.fp.mylib.*;
import libreria_sibilia.*;
import libreria_sibilia.codicefiscale.engine.Engine;

import java.util.*;

public class Crea_modifica_paziente {
	private Paziente paziente;	// istanza della classe Paziente

	public void scegliere () {	// metodo per la selezione della operazione
		
		MyMenu crea_modifica_paziente = new MyMenu ("Crea/Modifica paziente" , new String[] {"Crea", "Modifica"}) ;	//menu scelta
		
		int scelta ;		// voce del menu scelta dal utente
		
		do {
			scelta = crea_modifica_paziente.scegli() ;
			switch (scelta) {
			case 1 : 
				crea() ;				// crea il paziente
				break ;
			case 2 :
				if(paziente != null) {
					modifica() ;		// modifica paziente esistente
				}
				else{
					System.out.println("non esiste alcun paziente da modificare") ;
				}
				break ;
			case 0 :
				System.out.println("ritorno al menu precedente") ;
				break ;
			}
		}
		while(scelta != 0) ;
	}
	
	public void crea () {	// metodo per la creazione di un paziente
		
		String nome = InputStringa.leggiStringaAlfabetica("Inserisci il tuo nome : ") ;
		
		String cognome = InputStringa.leggiStringaAlfabetica("Inserisci il tuo cognome : ") ;
		
		String elenco_generi = ("scelga il suo genere: \n"
							+ "0 M \n"
							+ "1 F \n") ;
		int genere_fittizio = InputDati.leggiIntero(elenco_generi, 0, 1) ;
		Genere genere = Genere.values()[genere_fittizio] ;
		
		String indirizzo = InputDati.leggiStringaNonVuota("Inserisci il tuo indirizzo : ") ;
		
		String telefono = InputStringa.leggiStringaNumerica("Inserisci il tuo numero di telefono : ") ;
		
		String email = InputDati.leggiStringaNonVuota("Inserisci la tua email : ") ;
		
		Date data_nascita = InputDataCalendario.data("Inserisci la tua data di nascita (gg/mm/yyyy) : ") ;
		
		String luogo_nascita ;
		Engine generatore_codfisc=null;
		String codfisc;
		do {
			luogo_nascita = InputDati.leggiStringaNonVuota("Inserisci il tuo luogo di nascita : ") ;
		
			generatore_codfisc = new Engine(nome, cognome, genere, data_nascita, luogo_nascita);
			codfisc = generatore_codfisc.getCode() ;
			if(codfisc.contentEquals("*#ERRORE DI CALCOLO#*")){
				System.out.println("la citta inserita non è valida, riprovi : ");
			}
		}
		while(codfisc.contentEquals("*#ERRORE DI CALCOLO#*" ));
		System.out.println("il suo codice sanitario è : " +codfisc) ;
		
			int codsan_fittizio = NumeriCasuali.estraiIntero( 1 , 999999 ) ;
		String codsan = String.valueOf(codsan_fittizio) ;
		
			System.out.println("il suo codice sanitario è : " + codsan) ;
			String elenco_sangue = ("scelga il suo gruppo sanguineo: \n"
							+ "0  A_POSITIVO\n"
							+ "1  A_NEGATIVO\n"
							+ "2  B_POSITIVO\n"
							+ "3  B_NEGATIVO\n"
							+ "4  AB_POSITIVO\n"
							+ "5  AB_NEGATIVO\n"
							+ "6  O_POSITIVO\n"
							+ "7  0_NEGATIVO\n") ;
			int sangue_fittizio = InputDati.leggiIntero(elenco_sangue, 0, 7) ;
		Sangue sangue = Sangue.values()[sangue_fittizio] ;
		
		// creazione del paziente con i dati inseriti
		paziente = new Paziente(nome, cognome, genere , indirizzo, telefono, email, data_nascita, luogo_nascita, codfisc, codsan, sangue) ;
		
		System.out.println("paziente creato correttamente.") ;
		
	}
	
	public void modifica() {		// metodo per la modifica di un paziente
		
		// scelta del parametro da modificare
		MyMenu modifica_paziente = new MyMenu ("Modifica paziente" , new String[] {"Nome", "Cognome", "Genere", "Indirizzo", "Telefono", "Email"}) ;
		
		int modifica ;
		
		do {
			modifica = modifica_paziente.scegli() ;	// parametro da modificare
		
			switch (modifica) {
			case 1:
				String nome = InputStringa.leggiStringaAlfabetica("Inserisci il tuo nuovo nome : ") ;
				paziente.setNome(nome) ;
				break ;
			case 2:
				String cognome = InputStringa.leggiStringaAlfabetica("Inserisci il tuo nuovo cognome : ") ;
				paziente.setCognome(cognome) ;
				break ;
			case 3:
				String elenco_generi = ("scelga il suo nuovo genere: \n"
						+ "0 M \n"
						+ "1 F \n") ;
					int genere_fittizio = InputDati.leggiIntero(elenco_generi, 0, 1) ;
					Genere genere = Genere.values()[genere_fittizio] ;
					paziente.setGenere(genere) ;
				break;
			case 4:
				String indirizzo = InputDati.leggiStringaNonVuota("Inserisci il tuo nuovo indirizzo : ") ;
				paziente.setIndirizzo(indirizzo) ;
				break ;
			case 5:
				String telefono = InputStringa.leggiStringaNumerica("Inserisci il tuo nuovo numero di telefono : ") ;
				paziente.setTelefono(telefono) ;
				break ;
			case 6:
				String email = InputDati.leggiStringaNonVuota("Inserisci la tua nuova email : ") ;
				paziente.setEmail(email) ;
				break ;
			case 0:
				break ;
			}
		}
		while (modifica != 0) ;
	System.out.println("paziente modificato correttamente.") ;
		
	}

	// costruttore
	public Crea_modifica_paziente() {
		super();
	}
		
}
