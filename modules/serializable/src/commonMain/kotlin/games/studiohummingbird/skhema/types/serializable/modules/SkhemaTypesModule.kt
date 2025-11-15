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
package games.studiohummingbird.skhema.types.serializable.modules

import kotlinx.serialization.modules.SerializersModule

val SkhemaTypesModule = SerializersModule {
    include(AccommodationModule)
    include(AchieveActionModule)
    include(ActionModule)
    include(ActivateActionModule)
    include(AgreeActionModule)
    include(AdministrativeAreaModule)
    include(ApartmentModule)
    include(AskActionModule)
    include(AssessActionModule)
    include(AudienceModule)
    include(BefriendActionModule)
    include(CampingPitchModule)
    include(CheckActionModule)
    include(ChooseActionModule)
    include(CityModule)
    include(CommunicateActionModule)
    include(ConsumeActionModule)
    include(ControlActionModule)
    include(CookActionModule)
    include(CountryModule)
    include(CreateActionModule)
    include(DeactivateActionModule)
    include(DefinedTermModule)
    include(DisagreeActionModule)
    include(DiscoverActionModule)
    include(DislikeActionModule)
    include(DrawActionModule)
    include(DrinkActionModule)
    include(EatActionModule)
    include(EndorseActionModule)
    include(FilmActionModule)
    include(FindActionModule)
    include(FollowActionModule)
    include(HotelRoomModule)
    include(HouseModule)
    include(IgnoreActionModule)
    include(InstallActionModule)
    include(IntangibleModule)
    include(InteractActionModule)
    include(JoinActionModule)
    include(LeaveActionModule)
    include(LikeActionModule)
    include(ListenActionModule)
    include(LoseActionModule)
    include(MarryActionModule)
    include(MeetingRoomModule)
    include(MusicGroupModule)
    include(ObservationModule)
    include(PaintActionModule)
    include(PatientModule)
    include(PersonModule)
    include(PhotographActionModule)
    include(PlaceModule)
    include(PlayGameActionModule)
    include(PostalAddressModule)
    include(QuantitativeValueModule)
    include(ReactActionModule)
    include(ReadActionModule)
    include(RegisterActionModule)
    include(ResumeActionModule)
    include(ReviewActionModule)
    include(RoomModule)
    include(SchoolDistrictModule)
    include(SingleFamilyResidenceModule)
    include(StateModule)
    include(StructuredValueModule)
    include(SubscribeActionModule)
    include(SuiteModule)
    include(SuspendActionModule)
    include(ThingModule)
    include(TieActionModule)
    include(TrackActionModule)
    include(UnRegisterActionModule)
    include(UseActionModule)
    include(ViewActionModule)
    include(VoteActionModule)
    include(WantActionModule)
    include(WatchActionModule)
    include(WearActionModule)
    include(WriteActionModule)
    include(WinActionModule)
}
