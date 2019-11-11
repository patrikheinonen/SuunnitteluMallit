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
public class Controller {

    public static Charizard charizard;
    public static Charmeleon charmeleon;
    public static Charmander charmander;

    private static Pokemon pokemon;

    public Controller() {
        charizard = new Charizard();
        charmeleon = new Charmeleon();
        charmander = new Charmander();
    }

    public void setCharizardPokemon() {
        pokemon = charizard;
    }

    public void setCharmeleonPokemon() {
        pokemon = charmeleon;
    }

    public void setCharmanderPokemon() {
        pokemon = charmander;
    }

    public void open() {
        pokemon.open();
    }

    public void close() {
        pokemon.close();
    }

    public void log() {
        pokemon.log();
    }

    public void update() {
        pokemon.update();
    }

}
