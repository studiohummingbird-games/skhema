/* Place.kt
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
package games.studiohummingbird.skhema.types

import games.studiohummingbird.skhema.properties.*
import games.studiohummingbird.skhema.properties.Event

interface Place
    : Thing
    , Area
    , AreaServed
    , AvailableAtOrFrom
    , BirthPlace
    , ContainedIn
    , ContainedInPlace
    , ContainsPlace
    , ContentLocation
    , Course
    , DeathPlace
    , DropoffLocation
    , EligibleRegion
    , ExerciseCourse
    , FoodEstablishment
    , FoundingLocation
    , FromLocation
    , GameLocation
    , GeoContains
    , GeoCoveredBy
    , GeoCovers
    , GeoCrosses
    , GeoDisjoint
    , GeoEquals
    , GeoIntersects
    , GeoOverlaps
    , GeoTouches
    , GeoWithin
    , HasPOS
    , HomeLocation
    , IneligibleRegion
    , ItemLocation
    , Itinerary
    , JobLocation
    , Location
    , LocationCreated
    , ObservationAbout
    , PickupLocation
    , RegionsAllowed
    , ServiceArea
    , ServiceLocation
    , Spatial
    , SpatialCoverage
    , ToLocation
    , TripOrigin
    , WorkLocation
{
    val additionalProperty: AdditionalProperty?
    val address: Address?
    val aggregateRating: AggregateRating?
    val amenityFeature: AmenityFeature?
    val branchCode: BranchCode?
    val containedInPlace: ContainedInPlace?
    val containsPlace: ContainsPlace?
    val event: Event?
    val faxNumber: FaxNumber?
    val geo: Geo?
    val geoContains: GeoContains?
    val geoCoveredBy: GeoCoveredBy?
    val geoCovers: GeoCovers?
    val geoCrosses: GeoCrosses?
    val geoDisjoint: GeoDisjoint?
    val geoEquals: GeoEquals?
    val geoIntersects: GeoIntersects?
    val geoOverlaps: GeoOverlaps?
    val geoTouches: GeoTouches?
    val geoWithin: GeoWithin?
    val globalLocationNumber: GlobalLocationNumber?
    val hasCertification: HasCertification?
    val hasDriveThroughService: HasDriveThroughService?
    val hasGS1DigitalLink: HasGS1DigitalLink?
    val hasMap: HasMap?
    val isAccessibleForFree: IsAccessibleForFree?
    val isicV4: IsicV4?
    val keywords: Keywords?
    val latitude: Latitude?
    val logo: Logo?
    val longitude: Longitude?
    val maximumAttendeeCapacity: MaximumAttendeeCapacity?
    val openingHoursSpecification: OpeningHoursSpecification?
    val photo: Photo?
    val publicAccess: PublicAccess?
    val review: Review?
    val slogan: Slogan?
    val smokingAllowed: SmokingAllowed?
    val specialOpeningHoursSpecification: SpecialOpeningHoursSpecification?
    val telephone: Telephone?
    val tourBookingPage: TourBookingPage?
}
