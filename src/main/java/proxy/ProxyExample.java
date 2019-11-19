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
package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pate
 */
class ProxyExample {

    /**
     * Test method
     */
    
    static Scanner sc = new Scanner(System.in);
    public static void main(final String[] arguments) {

        List<Image> kansio = new ArrayList<>();
        Image image1 = new ProxyImage("Aurinko");
        Image image2 = new ProxyImage("Lumi");
        Image image3 = new ProxyImage("Sade");
        Image image4 = new ProxyImage("Vesi");
        
        kansio.add(image1);
        kansio.add(image2);
        kansio.add(image3);
        kansio.add(image4);
        
        for (Image image : kansio) {
            image.showData();
        }
        
        
        
        while (true) {
            System.out.println("Kuinka monetta kuvaa kansiossa haluat katsoa.\n"
                    + " Nolla on ensimmäinen kuva (LOL) ");
            
            kansio.get(sc.nextInt()).displayImage();
            
        }
            
        
    }
}
