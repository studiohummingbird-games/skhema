/* Person.kt
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
import games.studiohummingbird.skhema.properties.Brand
import games.studiohummingbird.skhema.properties.ContactPoint

interface Person
    : Thing
    , AccountablePerson
    , AcquiredFrom
    , Actor
    , Actors
    , Agent
    , Alumni
    , Artist
    , Athlete
    , Attendee
    , Attendees
    , Author
    , AwayTeam
    , BccRecipient
    , BookingAgent
    , Borrower
    , Broker
    , Buyer
    , ByArtist
    , Candidate
    , CcRecipient
    , Character
    , Children
    , ClaimInterpreter
    , Coach
    , Colleague
    , Colleagues
    , Colorist
    , Competitor
    , Composer
    , Contributor
    , CopyrightHolder
    , Creator
    , CreditedTo
    , Customer
    , Director
    , Directors
    , Editor
    , Employee
    , Employees
    , Endorsee
    , Endorsers
    , Folowee
    , Follows
    , Founder
    , Founders
    , FundedItem
    , Funder
    , Grantee
    , HiringOrganization
    , HomeTeam
    , Illustrator
    , Inker
    , Instructor
    , Knows
    , Landlord
    , LegalRepresentative
    , LegislationCountersignedBy
    , LegislationPassedBy
    , LegislationResponsible
    , Lender
    , Letterer
    , Loser
    , Lyricist
    , Maintainer
    , Member
    , Members
    , Merchant
    , MusicBy
    , MusicGroupMember
    , OfferedBy
    , Opponent
    , Organizer
    , Parent
    , Parents
    , Participant
    , Penciler
    , Performer
    , Performers
    , Producer
    , Provider
    , PublishedBy
    , Publisher
    , ReadBy
    , Recipient
    , Referee
    , RelatedTo
    , ReviewedBy
    , SdPublisher
    , Seller
    , Sender
    , Sibling
    , Siblings
    , SpokenByCharacter
    , Sponsor
    , Spouse
    , ToRecipient
    , Translator
    , UnderName
    , Vendor
    , Winner
{
    val additionalName: AdditionalName?
    val address: Address?
    val affiliation: Affiliation?
    val agentInteractionStatistic: AgentInteractionStatistic?
    val alumniOf: AlumniOf?
    val award: Award?
    val birthDate: BirthDate?
    val birthPlace: BirthPlace?
    val brand: Brand?
    val callSign: CallSign?
    val children: Children?
    val colleague: Colleague?
    val contactPoint: ContactPoint?
    val deathDate: DeathDate?
    val deathPlace: DeathPlace?
    val duns: Duns?
    val email: Email?
    val familyName: FamilyName?
    val faxNumber: FaxNumber?
    val follows: Follows?
    val funder: Funder?
    val funding: Funding?
    val gender: Gender?
    val givenName: GivenName?
    val globalLocationNumber: GlobalLocationNumber?
    val hasCertification: HasCertification?
    val hasCredential: HasCredential?
    val hasOccupation: HasOccupation?
    val hasOfferCatalog: HasOfferCatalog?
    val hasPOS: HasPOS?
    val height: Height?
    val homeLocation: HomeLocation?
    val honorificPrefix: HonorificPrefix?
    val honorificSuffix: HonorificSuffix?
    val interactionStatistic: InteractionStatistic?
    val isicV4: IsicV4?
    val jobTitle: JobTitle?
    val knows: Knows?
    val knowsAbout: KnowsAbout?
    val knowsLanguage: KnowsLanguage?
    val makesOffer: MakesOffer?
    val memberOf: MemberOf?
    val naics: Naics?
    val nationality: Nationality?
    val netWorth: NetWorth?
    val owns: Owns?
    val parent: Parent?
    val performerIn: PerformerIn?
    val pronouns: Pronouns?
    val publishingPrinciples: PublishingPrinciples?
    val relatedTo: RelatedTo?
    val seeks: Seeks?
    val sibling: Sibling?
    val skills: Skills?
    val sponsor: Sponsor?
    val spouse: Spouse?
    val taxID: TaxID?
    val telephone: Telephone?
    val vatID: VatID?
    val weight: Weight?
    val workLocation: WorkLocation?
    val worksFor: WorksFor?
}
