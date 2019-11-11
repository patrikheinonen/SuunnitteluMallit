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
package templateMethod;

import java.util.Random;

/**
 *
 * @author Pate
 */
public class CoinFlip extends Game {

    Random rand = new Random();

    int coinResultP1;
    int coinResultP2;
    String winner;

    @Override
    void initializeGame() {
        //value 2 represents a coin that has not yet been thrown
        coinResultP1 = 2;
        coinResultP2 = 2;
    }

    @Override
    void makePlay(int player) {
        if (player == 1) {
            coinResultP1 = rand.nextInt(2);
        } else {
            coinResultP2 = rand.nextInt(2);
        }
    }

    @Override
    boolean endOfGame() {
        return coinResultP1 == 1 || coinResultP2 == 1;
    }

    @Override
    void printWinner() {
        if (coinResultP1 == 1) {
            System.out.println("Player 1 wins.");
        }
        if (coinResultP2 == 1) {
            System.out.println("Player 2 wins.");
        }
    }

}
