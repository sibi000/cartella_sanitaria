package libreria_sibilia.codicefiscale.document ;

import java.util.HashMap;

/**
 * Created by Matteo on 12/11/2015.
 */
@SuppressWarnings("serial")
public class CitiesCodes_E extends HashMap<String, String> {

    public CitiesCodes_E(){
        this.put("EBOLI","D390");
        this.put("EDOLO","D391");
        this.put("EGNA .NEUMARKT.","D392");
        this.put("ELICE","D394");
        this.put("ELINI","D395");
        this.put("ELLO","D398");
        this.put("ELMAS","D399");
        this.put("ELVA","D401");
        this.put("EMARESE","D402");
        this.put("EMPOLI","D403");
        this.put("ENDINE GAIANO","D406");
        this.put("ENEGO","D407");
        this.put("ENEMONZO","D408");
        this.put("ENNA","C342");
        this.put("ENTRACQUE","D410");
        this.put("ENTRATICO","D411");
        this.put("ENVIE","D412");
        this.put("EPISCOPIA","D414");
        this.put("ERACLEA","D415");
        this.put("ERBA","D416");
        this.put("ERBE'","D419");
        this.put("ERBEZZO","D420");
        this.put("ERBUSCO","D421");
        this.put("ERCHIE","D422");
        this.put("ERCOLANO","H243");
        this.put("ERICE","D423");
        this.put("ERLI","D424");
        this.put("ERTO E CASSO","D426");
        this.put("ERULA","M292");
        this.put("ERVE","D428");
        this.put("ESANATOGLIA","D429");
        this.put("ESCALAPLANO","D430");
        this.put("ESCOLCA","D431");
        this.put("ESINE","D434");
        this.put("ESINO LARIO","D436");
        this.put("ESPERIA","D440");
        this.put("ESPORLATU","D441");
        this.put("ESTE","D442");
        this.put("ESTERZILI","D443");
        this.put("ETROUBLES","D444");
        this.put("EUPILIO","D445");
        this.put("EXILLES","D433");
    }

    public String getKey(String s){
        String res = "";
        for (Entry<String, String> e : this.entrySet()) {
            if(s.equals(e.getValue()))
                res = e.getKey();
        }
        return res;
    }

}
