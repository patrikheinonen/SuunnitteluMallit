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
public class Lippis extends VaatteenStatsit implements Vaate {

    public Lippis(String merkki) {
        super.merkki = merkki;
    }

    @Override
    public String toString() {
        return this.merkki;
    }
}
