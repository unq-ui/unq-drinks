package org.github.unqui.model

class DraftElement(var name: String, var abv: Int)

class DraftDrink(
    var name: String,
    var description: String,
    var image: String,
    var glass: String,
    var category: String,
    var ingredients: MutableList<Ingredient>,
    var garnish: String,
    var preparation: String,
)