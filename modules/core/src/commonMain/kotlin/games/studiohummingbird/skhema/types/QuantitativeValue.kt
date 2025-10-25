/* QuantitativeValue.kt
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

import games.studiohummingbird.skhema.types.mutable.MutableQuantitativeValue
import games.studiohummingbird.skhema.properties.AdditionalProperty
import games.studiohummingbird.skhema.properties.CargoVolume
import games.studiohummingbird.skhema.properties.Description
import games.studiohummingbird.skhema.properties.FuelCapacity
import games.studiohummingbird.skhema.properties.Identifier
import games.studiohummingbird.skhema.properties.MaxValue
import games.studiohummingbird.skhema.properties.MembershipPointsEarned
import games.studiohummingbird.skhema.properties.MinValue
import games.studiohummingbird.skhema.properties.Name
import games.studiohummingbird.skhema.properties.PotentialAction
import games.studiohummingbird.skhema.properties.UnitCode
import games.studiohummingbird.skhema.properties.UnitText
import games.studiohummingbird.skhema.properties.Value

interface QuantitativeValue
    : StructuredValue
    , CargoVolume
    , FuelCapacity
    , MembershipPointsEarned {
    val additionalProperty: AdditionalProperty?
    val maxValue: MaxValue?
    val minValue: MinValue?
    val unitCode: UnitCode?
    val unitText: UnitText?
    val value: Value?
}

fun QuantitativeValue(block: MutableQuantitativeValue.() -> Unit): QuantitativeValue =
    object : MutableQuantitativeValue {
        override var additionalProperty: AdditionalProperty? = null
        override var maxValue: MaxValue? = null
        override var minValue: MinValue? = null
        override var unitCode: UnitCode? = null
        override var unitText: UnitText? = null
        override var value: Value? = null
        override var description: Description? = null
        override var identifier: Identifier? = null
        override var name: Name? = null
        override var potentialAction: PotentialAction? = null
    }.apply(block)
