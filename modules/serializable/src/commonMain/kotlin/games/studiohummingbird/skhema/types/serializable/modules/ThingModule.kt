/* ThingModule.kt
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

import games.studiohummingbird.skhema.types.Thing
import games.studiohummingbird.skhema.types.serializable.*
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val ThingModule = SerializersModule {
    polymorphic(Thing::class) {
        serializableAccommodation()
        serializableAchieveAction()
        serializableAction()
        serializableAgreeAction()
        serializableAdministrativeArea()
        serializableApartment()
        serializableAssessAction()
        serializableAudience()
        serializableCampingPitch()
        serializableChooseAction()
        serializableCity()
        serializableConsumeAction()
        serializableCountry()
        serializableDefinedTerm()
        serializableDisagreeAction()
        serializableDislikeAction()
        serializableDrinkAction()
        serializableEatAction()
        serializableEndorseAction()
        serializableHotelRoom()
        serializableHouse()
        serializableIgnoreAction()
        serializableInstallAction()
        serializableIntangible()
        serializableLikeAction()
        serializableListenAction()
        serializableLoseAction()
        serializableMeetingRoom()
        serializableMusicGroup()
        serializableObservation()
        serializablePatient()
        serializablePerson()
        serializablePlace()
        serializablePlayGameAction()
        serializablePostalAddress()
        serializableQuantitativeValue()
        serializableReactAction()
        serializableReadAction()
        serializableReviewAction()
        serializableRoom()
        serializableSchoolDistrict()
        serializableSingleFamilyResidence()
        serializableState()
        serializableStructuredValue()
        serializableSuite()
        serializableThing()
        serializableTieAction()
        serializableUseAction()
        serializableVehicle()
        serializableVoteAction()
        serializableWantAction()
        serializableWinAction()
    }
}
