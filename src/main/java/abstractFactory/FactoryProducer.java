    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;


/**
 *
 * @author Pate
 */
public class FactoryProducer {
    
    //Staattinen koska luokasta on turha tehdä ilmentymää.
    public static AbstractFactory getFactory(String nimi) {
        try {
            Class c = Class.forName(nimi);
            //olennaista, että try lohkoa käytetään koska toi forName voi heittää erroria.
            //ja newInstance heittää erroria
            //kun me odotetaan tässä kuitenkin AINA tietynlaista oliota.
            AbstractFactory s = (AbstractFactory)c.newInstance();
            return  s;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {

        }
        return null;
    }

    
}
