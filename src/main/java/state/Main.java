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

import java.util.Scanner;

/**
 *
 * @author Pate
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    Controller controller;

    public void StatePatternDemo(String con) {
        controller = new Controller();
        //the following trigger should be made by the user  
        if (con.equalsIgnoreCase("Charizard")) {
            controller.setCharizardPokemon();
        }
        if (con.equalsIgnoreCase("Charmeleon")) {
            controller.setCharmeleonPokemon();
        }
        if (con.equalsIgnoreCase("Charmander")) {
            controller.setCharmanderPokemon();
        }
        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }

    public static void main(String args[]) {
        
        String form;
        boolean loopCondition = true;
        Main main = new Main();

        while (loopCondition) {
            System.out.println("Give the form of the pokemon");
            form = sc.nextLine();
            if (form.equalsIgnoreCase("1")) {
                loopCondition = false;
            }
            main.StatePatternDemo(form);
            

        }

    }
}
