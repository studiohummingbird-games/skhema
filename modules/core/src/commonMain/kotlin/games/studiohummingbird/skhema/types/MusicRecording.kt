/* MusicRecording.kt
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

import games.studiohummingbird.skhema.properties.ByArtist
import games.studiohummingbird.skhema.properties.InAlbum
import games.studiohummingbird.skhema.properties.InPlaylist
import games.studiohummingbird.skhema.properties.RecordingOf

interface MusicRecording
    : CreativeWork {
    val byArtist: ByArtist?
    val duration: Duration?
    val inAlbum: InAlbum?
    val inPlaylist: InPlaylist?
    val recordingOf: RecordingOf?
}
