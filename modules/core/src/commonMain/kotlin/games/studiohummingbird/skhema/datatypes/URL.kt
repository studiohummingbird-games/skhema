package games.studiohummingbird.skhema.datatypes

import games.studiohummingbird.skhema.properties.GameLocation
import games.studiohummingbird.skhema.properties.Image
import games.studiohummingbird.skhema.properties.Keywords
import games.studiohummingbird.skhema.properties.URL
import games.studiohummingbird.skhema.properties.UnitCode

interface URL
    : Text
    , GameLocation
    , Image
    , Keywords
    , URL
    , UnitCode
