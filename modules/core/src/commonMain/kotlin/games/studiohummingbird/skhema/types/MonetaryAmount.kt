/* MonetaryAmount.kt
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

import games.studiohummingbird.skhema.properties.Currency
import games.studiohummingbird.skhema.properties.HasTierRequirement
import games.studiohummingbird.skhema.properties.MaxValue
import games.studiohummingbird.skhema.properties.MinValue
import games.studiohummingbird.skhema.properties.ValidFrom
import games.studiohummingbird.skhema.properties.ValidThrough
import games.studiohummingbird.skhema.properties.Value

interface MonetaryAmount
    : StructuredValue
    , HasTierRequirement {
    val currency: Currency?
    val maxValue: MaxValue?
    val minValue: MinValue?
    val validFrom: ValidFrom?
    val validThrough: ValidThrough?
    val value: Value?
}
