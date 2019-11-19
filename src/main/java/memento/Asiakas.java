/*
 * Copyright (C) 2019 Pate
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package memento;

import java.util.Scanner;

/**
 *
 * @author Pate
 */
//caretaker
public class Asiakas extends Thread {

    Arvuuttaja arvuuttaja = new Arvuuttaja();
    public String nimi;

    Scanner sc = new Scanner(System.in);
    
    public Asiakas (String nimi) {
        this.nimi = nimi;
    }

    public void run() {
        boolean result;
        while (true) {
            System.out.println("Arvotaan uusi luku väliltä 1 - 10");
            System.out.println(nimi + " Anna arvauksesi väliltä 1 - 10: ");
            int arvaus = sc.nextInt();
            result = arvuuttaja.arvaus(arvuuttaja.liityPeliin(), arvaus);
            if (result) {
                System.out.println("Arvasit oikein " + this.nimi);
                break;
            } else {
                System.out.println("Väärin meni " + this.nimi);
            }
        }

    }

}
