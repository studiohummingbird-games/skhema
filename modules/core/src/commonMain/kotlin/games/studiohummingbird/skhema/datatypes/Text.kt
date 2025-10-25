/* Text.kt
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
package games.studiohummingbird.skhema.datatypes

import games.studiohummingbird.skhema.properties.Address
import games.studiohummingbird.skhema.properties.AddressCountry
import games.studiohummingbird.skhema.properties.AddressLocality
import games.studiohummingbird.skhema.properties.AudienceType
import games.studiohummingbird.skhema.properties.CallSign
import games.studiohummingbird.skhema.properties.CompetencyRequired
import games.studiohummingbird.skhema.properties.CredentialCategory
import games.studiohummingbird.skhema.properties.Currency
import games.studiohummingbird.skhema.properties.Description
import games.studiohummingbird.skhema.properties.EducationalLevel
import games.studiohummingbird.skhema.properties.Email
import games.studiohummingbird.skhema.properties.HasTierRequirement
import games.studiohummingbird.skhema.properties.Identifier
import games.studiohummingbird.skhema.properties.ItemListElement
import games.studiohummingbird.skhema.properties.Keywords
import games.studiohummingbird.skhema.properties.MembershipNumber
import games.studiohummingbird.skhema.properties.Name
import games.studiohummingbird.skhema.properties.Position
import games.studiohummingbird.skhema.properties.PostalCode
import games.studiohummingbird.skhema.properties.ProgramName
import games.studiohummingbird.skhema.properties.Skills
import games.studiohummingbird.skhema.properties.Slogan
import games.studiohummingbird.skhema.properties.StreetAddress
import games.studiohummingbird.skhema.properties.UnitCode
import games.studiohummingbird.skhema.properties.UnitText
import games.studiohummingbird.skhema.properties.Value
import games.studiohummingbird.skhema.properties.VehicleIdentificationNumber
import kotlin.jvm.JvmInline

interface Text
    : Address
    , AddressCountry
    , AddressLocality
    , AudienceType
    , CallSign
    , CompetencyRequired
    , CredentialCategory
    , Currency
    , Description
    , EducationalLevel
    , Email
    , HasTierRequirement
    , Identifier
    , ItemListElement
    , Keywords
    , MembershipNumber
    , Name
    , Position
    , PostalCode
    , ProgramName
    , Skills
    , Slogan
    , StreetAddress
    , UnitCode
    , UnitText
    , Value
    , VehicleIdentificationNumber

@JvmInline
private value class TextString(val string: String) : Text {
    override fun toString(): String = string
}

fun Text(string: String): Text = TextString(string)
