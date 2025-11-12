/* Action.kt
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

interface Action
    : Thing
    , InteractionType
    , PotentialAction
{
    val actionProcess: ActionProcess?
    val actionStatus: ActionStatus?
    val agent: Agent?
    val endTime: EndTime?
    val error: Error?
    val instrument: Instrument?
    val location: Location?
    val `object`: Object?
    val participant: Participant?
    val provider: Provider?
    val result: Result?
    val startTime: StartTime?
    val target: games.studiohummingbird.skhema.properties.Target?
}
