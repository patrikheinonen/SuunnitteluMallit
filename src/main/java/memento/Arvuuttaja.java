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

/**
 *
 * @author Pate
 */
import java.util.Random;
//originator
public class Arvuuttaja {
    public boolean arvaus(Memento memento, int arvaus) {
        if (memento.getArvaus() == arvaus) {
            return true;
        } else {
            return false;
        }
    }

    public Memento liityPeliin() {
        return new Memento();
    }

    private class Memento {
        int arvaus;
        Random rand = new Random();
        public Memento() {
            this.arvaus = rand.nextInt(2);
        }
        public int getArvaus(){
            return this.arvaus;
        }
    }
}
