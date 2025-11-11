/* SkhemaTypesModule.kt
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

import games.studiohummingbird.skhema.serializable.modules.types.*
import kotlinx.serialization.modules.SerializersModule

val SkhemaTypesModule = SerializersModule {
    include(AccommodationModule)
    include(ActionModule)
    include(AdministrativeAreaModule)
    include(ApartmentModule)
    include(AudienceModule)
    include(CampingPitchModule)
    include(CityModule)
    include(CountryModule)
    include(DefinedTermModule)
    include(HotelRoomModule)
    include(HouseModule)
    include(IntangibleModule)
    include(MeetingRoomModule)
    include(MusicGroupModule)
    include(ObservationModule)
    include(PatientModule)
    include(PersonModule)
    include(PlaceModule)
    include(PostalAddressModule)
    include(QuantitativeValueModule)
    include(RoomModule)
    include(SchoolDistrictModule)
    include(SingleFamilyResidenceModule)
    include(StateModule)
    include(StructuredValueModule)
    include(SuiteModule)
    include(ThingModule)
}
