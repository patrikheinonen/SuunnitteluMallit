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
public class Kinkku extends PizzaDecorator {

    public Kinkku(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String preparePizza() {
        return super.preparePizza() + " Kinkku ";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + 2.0;
    }
}
