/* Product.kt
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

import games.studiohummingbird.skhema.types.mutable.MutableProduct
import games.studiohummingbird.skhema.properties.Brand
import games.studiohummingbird.skhema.properties.Description
import games.studiohummingbird.skhema.properties.Identifier
import games.studiohummingbird.skhema.properties.Keywords
import games.studiohummingbird.skhema.properties.Name
import games.studiohummingbird.skhema.properties.PotentialAction
import games.studiohummingbird.skhema.properties.ProductionDate
import games.studiohummingbird.skhema.properties.PurchaseDate
import games.studiohummingbird.skhema.properties.Slogan

interface Product
    : Thing {
    val brand: Brand?
    val keywords: Keywords?
    val productionDate: ProductionDate?
    val purchaseDate: PurchaseDate?
    val slogan: Slogan?
}

fun Product(block: MutableProduct.() -> Unit): Product =
    object : MutableProduct {
        override var brand: Brand? = null
        override var keywords: Keywords? = null
        override var productionDate: ProductionDate? = null
        override var purchaseDate: PurchaseDate? = null
        override var slogan: Slogan? = null
        override var description: Description? = null
        override var identifier: Identifier? = null
        override var name: Name? = null
        override var potentialAction: PotentialAction? = null
    }.apply(block)
