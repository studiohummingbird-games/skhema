/* SerializablePlace.kt
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
package games.studiohummingbird.skhema.serializable.types

import games.studiohummingbird.skhema.properties.*
import games.studiohummingbird.skhema.types.Place
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass

data class SerializablePlace(
    override val additionalProperty: AdditionalProperty? = null,
    override val address: Address? = null,
    override val aggregateRating: AggregateRating? = null,
    override val amenityFeature: AmentityFeature? = null,
    override val branchCode: BranchCode? = null,
    override val containedInPlace: ContainedInPlace? = null,
    override val containsPlace: ContainsPlace? = null,
    override val event: Event? = null,
    override val faxNumber: FaxNumber? = null,
    override val geo: Geo? = null,
    override val geoContains: GeoContains? = null,
    override val geoCoveredBy: GeoCoveredBy? = null,
    override val geoCovers: GeoCovers? = null,
    override val geoCrosses: GeoCrosses? = null,
    override val geoDisjoint: GeoDisjoint? = null,
    override val geoEquals: GeoEquals? = null,
    override val geoIntersects: GeoIntersects? = null,
    override val geoOverlaps: GeoOverlaps? = null,
    override val geoTouches: GeoTouches? = null,
    override val geoWithin: GeoWithin? = null,
    override val globalLocationNumber: GlobalLocationNumber? = null,
    override val hasCertification: HasCertification? = null,
    override val hasDriveThroughService: HasDriveThroughService? = null,
    override val hasGS1DigitalLink: HasGS1DigitalLink? = null,
    override val hasMap: HasMap? = null,
    override val isAccessibleForFree: IsAccessibleForFree? = null,
    override val isicV4: IsicV4,
    override val keywords: Keywords? = null,
    override val latitude: Latitude? = null,
    override val logo: Logo? = null,
    override val longitude: Longitude? = null,
    override val maximumAttendeeCapacity: MaximumAttendeeCapacity? = null,
    override val openingHoursSpecification: OpeningHoursSpecification? = null,
    override val photo: Photo? = null,
    override val publicAccess: PublicAccess? = null,
    override val review: Review,
    override val slogan: Slogan? = null,
    override val smokingAllowed: SmokingAllowed? = null,
    override val specialOpeningHoursSpecification: SpecialOpeningHoursSpecification? = null,
    override val telephone: Telephone? = null,
    override val tourBookingPage: TourBookingPage? = null,
    override val additionalType: AdditionalType? = null,
    override val alternateName: AlternateName? = null,
    override val description: Description? = null,
    override val disambiguationDescription: DisambiguationDescription? = null,
    override val identifier: Identifier? = null,
    override val image: Image? = null,
    override val mainEntityOfPage: MainEntityOfPage? = null,
    override val name: Name? = null,
    override val potentialAction: PotentialAction? = null,
    override val sameAs: SameAs? = null,
    override val subjectOf: SubjectOf? = null,
    override val url: URL? = null
)
: Place

fun PolymorphicModuleBuilder<Place>.serializablePlace() {
    subclass(SerializablePlace::class)
}
