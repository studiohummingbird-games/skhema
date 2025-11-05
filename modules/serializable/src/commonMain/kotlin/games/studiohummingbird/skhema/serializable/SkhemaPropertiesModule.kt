/* SkhemaPropertiesModule.kt
 * Copyright (C) 2025  Zymus
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package games.studiohummingbird.skhema.serializable

import games.studiohummingbird.skhema.properties.*
import games.studiohummingbird.skhema.serializable.datatypes.SerializableText.Companion.serializableText
import games.studiohummingbird.skhema.serializable.types.SerializablePerson.Companion.serializablePerson
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val AdditionalNameModule = SerializersModule {
    polymorphic(AdditionalName::class) {
        serializableText()
    }
}

val AddressModule = SerializersModule {
    polymorphic(Address::class) {
        serializableText()
    }
}

val AddressCountryModule = SerializersModule {
    polymorphic(AddressCountry::class) {
        serializableText()
    }
}

val AddressLocalityModule = SerializersModule {
    polymorphic(AddressLocality::class) {
        serializableText()
    }
}

val ByArtistModule = SerializersModule {
    polymorphic(ByArtist::class) {
        serializablePerson()
    }
}

val ChildrenModule = SerializersModule {
    polymorphic(Children::class) {
        serializablePerson()
    }
}

val FamilyNameModule = SerializersModule {
    polymorphic(FamilyName::class) {
        serializableText()
    }
}

val GivenNameModule = SerializersModule {
    polymorphic(GivenName::class) {
        serializableText()
    }
}

val KeywordsModule = SerializersModule {
    polymorphic(Keywords::class) {
        serializableText()
    }
}

val NameModule = SerializersModule {
    polymorphic(Name::class) {
        serializableText()
    }
}

val ParentModule = SerializersModule {
    polymorphic(Parent::class) {
        serializablePerson()
    }
}

val SkhemaPropertiesModule = SerializersModule {
    include(AdditionalNameModule)
    include(AddressModule)
    include(AddressCountryModule)
    include(AddressLocalityModule)
    include(ByArtistModule)
    include(ChildrenModule)
    include(FamilyNameModule)
    include(GivenNameModule)
    include(KeywordsModule)
    include(NameModule)
    include(ParentModule)
}
