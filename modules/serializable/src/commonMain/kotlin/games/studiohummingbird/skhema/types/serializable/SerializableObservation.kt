/* SerializableObservation.kt
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
package games.studiohummingbird.skhema.types.serializable

import games.studiohummingbird.skhema.properties.AdditionalProperty
import games.studiohummingbird.skhema.properties.AdditionalType
import games.studiohummingbird.skhema.properties.AlternateName
import games.studiohummingbird.skhema.properties.Description
import games.studiohummingbird.skhema.properties.DisambiguationDescription
import games.studiohummingbird.skhema.properties.Identifier
import games.studiohummingbird.skhema.properties.Image
import games.studiohummingbird.skhema.properties.MainEntityOfPage
import games.studiohummingbird.skhema.properties.MarginOfError
import games.studiohummingbird.skhema.properties.MaxValue
import games.studiohummingbird.skhema.properties.MeasuredProperty
import games.studiohummingbird.skhema.properties.MeasurementDenominator
import games.studiohummingbird.skhema.properties.MeasurementMethod
import games.studiohummingbird.skhema.properties.MeasurementQualifier
import games.studiohummingbird.skhema.properties.MeasurementTechnique
import games.studiohummingbird.skhema.properties.MinValue
import games.studiohummingbird.skhema.properties.Name
import games.studiohummingbird.skhema.properties.ObservationAbout
import games.studiohummingbird.skhema.properties.ObservationDate
import games.studiohummingbird.skhema.properties.ObservationPeriod
import games.studiohummingbird.skhema.properties.PotentialAction
import games.studiohummingbird.skhema.properties.SameAs
import games.studiohummingbird.skhema.properties.SubjectOf
import games.studiohummingbird.skhema.properties.URL
import games.studiohummingbird.skhema.properties.UnitCode
import games.studiohummingbird.skhema.properties.UnitText
import games.studiohummingbird.skhema.properties.Value
import games.studiohummingbird.skhema.properties.ValueReference
import games.studiohummingbird.skhema.properties.VariableMeasured
import games.studiohummingbird.skhema.types.Observation
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass

@Serializable
data class SerializableObservation(
    override val marginOfError: MarginOfError? = null,
    override val measuredProperty: MeasuredProperty? = null,
    override val measurementDenominator: MeasurementDenominator? = null,
    override val measurementMethod: MeasurementMethod? = null,
    override val measurementQualifier: MeasurementQualifier? = null,
    override val measurementTechnique: MeasurementTechnique? = null,
    override val observationAbout: ObservationAbout? = null,
    override val observationDate: ObservationDate? = null,
    override val observationPeriod: ObservationPeriod? = null,
    override val variableMeasured: VariableMeasured? = null,
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
    override val url: URL? = null,
    override val additionalProperty: AdditionalProperty? = null,
    override val maxValue: MaxValue? = null,
    override val minValue: MinValue? = null,
    override val unitCode: UnitCode? = null,
    override val unitText: UnitText? = null,
    override val value: Value? = null,
    override val valueReference: ValueReference? = null
)
: Observation

fun PolymorphicModuleBuilder<Observation>.serializableObservation() {
    subclass(SerializableObservation::class)
}
