/* SerializableCreativeWork.kt
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
import games.studiohummingbird.skhema.types.Audience
import games.studiohummingbird.skhema.types.CreativeWork
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass

@Serializable
data class SerializableCreativeWork(
    override val about: About? = null,
    override val abstract: Abstract? = null,
    override val accessMode: AccessMode? = null,
    override val accessModeSufficient: AccessModeSufficient? = null,
    override val accessibilityAPI: AccessibilityAPI? = null,
    override val accessibilityControl: AccessibilityControl? = null,
    override val accessibilityFeature: AccessibilityFeature? = null,
    override val accessibilityHazard: AccessibilityHazard? = null,
    override val accessibilitySummary: AccessibilitySummary? = null,
    override val accountablePerson: AccountablePerson? = null,
    override val acquireLicensePage: AcquireLicensePage? = null,
    override val aggregateRating: AggregateRating? = null,
    override val alternativeHeadline: AlternativeHeadline? = null,
    override val archivedAt: ArchivedAt? = null,
    override val assesses: Assesses? = null,
    override val associatedMedia: AssociatedMedia? = null,
    override val audience: Audience? = null,
    override val audio: Audio? = null,
    override val author: Author? = null,
    override val award: Award? = null,
    override val character: Character? = null,
    override val citation: Citation? = null,
    override val comment: Comment? = null,
    override val commentCount: CommentCount? = null,
    override val conditionsOfAccess: ConditionsOfAccess? = null,
    override val contentLocation: ContentLocation? = null,
    override val contentRating: ContentRating? = null,
    override val contentReferenceTime: ContentReferenceTime? = null,
    override val contributor: Contributor? = null,
    override val copyrightHolder: CopyrightHolder? = null,
    override val copyrightNotice: CopyrightNotice? = null,
    override val copyrightYear: CopyrightYear? = null,
    override val correction: Correction? = null,
    override val countryOfOrigin: CountryOfOrigin? = null,
    override val creativeWorkStatus: CreativeWorkStatus? = null,
    override val creator: Creator? = null,
    override val creditText: CreditText? = null,
    override val dateCreated: DateCreated? = null,
    override val dateModified: DateModified? = null,
    override val datePublished: DatePublished? = null,
    override val digitalSourceType: DigitalSourceType? = null,
    override val discussionUrl: DiscussionUrl? = null,
    override val editEIDR: EditEIDR? = null,
    override val editor: Editor? = null,
    override val educationalAlignment: EducationalAlignment? = null,
    override val educationalLevel: EducationalLevel? = null,
    override val educationalUse: EducationalUse? = null,
    override val encoding: Encoding? = null,
    override val encodingFormat: EncodingFormat? = null,
    override val exampleOfWork: ExampleOfWork? = null,
    override val expires: Expires? = null,
    override val funder: Funder? = null,
    override val funding: Funding? = null,
    override val genre: Genre? = null,
    override val hasPart: HasPart? = null,
    override val headline: Headline? = null,
    override val inLanguage: InLanguage? = null,
    override val interactionStatistic: InteractionStatistic? = null,
    override val interactivityType: InteractivityType? = null,
    override val interpretedAsClaim: InterpretedAsClaim? = null,
    override val isAccessibleForFree: IsAccessibleForFree? = null,
    override val isBasedOn: IsBasedOn? = null,
    override val isFamilyFriendly: IsFamilyFriendly? = null,
    override val isPartOf: IsPartOf? = null,
    override val keywords: Keywords? = null,
    override val learningResourceType: LearningResourceType? = null,
    override val license: License? = null,
    override val locationCreated: LocationCreated? = null,
    override val mainEntity: MainEntity? = null,
    override val maintainer: Maintainer? = null,
    override val material: Material? = null,
    override val materialExtent: MaterialExtent? = null,
    override val mentions: Mentions? = null,
    override val offers: Offers? = null,
    override val pattern: Pattern? = null,
    override val position: Position? = null,
    override val producer: Producer? = null,
    override val provider: Provider? = null,
    override val publication: Publication? = null,
    override val publisher: Publisher? = null,
    override val publisherImprint: PublisherImprint? = null,
    override val publishingPrinciples: PublishingPrinciples? = null,
    override val recordedAt: RecordedAt? = null,
    override val releasedEvent: ReleasedEvent? = null,
    override val review: Review? = null,
    override val schemaVersion: SchemaVersion? = null,
    override val sdDatePublished: SdDatePublished? = null,
    override val sdLicense: SdLicense? = null,
    override val sdPublisher: SdPublisher? = null,
    override val size: Size? = null,
    override val sourceOrganization: SourceOrganization? = null,
    override val spatial: Spatial? = null,
    override val spatialCoverage: SpatialCoverage? = null,
    override val sponsor: Sponsor? = null,
    override val teaches: Teaches? = null,
    override val temporal: Temporal? = null,
    override val temporalCoverage: TemporalCoverage? = null,
    override val text: Text,
    override val thumbnail: Thumbnail? = null,
    override val thumbnailUrl: ThumbnailUrl? = null,
    override val timeRequired: TimeRequired? = null,
    override val translationOfWork: TranslationOfWork? = null,
    override val translator: Translator? = null,
    override val typicalAgeRange: TypicalAgeRange? = null,
    override val usageInfo: UsageInfo? = null,
    override val version: Version? = null,
    override val video: Video? = null,
    override val wordCount: WordCount? = null,
    override val workExample: WorkExample? = null,
    override val workTranslation: WorkTranslation? = null,
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
: CreativeWork

fun PolymorphicModuleBuilder<CreativeWork>.serializableCreativeWork() {
    subclass(SerializableCreativeWork::class)
}
