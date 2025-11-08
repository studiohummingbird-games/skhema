# skhema - Kotlin Multiplatform library for schema.org types

## Design

### schema.org
[schema.org](https://schema.org) expresses their ontology in terms of
- Types
- Data Types
- Properties

Types form a hierarchy, with [Thing](https://schema.org/Thing) as the root
(like Any in Kotlin, or Object in Java/C#).
Types are made up of Properties.
Data Types are primitives, like [Text](https://schema.org/Text), or [Integer](https://schema.org/Integer).
Property values can be Types or Data Types, and are uniquely named.
Due to this unique characteristic of Properties, the set of values for a Property are the same across all Types that have that Property.
For example, [the slogan Property](https://schema.org/slogan) can appear on
[Brand](https://schema.org/Brand) and [Organization](https://schema.org/Organization) Types,
but in either Type, the only acceptable value is [Text](https://schema.org/Text).
As a negative example, you cannot have a Text `slogan` on a Brand,
and a [CreativeWork](https://schema.org/CreativeWork) `slogan` on an Organization.

### skhema - Set-based types
skhema models everything using Kotlin `interface`s, leaning a bit on Set theory.
For example, a [Boolean](https://schema.org/Boolean) can be either [True](https://schema.org/True) or [False](https://schema.org/False).
This means that the Set of values that a Boolean can be contains True and False,
and that True and False can be used where a Boolean is expected.
Types and Properties can change over time, and new ones can be introduced, and added into the set of values that are
acceptable on a Property.

Practically, this means that the values of Properties implement the Property interfaces.
Since Text values can be used as values on many Properties, the Text Data Type implements many Property interfaces.
```kotlin
interface Text
    : Address
    , AddressCountry
    , AddressLocality
    , AudienceType
    , CallSign
    , CompetencyRequired
    , CredentialCategory
    , Currency
// ...
```
This illustrates that a Text value can be used for the Address Property, CallSign Property, Current Property, etc.
If a new Property is introduced that can have values of the Text Type, we simply need to add that Property as an interface
on Text.
That way, Text "implements" that Property, meaning it can be used for that Property,
and is in the Set of expected values for that Property.

Properties are also `interface`s, and typically don't have any parent type.
```kotlin
interface Address
```

Properties can be added to Types simply by including them.
```kotlin
interface Place {
    val address: Address?
}
```

An example of this DSL for a Place could look like
```kotlin
val mustafar = Place {
    address = Text("Mustafar")
    // or
    address = PostalAddress {
        addressCountry = Text("...")
    }
}
```
- The [Place](https://schema.org/Place) Type has an [address](https://schema.org/address) Property
- The address Property can be a value from the `Address` set
- Text implements the `Address` interface, and is part of the set
- [PostalAddress](https://schema.org/PostalAddress) values are also part of the `Address` Property set

### Versioning
This project follows Semantic Versioning, with a metadata component which indicates the schema.org version.

## Why?
I want to standardize the fuck out of as much as possible. There is so much untapped potential in what already exists.
I want to push the boundaries of what is possible with what we already have.
I want people to have an intuitive understanding about the relationships between objects across as many domains as
possible, and be able to utilize those expectations to solve harder problems more quickly.

## How-to
### Add a new type
- Create the interface in :core
  - Add the supertype interface first
  - Add the properties for the type
  - Add the properties that the type can be after the supertypes
- Create a serializable data class in :serializable
- Create a subclass function under the data class
- Add the Type as a subclass to Thing (and other parent types)
- Create a module file in :serializable
- Include the module in the Types module

### Add a new property
- Create the interface in :core
- Add the property interface as a super type to the types it can be
- Create a module file in :serializable
- Include the module in the Properties module
