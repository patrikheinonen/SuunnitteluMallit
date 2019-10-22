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
public class Main {
    
    public static void main(String[] args) {
        

        Jasper jasper = new Jasper();
        jasper.pueVaatteet(false);
        //jasper the java god valmistuu,
        //(HURRAA!!!) eli parametri valmistunut = true;
        //jasperiin ei tarvitse tehdä YHTÄKÄÄN muutosta.
        
        jasper.pueVaatteet(true);
        

        
    }
}
