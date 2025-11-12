package games.studiohummingbird.skhema.datatypes

import games.studiohummingbird.skhema.properties.*
import games.studiohummingbird.skhema.properties.URL

interface URL
    : Text
    , GameLocation
    , Image
    , Keywords
    , URL
    , UnitCode
