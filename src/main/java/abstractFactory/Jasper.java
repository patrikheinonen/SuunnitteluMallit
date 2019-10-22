/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import java.util.*;

/**
 *
 * @author Pate
 */
public class Jasper {

    //vl = vaatelista
    ArrayList<Vaate> vl = new ArrayList<>();
    
    public void pueVaatteet(boolean valmistunut) {
        //pitää ottaa vaatteet pois
        vl.clear();
        
        AbstractFactory tehdas = FactoryProducer.getFactory(valmistunut);
        Vaate farkut = tehdas.getVaate("farkut");
        Vaate kengät = tehdas.getVaate("kengät");
        Vaate lippis = tehdas.getVaate("lippis");
        Vaate tpaita = tehdas.getVaate("tpaita");
        
        //MITEN TÄÄ addaus tehdään kauniisti.
        
        vl.add(farkut);
        vl.add(kengät);
        vl.add(lippis);
        vl.add(tpaita);
        
        for (Vaate vaate : vl) {
            System.out.println(vaate.toString());
        }
    }

}
