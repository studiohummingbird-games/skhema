/* SerializableMolecularEntity.kt
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

import games.studiohummingbird.skhema.properties.*
import games.studiohummingbird.skhema.types.MolecularEntity
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass

@Serializable
data class SerializableMolecularEntity(
    override val chemicalRole: ChemicalRole? = null,
    override val inChI: InChI? = null,
    override val inChIKey: InChIKey? = null,
    override val iupacName: IupacName? = null,
    override val molecularFormula: MolecularFormula? = null,
    override val molecularWeight: MolecularWeight? = null,
    override val monoisotopicMolecularWeight: MonoisotopicMolecularWeight? = null,
    override val potentialUse: PotentialUse? = null,
    override val smiles: Smiles? = null,
    override val associatedDisease: AssociatedDisease? = null,
    override val bioChemInteraction: BioChemInteraction? = null,
    override val bioChemSimilarity: BioChemSimilarity? = null,
    override val biologicalRole: BiologicalRole? = null,
    override val funding: Funding? = null,
    override val hasBioChemEntityPart: HasBioChemEntityPart? = null,
    override val hasMolecularFunction: HasMolecularFunction? = null,
    override val hasRepresentation: HasRepresentation? = null,
    override val isEncodedByBioChemEntity: IsEncodedByBioChemEntity? = null,
    override val isInvolvedInBiologicalProcess: IsInvolvedInBiologicalProcess? = null,
    override val isLocatedInSubcellularLocation: IsLocatedInSubcellularLocation? = null,
    override val isPartOfBioChemEntity: IsPartOfBioChemEntity? = null,
    override val taxonomicRange: TaxonomicRange? = null,
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
: MolecularEntity

fun PolymorphicModuleBuilder<MolecularEntity>.serializableMolecularEntity() {
    subclass(SerializableMolecularEntity::class)
}
