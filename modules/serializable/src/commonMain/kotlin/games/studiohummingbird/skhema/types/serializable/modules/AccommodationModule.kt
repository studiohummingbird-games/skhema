/* AccommodationModule.kt
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
package games.studiohummingbird.skhema.types.serializable.modules

import games.studiohummingbird.skhema.types.Accommodation
import games.studiohummingbird.skhema.types.serializable.serializableAccommodation
import games.studiohummingbird.skhema.types.serializable.serializableApartment
import games.studiohummingbird.skhema.types.serializable.serializableCampingPitch
import games.studiohummingbird.skhema.types.serializable.serializableHotelRoom
import games.studiohummingbird.skhema.types.serializable.serializableHouse
import games.studiohummingbird.skhema.types.serializable.serializableMeetingRoom
import games.studiohummingbird.skhema.types.serializable.serializableRoom
import games.studiohummingbird.skhema.types.serializable.serializableSingleFamilyResidence
import games.studiohummingbird.skhema.types.serializable.serializableSuite
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val AccommodationModule = SerializersModule {
    polymorphic(Accommodation::class) {
        serializableAccommodation()
        serializableApartment()
        serializableCampingPitch()
        serializableHotelRoom()
        serializableHouse()
        serializableMeetingRoom()
        serializableRoom()
        serializableSingleFamilyResidence()
        serializableSuite()
    }
}
