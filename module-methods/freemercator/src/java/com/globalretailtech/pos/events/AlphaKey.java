/*
 * Copyright (C) 2001 Global Retail Technology, LLC
 * <http://www.globalretailtech.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package com.globalretailtech.pos.events;


/**
 * Alpha character input from the user.
 *
 * @author  Quentin Olson
 */
public class AlphaKey extends NumKey {

    /** Simple constructor for dynamic load */
    public AlphaKey() {
    }

    /**
     * Append this charcter to the end of the input and
     * update displays.
     */
    public void engage(int value) {

		PosEvent currEvent = context().eventStack().event();
		
		if (value >= 0) {
			context().addToInput((char)value);
			if (currEvent instanceof PosNumberDialog) {

				PosNumberDialog numberDialog = (PosNumberDialog) currEvent;
				promptText = numberDialog.promptText();
			}else{	
				promptText = "";
			}
			numText = context().inputLine();
		}
		context().operPrompt().update(this);
    }

    /** Validate transistions state */
    public boolean validTransition(String event) {
        return true;
    }

    /** Clear key implementation for this class */
    public void clear() {
    }

    /** Always return true. */
    public boolean checkProfile(int event) {
        return true;
    }

    private static String eventname = "AlphaKey";

    /** Return staic name. */
    public String toString() {
        return eventname;
    }

    /** Return staic name. */
    public static String eventName() {
        return eventname;
    }
}


