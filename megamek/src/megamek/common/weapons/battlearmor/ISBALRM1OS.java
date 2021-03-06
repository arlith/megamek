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
package megamek.common.weapons.battlearmor;

import megamek.common.TechConstants;
import megamek.common.weapons.LRMWeapon;


/**
 * @author Sebastian Brocks
 */
public class ISBALRM1OS extends LRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -5976936994611000430L;

    /**
     *
     */
    public ISBALRM1OS() {
        super();
        techLevel.put(3071, TechConstants.T_IS_TW_NON_BOX);
        name = "LRM 1 (OS)";
        setInternalName("ISBALRM1OS");
        addLookupName("IS BA LRM1 OS");
        rackSize = 1;
        minimumRange = 6;
        bv = 3;
        cost = 3000;
        tonnage = .04f;
        criticals = 3;
        introDate = 3057;
        techLevel.put(3057, techLevel.get(3071));
        availRating = new int[] { RATING_X, RATING_X, RATING_E };
        techRating = RATING_E;
        flags = flags.or(F_NO_FIRES).or(F_BA_WEAPON).or(F_ONESHOT).andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_AERO_WEAPON).andNot(F_PROTO_WEAPON);
    }
}
