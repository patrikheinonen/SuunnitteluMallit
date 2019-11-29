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
package builder;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Pate
 */
public abstract class BurgerBuilder {

    protected Object burger;
    private List hesburger = new ArrayList();
    private StringBuilder mcDonalds = new StringBuilder();
    
    public Object getHamburger() {
        
        if (burger instanceof List) {
            hesburger = (List) burger;
            for (Object hesburger1 : hesburger) {
                System.out.println(hesburger1.toString());
            }
            return hesburger;
        } else {
            System.out.println(burger.toString());
            mcDonalds = (StringBuilder) burger;
            return mcDonalds;
        }

    }
   
    public void setBurger(Object burger) {
        this.burger = burger;
    }

    public abstract void buildBurger();

    public abstract void buildBun();

    public abstract void buildBeef();

    public abstract void buildSalad();

}
