/* SerializablePatient.kt
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

import games.studiohummingbird.skhema.properties.*
import games.studiohummingbird.skhema.types.Patient
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass

@Serializable
data class SerializablePatient(
    override val additionalName: AdditionalName? = null,
    override val address: Address? = null,
    override val affiliation: Affiliation? = null,
    override val agentInteractionStatistic: AgentInteractionStatistic? = null,
    override val alumniOf: AlumniOf? = null,
    override val award: Award? = null,
    override val birthDate: BirthDate? = null,
    override val birthPlace: BirthPlace? = null,
    override val brand: Brand? = null,
    override val callSign: CallSign? = null,
    override val children: Children? = null,
    override val colleague: Colleague? = null,
    override val contactPoint: ContactPoint? = null,
    override val deathDate: DeathDate? = null,
    override val deathPlace: DeathPlace? = null,
    override val duns: Duns? = null,
    override val email: Email? = null,
    override val familyName: FamilyName? = null,
    override val faxNumber: FaxNumber? = null,
    override val follows: Follows? = null,
    override val funder: Funder? = null,
    override val funding: Funding? = null,
    override val gender: Gender? = null,
    override val givenName: GivenName? = null,
    override val globalLocationNumber: GlobalLocationNumber? = null,
    override val hasCertification: HasCertification? = null,
    override val hasCredential: HasCredential? = null,
    override val hasOccupation: HasOccupation? = null,
    override val hasOfferCatalog: HasOfferCatalog? = null,
    override val hasPOS: HasPOS? = null,
    override val height: Height? = null,
    override val homeLocation: HomeLocation? = null,
    override val honorificPrefix: HonorificPrefix? = null,
    override val honorificSuffix: HonorificSuffix? = null,
    override val interactionStatistic: InteractionStatistic? = null,
    override val isicV4: IsicV4? = null,
    override val jobTitle: JobTitle? = null,
    override val knows: Knows? = null,
    override val knowsAbout: KnowsAbout? = null,
    override val knowsLanguage: KnowsLanguage? = null,
    override val makesOffer: MakesOffer? = null,
    override val memberOf: MemberOf? = null,
    override val naics: Naics? = null,
    override val nationality: Nationality? = null,
    override val netWorth: NetWorth? = null,
    override val owns: Owns? = null,
    override val parent: Parent? = null,
    override val performerIn: PerformerIn? = null,
    override val pronouns: Pronouns? = null,
    override val publishingPrinciples: PublishingPrinciples? = null,
    override val relatedTo: RelatedTo? = null,
    override val seeks: Seeks? = null,
    override val sibling: Sibling? = null,
    override val skills: Skills? = null,
    override val sponsor: Sponsor? = null,
    override val spouse: Spouse? = null,
    override val taxID: TaxID? = null,
    override val telephone: Telephone? = null,
    override val vatID: VatID? = null,
    override val weight: Weight? = null,
    override val workLocation: WorkLocation? = null,
    override val worksFor: WorksFor? = null,
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
    override val audienceType: AudienceType? = null,
    override val geographicArea: GeographicArea? = null,
    override val healthCondition: HealthCondition? = null,
    override val requiredGender: RequiredGender? = null,
    override val requiredMaxAge: RequiredMaxAge? = null,
    override val requiredMinAge: RequiredMinAge? = null,
    override val suggestedAge: SuggestedAge? = null,
    override val suggestedGender: SuggestedGender? = null,
    override val suggestedMaxAge: SuggestedMaxAge? = null,
    override val suggestedMeasurement: SuggestedMeasurement? = null,
    override val suggestedMinAge: SuggestedMinAge? = null
)
: Patient

fun PolymorphicModuleBuilder<Patient>.serializablePatient() {
    subclass(SerializablePatient::class)
}
