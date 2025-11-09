/* QuantitativeValue.kt
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
import games.studiohummingbird.skhema.properties.Duration

interface QuantitativeValue
    : StructuredValue
    , AccelerationTime
    , ActivityDuration
    , ActivityFrequency
    , AdvanceBookingRequirement
    , AnnualPercentageRate
    , BillingDuration
    , BroadcastFrequencyValue
    , CargoVolume
    , DeliveryLeadTime
    , Depth
    , Duration
    , DurationOfWarranty
    , EligibleDuration
    , EligibleQuantity
    , EngineDisplacement
    , EnginePower
    , FloorSize
    , FuelCapacity
    , FuelConsumption
    , FuelEfficiency
    , HandlingTime
    , HasMeasurement
    , Height
    , IncentiveAmount
    , Intensity
    , InterestRate
    , InventoryLevel
    , LeaseLength
    , LoanTerm
    , MarginOfError
    , MaterialExtent
    , MembershipPointsEarned
    , MileageFromOdometer
    , MolecularWeight
    , MonoisotopicMolecularWeight
    , NumAdults
    , NumChildren
    , NumItems
    , NumberOfAccommodationUnits
    , NumberOfAvailableAccommodationUnits
    , NumberOfAxles
    , NumberOfBedrooms
    , NumberOfDoors
    , NumberOfEmployees
    , NumberOfForwardGears
    , NumberOfPlayers
    , NumberOfPreviousOwners
    , NumberOfRooms
    , Occupancy
    , OrderQuantity
    , PartySize
    , Payload
    , RecipeYield
    , ReferenceQuantity
    , Repetitions
    , RequiredQuantity
    , RestPeriods
    , RoofLoad
    , SeatingCapacity
    , Size
    , Speed
    , SuggestedAge
    , SuggestedMeasurement
    , TongueWeight
    , Torque
    , TrailerWeight
    , TransitTime
    , ValueReference
    , VehicleSeatingCapacity
    , Weight
    , WeightTotal
    , Wheelbase
    , Width
    , Workload
    , YearlyRevenue
    , YearsInOperation
    , Yield
{
    val additionalProperty: AdditionalProperty?
    val maxValue: MaxValue?
    val minValue: MinValue?
    val unitCode: UnitCode?
    val unitText: UnitText?
    val value: Value?
    val valueReference: ValueReference?
}
