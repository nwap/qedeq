/* This file is part of the project "Hilbert II" - http://www.qedeq.org
 *
 * Copyright 2000-2013,  Michael Meyling <mime@qedeq.org>.
 *
 * "Hilbert II" is free software; you can redistribute
 * it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 */

package org.qedeq.kernel.se.state;

/**
 * This interface provides constants of this package.
 *
 * @version $Revision: 1.1 $
 * @author Michael Meyling
 */
public interface LoadingImportsStateDescriptions {

    /** Undefined state code. */
    public static final int STATE_CODE_UNDEFINED = 0;

    /** Undefined state description. */
    public static final String STATE_STRING_UNDEFINED = "undefined";

    /** Loading required modules code. */
    public static final int STATE_CODE_LOADING_IMPORTS = 12;

    /** Loading required modules description. */
    public static final String STATE_STRING_LOADING_IMPORTS = "loading imported modules";

    /** Loading required modules code. */
    public static final int STATE_CODE_LOADING_IMPORTS_FAILED = 13;

    /** Loading required modules description. */
    public static final String STATE_STRING_LOADING_IMPORTS_FAILED
        = "loading imported modules failed";

    /** Loading required modules failed code. */
    public static final int STATE_CODE_LOADED_IMPORTED_MODULES = 14;

    /** Loading required modules failed description. */
    public static final String STATE_STRING_LOADED_IMPORTED_MODULES
        = "loaded imported modules";

}
