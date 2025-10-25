/* Number.kt
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

import games.studiohummingbird.skhema.properties.MaxValue
import games.studiohummingbird.skhema.properties.MembershipPointsEarned
import games.studiohummingbird.skhema.properties.MinValue
import games.studiohummingbird.skhema.properties.Value
import kotlin.Boolean

interface Number
    : MaxValue
    , MembershipPointsEarned
    , MinValue
    , Value {
    fun toDouble(): Double
    fun toFloat(): kotlin.Float
    fun toLong(): Long
    fun toInt(): Int
    fun toShort(): Short
    fun toByte(): Byte
}

fun Number(number: Int): Number =
    object : kotlin.Number(), Number, Comparable<Int> {
        override fun toDouble(): Double = number.toDouble()

        override fun toFloat(): kotlin.Float = number.toFloat()

        override fun toLong(): Long = number.toLong()

        override fun toInt(): Int = number

        override fun toShort(): Short = number.toShort()

        override fun toByte(): Byte = number.toByte()

        override fun equals(other: Any?): Boolean =
            when (other) {
                is Int -> number == other
                else -> false
            }

        override fun compareTo(other: Int): Int =
            number.compareTo(other)
    }

fun Number(number: Double): Number =
    object : kotlin.Number(), Number, Comparable<Double> {
        override fun toDouble(): Double = number

        override fun toFloat(): kotlin.Float = number.toFloat()

        override fun toLong(): Long = number.toLong()

        override fun toInt(): Int  = number.toInt()

        override fun toShort(): Short = number.toInt().toShort()

        override fun toByte(): Byte = number.toInt().toByte()

        override fun equals(other: Any?): Boolean =
            when (other) {
                is Double -> number == other
                else -> false
            }

        override fun compareTo(other: Double): Int =
            number.compareTo(other)
    }
