/* SerializableFindAction.kt
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
import games.studiohummingbird.skhema.types.FindAction
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass

@Serializable
data class SerializableFindAction(
    override val actionProcess: ActionProcess? = null,
    override val actionStatus: ActionStatus? = null,
    override val agent: Agent? = null,
    override val endTime: EndTime? = null,
    override val error: Error? = null,
    override val instrument: Instrument? = null,
    override val location: Location? = null,
    override val `object`: Object? = null,
    override val participant: Participant? = null,
    override val provider: Provider? = null,
    override val result: Result? = null,
    override val startTime: StartTime? = null,
    override val target: games.studiohummingbird.skhema.properties.Target? = null,
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
: FindAction

fun PolymorphicModuleBuilder<FindAction>.serializableFindAction() {
    subclass(SerializableFindAction::class)
}
