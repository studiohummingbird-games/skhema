/* MutableEducationalOccupationalCredential.kt
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
package games.studiohummingbird.skhema.types.mutable

import games.studiohummingbird.skhema.types.EducationalOccupationalCredential
import games.studiohummingbird.skhema.properties.CompetencyRequired
import games.studiohummingbird.skhema.properties.CredentialCategory
import games.studiohummingbird.skhema.properties.EducationalLevel
import games.studiohummingbird.skhema.properties.RecognizedBy
import games.studiohummingbird.skhema.properties.ValidFor
import games.studiohummingbird.skhema.properties.ValidIn

interface MutableEducationalOccupationalCredential
    : EducationalOccupationalCredential
    , MutableCreativeWork {
    override var competencyRequired: CompetencyRequired?
    override var credentialCategory: CredentialCategory?
    override var educationalLevel: EducationalLevel?
    override var recognizedBy: RecognizedBy?
    override var validFor: ValidFor?
    override var validIn: ValidIn?
}
