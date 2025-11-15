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
        serializableActivateAction()
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
        serializableControlAction()
        serializableCookAction()
        serializableCountry()
        serializableCreateAction()
        serializableDeactivateAction()
        serializableDefinedTerm()
        serializableDisagreeAction()
        serializableDislikeAction()
        serializableDrawAction()
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
        serializableResumeAction()
        serializableReviewAction()
        serializableRoom()
        serializableSchoolDistrict()
        serializableSingleFamilyResidence()
        serializableState()
        serializableStructuredValue()
        serializableSuite()
        serializableSuspendAction()
        serializableThing()
        serializableTieAction()
        serializableUseAction()
        serializableVehicle()
        serializableViewAction()
        serializableVoteAction()
        serializableWantAction()
        serializableWatchAction()
        serializableWearAction()
        serializableWinAction()
    }
}
