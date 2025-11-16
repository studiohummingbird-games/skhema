/* CreateActionModule.kt
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
package games.studiohummingbird.skhema.types.serializable.modules

import games.studiohummingbird.skhema.types.CreateAction
import games.studiohummingbird.skhema.types.serializable.serializableCookAction
import games.studiohummingbird.skhema.types.serializable.serializableCreateAction
import games.studiohummingbird.skhema.types.serializable.serializableDrawAction
import games.studiohummingbird.skhema.types.serializable.serializableFilmAction
import games.studiohummingbird.skhema.types.serializable.serializablePaintAction
import games.studiohummingbird.skhema.types.serializable.serializablePhotographAction
import games.studiohummingbird.skhema.types.serializable.serializableWriteAction
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val CreateActionModule = SerializersModule {
    polymorphic(CreateAction::class) {
        serializableCreateAction()
        serializableCookAction()
        serializableDrawAction()
        serializableFilmAction()
        serializablePaintAction()
        serializablePhotographAction()
        serializableWriteAction()
    }
}
