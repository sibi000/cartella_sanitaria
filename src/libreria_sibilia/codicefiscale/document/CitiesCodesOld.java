package libreria_sibilia.codicefiscale.document ;

import libreria_sibilia.codicefiscale.utils.Utils;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Matteo on 12/11/2015.
 *
 * Adattado per il nostro caso
 */
@SuppressWarnings("serial")
public class CitiesCodes extends TreeMap<String, String> {

    CitiesCodes_A ccA = new CitiesCodes_A();
    CitiesCodes_B ccB = new CitiesCodes_B();
    CitiesCodes_C ccC = new CitiesCodes_C();
    CitiesCodes_D ccD = new CitiesCodes_D();
    CitiesCodes_E ccE = new CitiesCodes_E();
    CitiesCodes_F ccF = new CitiesCodes_F();
    CitiesCodes_G ccG = new CitiesCodes_G();
    CitiesCodes_I ccI = new CitiesCodes_I();
    CitiesCodes_LMN ccLMN = new CitiesCodes_LMN();
    CitiesCodes_OPQ ccOPQ = new CitiesCodes_OPQ();
    CitiesCodes_RST ccRST = new CitiesCodes_RST();
    CitiesCodes_UVZ ccUVZ = new CitiesCodes_UVZ();
    public CitiesCodes(){
        this.putAll(ccA);
        this.putAll(ccB);
        this.putAll(ccC);
        this.putAll(ccD);
        this.putAll(ccE);
        this.putAll(ccF);
        this.putAll(ccG);
        this.putAll(ccI);
        this.putAll(ccLMN);
        this.putAll(ccOPQ);
        this.putAll(ccRST);
        this.putAll(ccUVZ);
    }

    public String getKey(String s){
        String res = Utils.ERROR;
        for (Map.Entry<String, String> e : this.entrySet()) {
            if(s.equals(e.getValue()))
                res = e.getKey();
        }
        return res;
    }
    


}
