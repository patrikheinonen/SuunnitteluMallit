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
package observer;

import java.util.Timer;



/**
 *
 * @author Pate
 */
public class KelloMaini {
    public static void main (String[] args) {
        ClockTimer clockTimer = new ClockTimer();
        Timer timer = new Timer(); //eli timerEvent olion avulla voi schedulee
        //asioita. Koska clocktimer on subject ja subject on timeTtask
        //on clocktimer myös timerTask. clockTimeri annetaan parametrina
        //Timerin schedule metodille joka ajaa siis timerTaskin run methodia
        //haluamallasi määreillä.
        
        //digitalClockkia ei tarvitse mihkää. Koska luokka pitää vaan luoda jotta
        //sille voidaan antaa clockTimer ja clockTimeri sit osaa kuttsua kaikkee kivasti.
        //ei jaksa selittää katso itse.
        
        DigitalClock digitalClock = new DigitalClock(clockTimer);
        
        timer.schedule(clockTimer, 0, 1000);
        
        
    }
    
}
