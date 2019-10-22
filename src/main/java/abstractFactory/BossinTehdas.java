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
public class BossinTehdas extends AbstractFactory{

    private final String merkki = "Boss";
    
    @Override
    public Vaate getVaate(String vaate) {
        if (vaate.equalsIgnoreCase("Farkut")) {
            return new Farkut(merkki);
        } else if (vaate.equalsIgnoreCase("Kengät")) {
            return new Kengät(merkki);
        } else if (vaate.equalsIgnoreCase("Lippis")) {
            return new Lippis(merkki);
        } else if (vaate.equalsIgnoreCase("Tpaita")) {
            return new Tpaita(merkki);
        } 
        //voisi olla myös else return null; mutta mielestäni tämä selvempi.
        return null;
    }
    
}
