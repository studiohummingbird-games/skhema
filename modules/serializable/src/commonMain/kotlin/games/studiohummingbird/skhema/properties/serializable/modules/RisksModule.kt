package games.studiohummingbird.skhema.properties.serializable.modules

import games.studiohummingbird.skhema.datatypes.serializable.serializableText
import games.studiohummingbird.skhema.properties.Risks
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val RisksModule = SerializersModule {
    polymorphic(Risks::class) {
        serializableText()
    }
}

