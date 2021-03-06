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


import com.globalretailtech.pos.context.*;

/**
 * Locks a GUI Application by calling the disable
 * keys function of PosContext.
 *
 * @author  Quentin Olson
 */
public class Lock extends PosEvent {

    /** Simple constructor for dynamic load */
    public Lock() {
    }

    public Lock(PosContext context) {
        setContext(context);
    }

    /**
     * Locks keys that should be locked during
     * timeout or terminal lock. Whether to lock
     * or not is determined in the database. Loads
     * the unlock dialog and initiates it.
     */
    public void engage(int value) {

        context().disableKeys();
        context().setLocked(true);
        context().eventStack().loadDialog("UnLock", context());
        context().eventStack().nextEvent();
    }

    /** Validate transistions state */
    public boolean validTransition(String event) {
        return true;
    }

    /** Clear key implementation for this class */
    public void clear() {
    }

    private static String eventname = "Lock";

    /** Return staic name. */
    public String toString() {
        return eventname;
    }

    /** Return staic name. */
    public static String eventName() {
        return eventname;
    }
}


