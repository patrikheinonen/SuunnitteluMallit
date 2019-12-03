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
package prototype;

/**
 *
 * @author Pate
 */
public class Clock implements Cloneable {

    public HourHand hourHand;
    public MinuteHand minuteHand;
    public SecondHand secondHand;

    public Clock() {
        hourHand = new HourHand();
        minuteHand = new MinuteHand();
        secondHand = new SecondHand();
    }

    public void setTime(int hours, int minutes, int seconds) {
        hourHand.setHours(hours);
        minuteHand.setMinutes(minutes);
        secondHand.setSeconds(seconds);
    }

    public void getNoobTime() {
        System.out.println("Hour: " + hourHand.getHours() + " Minutes: " + minuteHand.getMinutes() + " Seconds: " + secondHand.getSeconds());
    }

    public void getFlowOfTime() {

        secondHand.addSeconds();
        if (secondHand.getSeconds() == 60) {
            secondHand.zeroDown();
            minuteHand.addMinutes();
        }
        if (minuteHand.getMinutes() == 60) {
            minuteHand.zeroDown();
            hourHand.addHours();
        }
        if (hourHand.getHours() == 24) {
            hourHand.zeroDown();
        }

        System.out.println("Hour: " + hourHand.getHours() + " Minutes: " + minuteHand.getMinutes() + " Seconds: " + secondHand.getSeconds());
    }

    public Clock clone() {
        Clock clock = null;

        try {
            clock = (Clock) super.clone();
            clock.hourHand = (HourHand)hourHand.clone();
            clock.minuteHand = (MinuteHand)minuteHand.clone();
            clock.secondHand = (SecondHand)secondHand.clone();
            
        } catch (CloneNotSupportedException e) {
        }
        return clock;
    }

}
