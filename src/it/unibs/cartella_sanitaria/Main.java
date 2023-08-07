package it.unibs.cartella_sanitaria;

import it.unibs.fp.mylib.MyMenu;

public class Main {

	public static void main(String[] args) {
		
	MyMenu start_program = new MyMenu ("benvenuto nella cartella sanitaria, cosa desidera fare?" , new String[] {"Crea/modifica paziente",
																											"Crea/modifica malattia",
																											"Crea/modifica esame"}) ;
	
	int scelta ;
	do {
		scelta = start_program.scegli() ;
		switch(scelta){
		case 1:
			Crea_modifica_paziente crea_modifica_paziente = new Crea_modifica_paziente() ;
			crea_modifica_paziente.scegliere() ;
			break ;
		case 2:
			Crea_modifica_malattia crea_modifica_malattia = new Crea_modifica_malattia() ;
			crea_modifica_malattia.scegliere() ;
			break ;
		case 3:
			
			break ;
			
			
		case 0:
			System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n") ;
			System.out.println("grazie e arrivederci!") ;
			System.out.close();
			break ;
		}
		
	}
	while(scelta != 0) ;

		
	}

}
