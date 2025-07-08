package it.unibs.cartella_sanitaria;

import java.util.Date;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;
import libreria_sibilia.InputDataCalendario;

public class Crea_modifica_malattia {
	
	private Malattia malattia ;	// istanza della classe Malattia
	
	public void scegliere () {	// metodo per la selezione della operazione

		MyMenu crea_modifica_malattia = new MyMenu ("Crea/Modifica malattia" , new String[] {"Crea", "Modifica"}) ;	// menu scelta
		
		int scelta ;		// voce del menu scelta dal utente

		do {
			scelta = crea_modifica_malattia.scegli() ;
			switch (scelta) {
			case 1 : 
				crea() ;				// crea una malattia
				break ;
			case 2 :
				if(malattia != null) {
					modifica() ;		// modifica una malattia esistente
				}
				else{
					System.out.println("non esiste alcuna malattia da modificare") ;
				}
				break ;
			case 0 :
				System.out.println("ritorno al menu precedente") ;
				break ;
			}
		}
		while(scelta != 0) ;
	}

	
	public void crea() {		// metodo per la creazione di una malattia
		
		String nome_malattia = InputDati.leggiStringaNonVuota("Inserisci il nome della malattia : ") ;
		
		Date inizio = InputDataCalendario.data("inserisci la data di inizio della malattia (gg/mm/aaaa) :") ;

		Date fine = null ;
		boolean si_no = InputDati.yesOrNo("la malattia è terminata? \n") ;
			if(si_no) {
				fine = InputDataCalendario.data("inserisci la data di fine malattia (gg/mm/aaaa) :") ;
			}
			else {
				System.out.println("le auguriamo una rapida guarigione") ;
			}
		
		String sintomi = InputDati.leggiStringaNonVuota("Inserisci i sintomi della malattia : ") ;
		
		String diagnosi = InputDati.leggiStringaNonVuota("Inserisci la diagnosi della malattia : ") ;
		
		String terapia = InputDati.leggiStringaNonVuota("Inserisci la terapia di cura della malattia : ") ;
		
		// creazione della malattia con i dati inseriti
		malattia = new Malattia (nome_malattia, inizio, fine, sintomi, diagnosi, terapia) ;
		
		System.out.println("malattia creata correttamente.") ;
	}
	
	
	public void modifica() {		// metodo per la modifica di una malattia
		
		// menu scelta
		MyMenu modifica_malattia = new MyMenu ("si scelga ciò che si vuole modificare", new String[] {"data di fine","sintomi","diagnosi","terapia"}) ;
		
		int modifica ;
		
		do {
			modifica = modifica_malattia.scegli() ;	// parametro da modificare
		
			switch (modifica) {
			case 1:
				Date fine = InputDataCalendario.data("inserisci la data di fine malattia (gg/mm/aaaa) :") ;
				malattia.setFine(fine) ;
				break ;
			case 2:
				String sintomi = InputDati.leggiStringaNonVuota("Inserisci i sintomi della malattia aggiornati : ") ;
				malattia.setSintomi(sintomi) ;
				break ;
			case 3:
				String diagnosi = InputDati.leggiStringaNonVuota("Inserisci la diagnosi aggiornata della malattia : ") ;
				malattia.setDiagnosi(diagnosi) ;
				break;
			case 4:
				String terapia = InputDati.leggiStringaNonVuota("Inserisci la terapia aggiornata per la cura della malattia : ") ;
				malattia.setTerapia(terapia) ;
				break ;
			case 0:
				break ;
			}
		}
		while (modifica != 0) ;
		System.out.println("malattia modificata correttamente.") ;
		
	}

	// costruttore
	public Crea_modifica_malattia() {
		super();
	}
	
}
