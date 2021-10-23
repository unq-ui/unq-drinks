package org.github.unqui.model

class IdGenerator() {
    var elementId = 0
    var drinkId = 0

    fun getElementId(): String {
        val id = elementId
        elementId += 1
        return "element_$id"
    }

    fun getDrinkId(): String {
        val id = drinkId
        drinkId += 1
        return "drink_$id"
    }
}