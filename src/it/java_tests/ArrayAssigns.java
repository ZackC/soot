/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997 - 2018 Raja Vallée-Rai and others
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
public class ArrayAssigns {

    public static void main(String [] args){
        int [] arr = new int [] {1, 2, 3};
        int i = 0;
        
        D_aa d = new D_aa(9);
        arr[i++] += d.height;
        arr[i++] += d.height;
        //S s = new S(8);
        //D d = new D(9);

        //s.height += d.height;

    }
}
class S {
    int height;
    public S(int i){
        height = i;
    }
}
class D_aa{
    int height;
    public D_aa(int i){
        height = i;
    }
}
