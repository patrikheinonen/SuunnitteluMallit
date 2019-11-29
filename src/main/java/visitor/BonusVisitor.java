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
package visitor;

/**
 *
 * @author Pate
 */
public class BonusVisitor implements CharacterVisitor {

    @Override
    public void visit(Charmander charmander) {
        System.out.println("Sait 5 pistettä koska olet charmander");
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        System.out.println("Sait 9 pistettä koska olet charmeleon");
    }

    @Override
    public void visit(Charizard charizard) {
         System.out.println("Sait 14 pistettä koska olet charizard");
    }
    
}
