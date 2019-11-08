    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 *
 * @author Pate
 */
public class FactoryProducer {
    
    //Staattinen koska luokasta on turha tehdä ilmentymää.
    public static AbstractFactory getFactory() throws FileNotFoundException, IOException {
        Properties properties = new Properties();

        try {
            properties.load(
                    new FileInputStream("C:\\SuunnitteluMallit\\Suunnittelu\\src\\main\\java\\abstractFactory\\tehdas.properties"));
            //vaiha propeties tiedotossa tehtaannimi avaimen valueta jos haluat adidaksen tehtaan,
            Class c = Class.forName(properties.getProperty("tehtaannimi"));
     
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
