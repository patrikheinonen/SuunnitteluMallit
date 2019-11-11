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
package state;

/**
 *
 * @author Pate
 */
public class Charizard implements Pokemon{

    @Override
    public void open() {
        System.out.println("Charizard appears.");
    }

    @Override
    public void close() {
        System.out.println("Charizard flies away");
    }

    @Override
    public void log() {
        System.out.println("Charizard roars");
    }

    @Override
    public void update() {
        System.out.println("Charizard attacks!");
    }
    
}
