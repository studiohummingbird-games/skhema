/* SerializableStructuredValue.kt
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

import games.studiohummingbird.skhema.properties.AdditionalType
import games.studiohummingbird.skhema.properties.AlternateName
import games.studiohummingbird.skhema.properties.Description
import games.studiohummingbird.skhema.properties.DisambiguationDescription
import games.studiohummingbird.skhema.properties.Identifier
import games.studiohummingbird.skhema.properties.Image
import games.studiohummingbird.skhema.properties.MainEntityOfPage
import games.studiohummingbird.skhema.properties.Name
import games.studiohummingbird.skhema.properties.PotentialAction
import games.studiohummingbird.skhema.properties.SameAs
import games.studiohummingbird.skhema.properties.SubjectOf
import games.studiohummingbird.skhema.properties.URL
import games.studiohummingbird.skhema.types.StructuredValue
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass

@Serializable
data class SerializableStructuredValue(
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
: StructuredValue

fun PolymorphicModuleBuilder<StructuredValue>.serializableStructuredValue() {
    subclass(SerializableStructuredValue::class)
}
