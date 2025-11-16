/* CreativeWork.kt
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

interface CreativeWork
: Thing
, AcquireLicensePage
, ActionableFeedbackPolicy
, Appearance
, Backstory
, CheatCode
, Citation
, CorrectionsPolicy
, Discusses
, DiversityPolicy
, Documentation
, EncodesCreativeWork
, EthicsPolicy
, ExampleOfWork
, FirstAppearance
, FundedItem
, GameTip
, HasPart
, IsBasedOn
, IsBasedOnUrl
, IsPartOf
, ItemOffered
, License
, Lyrics
, MainEntityOfPage
, Masthead
, MessageAttachment
, MissionCoveragePrioritiesPolicy
, NoBylinesPolicy
, OwnershipFundingInfo
, ParentItem
, PublishingPrinciples
, RecipeInstructions
, RecordedIn
, SdLicense
, SharedContent
, SoftwareHelp
, Step
, Steps
, SubjectOf
, TranslationOfWork
, UnnamedSourcesPolicy
, UsageInfo
, VerificationFactCheckingPolicy
, WorkExample
, WorkFeatured
, WorkPerformed
, WorkTranslation
{
    val about: About?
    val abstract: Abstract?
    val accessMode: AccessMode?
    val accessModeSufficient: AccessModeSufficient?
    val accessibilityAPI: AccessibilityAPI?
    val accessibilityControl: AccessibilityControl?
    val accessibilityFeature: AccessibilityFeature?
    val accessibilityHazard: AccessibilityHazard?
    val accessibilitySummary: AccessibilitySummary?
    val accountablePerson: AccountablePerson?
    val acquireLicensePage: AcquireLicensePage?
    val aggregateRating: AggregateRating?
    val alternativeHeadline: AlternativeHeadline?
    val archivedAt: ArchivedAt?
    val assesses: Assesses?
    val associatedMedia: AssociatedMedia?
    val audience: Audience?
    val audio: Audio?
    val author: Author?
    val award: Award?
    val character: Character?
    val citation: Citation?
    val comment: Comment?
    val commentCount: CommentCount?
    val conditionsOfAccess: ConditionsOfAccess?
    val contentLocation: ContentLocation?
    val contentRating: ContentRating?
    val contentReferenceTime: ContentReferenceTime?
    val contributor: Contributor?
    val copyrightHolder: CopyrightHolder?
    val copyrightNotice: CopyrightNotice?
    val copyrightYear: CopyrightYear?
    val correction: Correction?
    val countryOfOrigin: CountryOfOrigin?
    val creativeWorkStatus: CreativeWorkStatus?
    val creator: Creator?
    val creditText: CreditText?
    val dateCreated: DateCreated?
    val dateModified: DateModified?
    val datePublished: DatePublished?
    val digitalSourceType: DigitalSourceType?
    val discussionUrl: DiscussionUrl?
    val editEIDR: EditEIDR?
    val editor: Editor?
    val educationalAlignment: EducationalAlignment?
    val educationalLevel: EducationalLevel?
    val educationalUse: EducationalUse?
    val encoding: Encoding?
    val encodingFormat: EncodingFormat?
    val exampleOfWork: ExampleOfWork?
    val expires: Expires?
    val funder: Funder?
    val funding: Funding?
    val genre: Genre?
    val hasPart: HasPart?
    val headline: Headline?
    val inLanguage: InLanguage?
    val interactionStatistic: InteractionStatistic?
    val interactivityType: InteractivityType?
    val interpretedAsClaim: InterpretedAsClaim?
    val isAccessibleForFree: IsAccessibleForFree?
    val isBasedOn: IsBasedOn?
    val isFamilyFriendly: IsFamilyFriendly?
    val isPartOf: IsPartOf?
    val keywords: Keywords?
    val learningResourceType: LearningResourceType?
    val license: License?
    val locationCreated: LocationCreated?
    val mainEntity: MainEntity?
    val maintainer: Maintainer?
    val material: Material?
    val materialExtent: MaterialExtent?
    val mentions: Mentions?
    val offers: Offers?
    val pattern: Pattern?
    val position: Position?
    val producer: Producer?
    val provider: Provider?
    val publication: Publication?
    val publisher: Publisher?
    val publisherImprint: PublisherImprint?
    val publishingPrinciples: PublishingPrinciples?
    val recordedAt: RecordedAt?
    val releasedEvent: ReleasedEvent?
    val review: Review?
    val schemaVersion: SchemaVersion?
    val sdDatePublished: SdDatePublished?
    val sdLicense: SdLicense?
    val sdPublisher: SdPublisher?
    val size: Size?
    val sourceOrganization: SourceOrganization?
    val spatial: Spatial?
    val spatialCoverage: SpatialCoverage?
    val sponsor: Sponsor?
    val teaches: Teaches?
    val temporal: Temporal?
    val temporalCoverage: TemporalCoverage?
    val text: Text
    val thumbnail: Thumbnail?
    val thumbnailUrl: ThumbnailUrl?
    val timeRequired: TimeRequired?
    val translationOfWork: TranslationOfWork?
    val translator: Translator?
    val typicalAgeRange: TypicalAgeRange?
    val usageInfo: UsageInfo?
    val version: Version?
    val video: Video?
    val wordCount: WordCount?
    val workExample: WorkExample?
    val workTranslation: WorkTranslation?
}
