/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons;

import megamek.common.TechConstants;

/**
 * @author Sebastian Brocks
 */
public class ISRL4 extends RLWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 5679355637948305939L;

    /**
     *
     */
    public ISRL4() {
        super();
        techLevel.put(3071, TechConstants.T_IS_TW_NON_BOX);
        name = "Rocket Launcher 4";
        setInternalName("RL4");
        addLookupName("RL 4");
        addLookupName("ISRocketLauncher4");
        addLookupName("IS RLauncher-4");
        rackSize = 4;
        shortRange = 3;
        mediumRange = 7;
        longRange = 12;
        extremeRange = 14;
        bv = 5;
        introDate = 3050;
        techLevel.put(3050, techLevel.get(3071));
        availRating = new int[] { RATING_X, RATING_X, RATING_B };
        techRating = RATING_E;
    }
}
