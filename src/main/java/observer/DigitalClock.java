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

/**
 *
 * @author Pate
 */
public class DigitalClock implements Observer{
    private ClockTimer timer;
    
    public DigitalClock (ClockTimer ct) {
        timer = ct;
        timer.attach(this);
    }
    @Override
    public void update(Subject s) {
        if (s == timer) {
            draw();
        }
    }
    
    private void draw(){
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println(hour + "." + minute + "."+ second);
    }
    
}
