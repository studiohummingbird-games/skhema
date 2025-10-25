package games.studiohummingbird.skhema.datatypes

import games.studiohummingbird.skhema.properties.GameLocation
import games.studiohummingbird.skhema.properties.UnitCode

interface URL
    : Text
    , GameLocation
    , UnitCode
