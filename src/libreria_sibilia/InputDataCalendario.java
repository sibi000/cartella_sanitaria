package libreria_sibilia;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import it.unibs.fp.mylib.InputDati;

public class InputDataCalendario {
	
	public static Date data (String messaggio) {
		
		String d_i ;
		Date data = null;
		//si procura la data sotto forma di una stringa nel formato SHORT
		//converte la stringa della data in un oggetto di classe Date
		do{
			d_i = InputDati.leggiStringaNonVuota(messaggio) ;
			DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
			//imposta che i calcoli di conversione della data siano rigorosi       
			formatoData.setLenient(false);           
			try {
				data = formatoData.parse(d_i);
			} catch (ParseException e) {
				System.out.println("Formato data non valido.");
			}
		} while (data == null ) ;
		//visualizza la data non formattata (sfruttando implicitamente il metodo toString dell'oggetto)
		// System.out.println(data);
		
		return data ;
	}

}
