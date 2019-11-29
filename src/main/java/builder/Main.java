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
package builder;

/**
 *
 * @author Pate
 */
public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        BurgerBuilder mcDonalds = new McDonalds();
        BurgerBuilder hesburger = new Hesburger();

        //mäkkäri tulostuu yhelle riville koska kutsutaan stringbuilder to string
        //hese tulostuu usealle koska for looppi ja println tulostaa tyhjän rivin aina loppuun
        waiter.setBurgerBuilder(hesburger);
        waiter.constructBurger();

        waiter.getBurger();

    }
}
