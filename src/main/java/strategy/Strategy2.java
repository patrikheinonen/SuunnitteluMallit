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
public class Strategy2 implements ListConvertor {

    private String resultString = "";

    @Override
    public String listToString(List list) {
        String[] itemsArray = new String[list.size()];
        itemsArray = (String[]) list.toArray(itemsArray);
        
        for (int i = 0; i < list.size(); i++) {
            resultString = resultString + itemsArray[i];   
            //jotta voidaan hypätä i = 0 yli. Voi myös tehä samalla tavalla kuin
            //Strategy3:n listToString metodissa
            if ((i + 1) % 2 == 0) {
                resultString = resultString + "\n";
            }
        }
        return resultString;
    }

}
