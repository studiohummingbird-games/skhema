/* MemberProgramTier.kt
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

import games.studiohummingbird.skhema.types.mutable.MutableMemberProgramTier
import games.studiohummingbird.skhema.properties.Description
import games.studiohummingbird.skhema.properties.HasTierRequirement
import games.studiohummingbird.skhema.properties.HasTiers
import games.studiohummingbird.skhema.properties.Identifier
import games.studiohummingbird.skhema.properties.IsTierOf
import games.studiohummingbird.skhema.properties.MemberOf
import games.studiohummingbird.skhema.properties.Name
import games.studiohummingbird.skhema.properties.PotentialAction

interface MemberProgramTier
    : Intangible
    , HasTiers
    , MemberOf {
    val hasTierRequirement: HasTierRequirement?
    val isTierOf: IsTierOf?
}

fun MemberProgramTier(block: MutableMemberProgramTier.() -> Unit): MemberProgramTier =
    object : MutableMemberProgramTier {
        override var hasTierRequirement: HasTierRequirement? = null
        override var isTierOf: IsTierOf? = null
        override var description: Description? = null
        override var identifier: Identifier? = null
        override var name: Name? = null
        override var potentialAction: PotentialAction? = null
    }.apply(block)
