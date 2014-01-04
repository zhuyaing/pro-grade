/** Copyright 2013 Ondrej Lukas
  *
  * This file is part of pro-grade.
  *
  * Pro-grade is free software: you can redistribute it and/or modify
  * it under the terms of the GNU Lesser General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  *
  * Pro-grade is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU Lesser General Public License for more details.
  *
  * You should have received a copy of the GNU Lesser General Public License
  * along with pro-grade.  If not, see <http://www.gnu.org/licenses/>.
  *
  */
package net.sourceforge.prograde.debug;

/**
 * Class for printing debug information.
 * 
 * @author Ondrej Lukas
 */
public class ProgradePolicyDebugger {

    /**
     * Method for printing debug information to standard output. Method adds "Policy: " before message for printing.
     * 
     * @param log message for printing
     */
    public static void log(String log) {
        System.out.println("Policy: " + log);
    }
}
