package libreria_sibilia.codicefiscale.document ;

import java.util.HashMap;

/**
 * Created by Matteo on 12/11/2015.
 */
@SuppressWarnings("serial")
public class CitiesCodes_I extends HashMap<String, String> {

    public CitiesCodes_I(){
        this.put("IDRO","E280");
        this.put("IGLESIAS","E281");
        this.put("IGLIANO","E282");
        this.put("ILBONO","E283");
        this.put("ILLASI","E284");
        this.put("ILLORAI","E285");
        this.put("IMBERSAGO","E287");
        this.put("IMER","E288");
        this.put("IMOLA","E289");
        this.put("IMPERIA","E290");
        this.put("IMPRUNETA","E291");
        this.put("INARZO","E292");
        this.put("INCISA IN VAL D'ARNO","E296");
        this.put("INCISA SCAPACCINO","E295");
        this.put("INCUDINE","E297");
        this.put("INDUNO OLONA","E299");
        this.put("INGRIA","E301");
        this.put("INTRAGNA","E304");
        this.put("INTROBIO","E305");
        this.put("INTROD","E306");
        this.put("INTRODACQUA","E307");
        this.put("INTROZZO","E308");
        this.put("INVERIGO","E309");
        this.put("INVERNO E MONTELEONE","E310");
        this.put("INVERSO PINASCA","E311");
        this.put("INVERUNO","E313");
        this.put("INVORIO","E314");
        this.put("INZAGO","E317");
        this.put("IONADI","E321");
        this.put("IRGOLI","E323");
        this.put("IRMA","E325");
        this.put("IRSINA","E326");
        this.put("ISASCA","E327");
        this.put("ISCA SULLO IONIO","E328");
        this.put("ISCHIA","E329");
        this.put("ISCHIA DI CASTRO","E330");
        this.put("ISCHITELLA","E332");
        this.put("ISEO","E333");
        this.put("ISERA","E334");
        this.put("ISERNIA","E335");
        this.put("ISILI","E336");
        this.put("ISNELLO","E337");
        this.put("ISOLA D'ASTI","E338");
        this.put("ISOLA DEL CANTONE","E341");
        this.put("ISOLA DEL GIGLIO","E348");
        this.put("ISOLA DEL GRAN SASSO D'ITALIA","E343");
        this.put("ISOLA DEL LIRI","E340");
        this.put("ISOLA DEL PIANO","E351");
        this.put("ISOLA DELLA SCALA","E349");
        this.put("ISOLA DELLE FEMMINE","E350");
        this.put("ISOLA DI CAPO RIZZUTO","E339");
        this.put("ISOLA DI FONDRA","E353");
        this.put("ISOLA DOVARESE","E356");
        this.put("ISOLA RIZZA","E358");
        this.put("ISOLA SANT'ANTONIO","E360");
        this.put("ISOLA VICENTINA","E354");
        this.put("ISOLABELLA","E345");
        this.put("ISOLABONA","E346");
        this.put("ISOLE TREMITI","E363");
        this.put("ISORELLA","E364");
        this.put("ISPANI","E365");
        this.put("ISPICA","E366");
        this.put("ISPRA","E367");
        this.put("ISSIGLIO","E368");
        this.put("ISSIME","E369");
        this.put("ISSO","E370");
        this.put("ISSOGNE","E371");
        this.put("ISTRANA","E373");
        this.put("ITALA","E374");
        this.put("ITRI","E375");
        this.put("ITTIREDDU","E376");
        this.put("ITTIRI","E377");
        this.put("IVANO FRACENA","E378");
        this.put("IVREA","E379");
        this.put("IZANO","E380");
        this.put("JACURSO","E274");
        this.put("JELSI","E381");
        this.put("JENNE","E382");
        this.put("JERAGO CON ORAGO","E386");
        this.put("JERZU","E387");
        this.put("JESI","E388");
        this.put("JESOLO","C388");
        this.put("JOLANDA DI SAVOIA","E320");
        this.put("JOPPOLO","E389");
        this.put("JOPPOLO GIANCAXIO","E390");
        this.put("JOVENCAN","E391");
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
