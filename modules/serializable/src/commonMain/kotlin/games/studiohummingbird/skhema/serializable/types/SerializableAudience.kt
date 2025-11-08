package games.studiohummingbird.skhema.serializable.types

import games.studiohummingbird.skhema.properties.*
import games.studiohummingbird.skhema.types.Audience
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass

data class SerializableAudience(
    override val audienceType: AudienceType? = null,
    override val geographicArea: GeographicArea? = null,
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
    override val url: URL?
)
: Audience

fun PolymorphicModuleBuilder<Audience>.serializableAudience() {
    subclass(SerializableAudience::class)
}
