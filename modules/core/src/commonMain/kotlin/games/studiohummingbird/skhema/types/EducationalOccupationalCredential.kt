/* EducationalOccupationalCredential.kt
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

import games.studiohummingbird.skhema.types.mutable.MutableEducationalOccupationalCredential
import games.studiohummingbird.skhema.properties.About
import games.studiohummingbird.skhema.properties.CompetencyRequired
import games.studiohummingbird.skhema.properties.CredentialCategory
import games.studiohummingbird.skhema.properties.Description
import games.studiohummingbird.skhema.properties.EducationalLevel
import games.studiohummingbird.skhema.properties.Identifier
import games.studiohummingbird.skhema.properties.Keywords
import games.studiohummingbird.skhema.properties.Name
import games.studiohummingbird.skhema.properties.PotentialAction
import games.studiohummingbird.skhema.properties.RecognizedBy
import games.studiohummingbird.skhema.properties.ValidFor
import games.studiohummingbird.skhema.properties.ValidIn

interface EducationalOccupationalCredential
    : CreativeWork {
    val competencyRequired: CompetencyRequired?
    val credentialCategory: CredentialCategory?
    val educationalLevel: EducationalLevel?
    val recognizedBy: RecognizedBy?
    val validFor: ValidFor?
    val validIn: ValidIn?
}

fun EducationalOccupationalCredential(block: MutableEducationalOccupationalCredential.() -> Unit): EducationalOccupationalCredential =
    object : MutableEducationalOccupationalCredential {
        override var competencyRequired: CompetencyRequired? = null
        override var credentialCategory: CredentialCategory? = null
        override var educationalLevel: EducationalLevel? = null
        override var recognizedBy: RecognizedBy? = null
        override var validFor: ValidFor? = null
        override var validIn: ValidIn? = null
        override var about: About? = null
        override var keywords: Keywords? = null
        override var description: Description? = null
        override var identifier: Identifier? = null
        override var name: Name? = null
        override var potentialAction: PotentialAction? = null
    }.apply(block)
