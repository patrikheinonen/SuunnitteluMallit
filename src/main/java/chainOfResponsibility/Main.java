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
package chainOfResponsibility;

import java.util.Scanner;

/**
 *
 * @author Pate
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LähiEsiMies lähiEsiMies = new LähiEsiMies();
        Päällikkö päällikkö = new Päällikkö();
        Toimari toimari = new Toimari();
        lähiEsiMies.setNextPayRaiser(päällikkö);
        päällikkö.setNextPayRaiser(toimari);
        //lisäsin sulle tän loopin nii voit helposti testata toimiiko oikein.
        while (true) {
            System.out.println("Kuinka suuri palkankorotus saisi olla: ");
            lähiEsiMies.handleRaiseRequest(sc.nextDouble());
        }

    }
}
