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
    public static AbstractFactory getFactory(boolean boss) {
        if (boss) {
            return new BossinTehdas();
        } else {
            return new AdidasTehdas();
        }
    }
}
