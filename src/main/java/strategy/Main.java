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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pate
 */
public class Main {

    public static void main(String[] args) {
        Context context;
        List<String> stringList = Arrays.asList("Erkki ", "Pekka ", "Salovaara ", "on ", "maailman ", "paras ", "koodari ", "jee. ");
        context = new Context(new Strategy1());
        System.out.println(context.executeStrategy(stringList));
        context = new Context(new Strategy2());
        System.out.println(context.executeStrategy(stringList));
        context = new Context(new Strategy3());
        System.out.println(context.executeStrategy(stringList));
        System.out.println(stringList.size());
    }
}
