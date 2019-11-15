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
package strategy;

import java.util.List;

/**
 *
 * @author Pate
 */
public class Strategy3 implements ListConvertor {

    private String resultString = "";

    @Override
    public String listToString(List list) {
        //Tässä sitten taas alotetaan i = 1 ja getissä haetaan i-1
        //jotta jokainen alkio pääsee mukaan. Voisi myös tehdä samalla tavalla kuin
        //Strategy2:n listToString metodissa.
        //i <= tavalla i kasvatetaan yhtä isoksi kuin list size
        //jos otat tästä pois i<= ja laitat i< niin i jää yhden pienemmäksi kuin listsize
        //eli tässä tehtävässä kävisi niin, että viimeinen get olisi get(7-1) eli get(6) jolloin vika
        //alkio joka on sijainnissa 7 jäisi pois laskuista koska 7<8.
        for (int i = 1; i <= list.size(); i++) {
            resultString = resultString + list.get(i - 1);
            
            if (i  % 3 == 0) {
                resultString = resultString + "\n";
            }
        }

        return resultString;

    }

}
