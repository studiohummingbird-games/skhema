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

import games.studiohummingbird.skhema.properties.*
import games.studiohummingbird.skhema.types.mutable.MutableEducationalOccupationalCredential

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
        override var additionalType: AdditionalType? = null
        override var alternateName: AlternateName? = null
        override var description: Description? = null
        override var disambiguationDescription: DisambiguationDescription? = null
        override var identifier: Identifier? = null
        override var image: Image? = null
        override var mainEntityOfPage: MainEntityOfPage? = null
        override var name: Name? = null
        override var potentialAction: PotentialAction? = null
        override var sameAs: SameAs? = null
        override var subjectOf: SubjectOf? = null
        override var url: URL? = null
    }.apply(block)
