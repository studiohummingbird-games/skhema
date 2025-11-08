package games.studiohummingbird.skhema.serializable.modules.properties

import games.studiohummingbird.skhema.properties.Risks
import games.studiohummingbird.skhema.serializable.datatypes.serializableText
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val RisksModule = SerializersModule {
    polymorphic(Risks::class) {
        serializableText()
    }
}

