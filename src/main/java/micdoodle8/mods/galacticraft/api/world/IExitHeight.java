/*
 * Copyright (c) 2023 Team Galacticraft
 *
 * Licensed under the MIT license.
 * See LICENSE file in the project root for details.
 */

package micdoodle8.mods.galacticraft.api.world;

/**
 * For world providers where you would like to specify height for spacecraft to
 * be teleported <p> Implement into world providers
 */
public interface IExitHeight
{

    /**
     * @return y-coordinate that spacecraft leaves the dimension
     */
    double getYCoordinateToTeleport();
}
