package org.github.unqui.model

class Drink(
    val id: String,
    val name: String,
    val description: String,
    val image: String,
    val glass: String,
    val category: String,
    val ingredients: MutableList<Ingredient>,
    val garnish: String,
    val preparation: String,
)

class Element(val id: String, var name: String, var abv: Int)

class Ingredient(val amount: String, val element: Element)

class User(val id: String, val username: String, val password: String, val image: String)