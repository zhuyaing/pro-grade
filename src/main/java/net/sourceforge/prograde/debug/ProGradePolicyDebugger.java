/*
 * #%L
 * pro-grade
 * %%
 * Copyright (C) 2013 - 2014 Ondřej Lukáš, Josef Cacek
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package net.sourceforge.prograde.debug;

/**
 * Class for printing debug information.
 * 
 * @author Ondrej Lukas
 */
public class ProGradePolicyDebugger {

    /**
     * Method for printing debug information to standard output. Method adds "Policy: " before message for printing.
     * 
     * @param log message for printing
     */
    public static void log(String log) {
        System.out.println("Policy: " + log);
    }
}
