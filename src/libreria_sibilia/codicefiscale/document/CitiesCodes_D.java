package libreria_sibilia.codicefiscale.document ;

import java.util.HashMap;

/**
 * Created by Matteo on 12/11/2015.
 */
@SuppressWarnings("serial")
public class CitiesCodes_D extends HashMap<String, String> {

    public CitiesCodes_D(){
        this.put("DAIANO","D243");
        this.put("DAIRAGO","D244");
        this.put("DALMINE","D245");
        this.put("DAMBEL","D246");
        this.put("DANTA DI CADORE","D247");
        this.put("DAONE","D248");
        this.put("DARE'","D250");
        this.put("DARFO BOARIO TERME","D251");
        this.put("DASA'","D253");
        this.put("DAVAGNA","D255");
        this.put("DAVERIO","D256");
        this.put("DAVOLI","D257");
        this.put("DAZIO","D258");
        this.put("DECIMOMANNU","D259");
        this.put("DECIMOPUTZU","D260");
        this.put("DECOLLATURA","D261");
        this.put("DEGO","D264");
        this.put("DEIVA MARINA","D265");
        this.put("DELEBIO","D266");
        this.put("DELIA","D267");
        this.put("DELIANUOVA","D268");
        this.put("DELICETO","D269");
        this.put("DELLO","D270");
        this.put("DEMONTE","D271");
        this.put("DENICE","D272");
        this.put("DENNO","D273");
        this.put("DERNICE","D277");
        this.put("DEROVERE","D278");
        this.put("DERUTA","D279");
        this.put("DERVIO","D280");
        this.put("DESANA","D281");
        this.put("DESENZANO DEL GARDA","D284");
        this.put("DESIO","D286");
        this.put("DESULO","D287");
        this.put("DIAMANTE","D289");
        this.put("DIANO ARENTINO","D293");
        this.put("DIANO CASTELLO","D296");
        this.put("DIANO D'ALBA","D291");
        this.put("DIANO MARINA","D297");
        this.put("DIANO SAN PIETRO","D298");
        this.put("DICOMANO","D299");
        this.put("DIGNANO","D300");
        this.put("DIMARO","D302");
        this.put("DIMARO FOLGARIDA","M366");
        this.put("DINAMI","D303");
        this.put("DIPIGNANO","D304");
        this.put("DISO","D305");
        this.put("DIVIGNANO","D309");
        this.put("DIZZASCO","D310");
        this.put("DOBBIACO .TOBLACH.","D311");
        this.put("DOBERDO' DEL LAGO","D312");
        this.put("DOGLIANI","D314");
        this.put("DOGLIOLA","D315");
        this.put("DOGNA","D316");
        this.put("DOLCE'","D317");
        this.put("DOLCEACQUA","D318");
        this.put("DOLCEDO","D319");
        this.put("DOLEGNA DEL COLLIO","D321");
        this.put("DOLIANOVA","D323");
        this.put("DOLO","D325");
        this.put("DOLZAGO","D327");
        this.put("DOMANICO","D328");
        this.put("DOMASO","D329");
        this.put("DOMEGGE DI CADORE","D330");
        this.put("DOMICELLA","D331");
        this.put("DOMODOSSOLA","D332");
        this.put("DOMUS DE MARIA","D333");
        this.put("DOMUSNOVAS","D334");
        this.put("DON","D336");
        this.put("DONATO","D339");
        this.put("DONGO","D341");
        this.put("DONNAS","D338");
        this.put("DONORI","D344");
        this.put("DORGALI","D345");
        this.put("DORIO","D346");
        this.put("DORMELLETTO","D347");
        this.put("DORNO","D348");
        this.put("DORSINO","D349");
        this.put("DORZANO","D350");
        this.put("DOSOLO","D351");
        this.put("DOSSENA","D352");
        this.put("DOSSO DEL LIRO","D355");
        this.put("DOUES","D356");
        this.put("DOVADOLA","D357");
        this.put("DOVERA","D358");
        this.put("DOZZA","D360");
        this.put("DRAGONI","D361");
        this.put("DRAPIA","D364");
        this.put("DRENA","D365");
        this.put("DRENCHIA","D366");
        this.put("DRESANO","D367");
        this.put("DREZZO","D369");
        this.put("DRIZZONA","D370");
        this.put("DRO","D371");
        this.put("DRONERO","D372");
        this.put("DRUENTO","D373");
        this.put("DRUOGNO","D374");
        this.put("DUALCHI","D376");
        this.put("DUBINO","D377");
        this.put("DUE CARRARE","M300");
        this.put("DUEVILLE","D379");
        this.put("DUGENTA","D380");
        this.put("DUINO AURISINA","D383");
        this.put("DUMENZA","D384");
        this.put("DUNO","D385");
        this.put("DURAZZANO","D386");
        this.put("DURONIA","C772");
        this.put("DUSINO SAN MICHELE","D388");
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
