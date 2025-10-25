/* MutableProgramMembership.kt
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
package games.studiohummingbird.skhema.types.mutable

import games.studiohummingbird.skhema.types.MemberProgram
import games.studiohummingbird.skhema.types.ProgramMembership
import games.studiohummingbird.skhema.properties.HostingOrganization
import games.studiohummingbird.skhema.properties.Member
import games.studiohummingbird.skhema.properties.MembershipNumber
import games.studiohummingbird.skhema.properties.MembershipPointsEarned
import games.studiohummingbird.skhema.properties.ProgramName

interface MutableProgramMembership : ProgramMembership {
    override var hostingOrganization: HostingOrganization?
    override var member: Member?
    override var membershipNumber: MembershipNumber?
    override var membershipPointsEarned: MembershipPointsEarned?
    override var program: MemberProgram?
    override var programName: ProgramName?
}
