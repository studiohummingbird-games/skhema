/* ContactPoint.kt
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

import games.studiohummingbird.skhema.types.mutable.MutableContactPoint
import games.studiohummingbird.skhema.properties.Description
import games.studiohummingbird.skhema.properties.Email
import games.studiohummingbird.skhema.properties.Identifier
import games.studiohummingbird.skhema.properties.Name
import games.studiohummingbird.skhema.properties.PotentialAction

interface ContactPoint
    : StructuredValue {
    val email: Email?
}

fun ContactPoint(block: MutableContactPoint.() -> Unit): ContactPoint =
    object : MutableContactPoint {
        override var email: Email? = null
        override var description: Description? = null
        override var identifier: Identifier? = null
        override var name: Name? = null
        override var potentialAction: PotentialAction? = null
    }.apply(block)
