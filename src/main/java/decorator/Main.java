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
package decorator;

/**
 *
 * @author Pate
 */
public class Main {

    public static void main(String args[]) {
        //actual pizza is bottom price of 5 that will always charged when buying a pizza
        // also its getString tells that its in fact a pizza
        Pizza pizza = new Pohja(new Kinkku(new Salami(new ActualPizza())));

        System.out.println(pizza.getHinta());
        System.out.println(pizza.preparePizza());

        Pizza pizza2 = new Pohja(new Kinkku(new Salami(new Juusto(new ActualPizza()))));

        System.out.println(pizza2.getHinta());
        System.out.println(pizza2.preparePizza());

        Pizza pizza3 = new Pohja(new Kinkku(new Juusto(new ActualPizza())));

        System.out.println(pizza3.getHinta());
        System.out.println(pizza3.preparePizza());

    }
}