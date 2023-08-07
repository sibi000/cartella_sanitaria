package libreria_sibilia;

import java.util.Scanner;

public class InputStringa {

	private final static String ERRORE_STRINGA_VUOTA= "Attenzione: non hai inserito alcun carattere";
    private final static String ERRORE_CARATTERI_ALFABETICI= "Attenzione: deve essere una parola composta da caratteri alfabetici";
    private final static String ERRORE_CARATTERI_NUMERICI= "Attenzione: deve essere una sequenza di caratteri numerici [0-9]";
    private static Scanner lettore = creaScanner();
    private static Scanner creaScanner ()
    {
        Scanner creato = new Scanner(System.in);
        creato.useDelimiter(System.getProperty("line.separator"));
        return creato;
    }
    public static String leggiStringaAlfabetica (String messaggio)
    {
        boolean finito;
        String lettura = null;
        do
        {
            finito=true;
            System.out.print(messaggio);
            lettura = lettore.nextLine();
            lettura = lettura.trim();
            if (lettura.length() > 0) {
                for (char c: lettura.toCharArray()){
                    if (!((c>='a') && (c<='z') || (c>='A') && (c<='Z'))){
                        finito=false;
                    }
                }
                if(finito){
                    return lettura;
                }
                else{
                    System.out.println(ERRORE_CARATTERI_ALFABETICI);
                }
            }
            else {
                finito=false;
                System.out.println(ERRORE_STRINGA_VUOTA);
            }
        } 
        while (!finito);

        return lettura;
    }

    public static String leggiStringaNumerica (String messaggio)
    {
        boolean finito;
        String lettura = null;
        do
        {
            finito=true;
            System.out.print(messaggio);
            lettura = lettore.nextLine();
            lettura = lettura.trim();
            if (lettura.length() > 0) {
                for (char c: lettura.toCharArray()){
                    if (!((c>='0') && (c<='9'))){
                        finito=false;
                    }
                }
                if(finito){
                    return lettura;
                }
                else{
                    System.out.println(ERRORE_CARATTERI_NUMERICI);
                }
            }
            else {
                finito=false;
                System.out.println(ERRORE_STRINGA_VUOTA);
            }
        } 
        while (!finito);

        return lettura;
    }
}