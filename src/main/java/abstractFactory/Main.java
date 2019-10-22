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
        //omg sain reflektion toimii. Jos se luokka mitä käytät
        //forName metodin parametrina on pakkauksen sisässä
        //pitää parametrin olla muotoa "pakkauksenNimi.LuokanNimi"
        jasper.pueVaatteet("abstractFactory.AdidasTehdas");
        //jasper the java god valmistuu (HURRAA!!!),
        //Parametri kertoo että jasper pukee enää bossin
        //vaatteitta päällensä (insert aurinkolasi coolguy emoji)
        jasper.pueVaatteet("abstractFactory.BossinTehdas");

    }
}
