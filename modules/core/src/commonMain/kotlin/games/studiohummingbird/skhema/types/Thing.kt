/* Thing.kt
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

import games.studiohummingbird.skhema.annotations.SchemaDslMarker
import games.studiohummingbird.skhema.properties.*

@SchemaDslMarker
interface Thing
    : About
    , ActionOption
    , AggregateElement
    , Category
    , CharacterAttribute
    , games.studiohummingbird.skhema.properties.Collection
    , DataFeedElement
    , DefaultValue
    , Error
    , GameItem
    , GamePlatform
    , Instrument
    , Item
    , ItemListElement
    , ItemReviewed
    , KnowsAbout
    , MainEntity
    , Mentions
    , Object
    , ObservationAbout
    , Option
    , Produces
    , Quest
    , Replacee
    , Replacer
    , RequiredCollateral
    , ReservationFor
    , Result
    , ServiceOutput
    , TargetCollection
{
    val additionalType: AdditionalType?
    val alternateName: AlternateName?
    val description: Description?
    val disambiguationDescription: DisambiguationDescription?
    val identifier: Identifier?
    val image: Image?
    val mainEntityOfPage: MainEntityOfPage?
    val name: Name?
    val potentialAction: PotentialAction?
    val sameAs: SameAs?
    val subjectOf: SubjectOf?
    val url: URL?
}
