package org.github.unqui.model

class DrinksService (private val drinks: MutableList<Drink>, private val elements: MutableList<Element>) {

    private val idGenerator = IdGenerator()

    fun addElement(draftElement: DraftElement): Element {
        if (elements.any { it.name == draftElement.name }) throw DrinkException("Element already defined")
        val element = Element(idGenerator.getElementId(), draftElement.name, draftElement.abv)
        elements.add(element)
        return element
    }

    fun addDrink(draftDrink: DraftDrink): Drink {
        if (drinks.any { it.name == draftDrink.name }) throw DrinkException("Drink already defined")
        val drink = Drink(idGenerator.getDrinkId(), draftDrink.name, draftDrink.description, draftDrink.image, draftDrink.glass, draftDrink.category, draftDrink.ingredients, draftDrink.garnish, draftDrink.preparation)
        drinks.add(drink)
        return drink
    }

    fun modifyElement(elementId: String, draftElement: DraftElement) {
        val element = this.getElement(elementId)
        if (drinks.any { it.id != elementId && it.name == draftElement.name}) throw DrinkException("Element already defined")
        element.name = draftElement.name
        element.abv = draftElement.abv
    }

    fun search(elements: List<Element>): List<Drink> {
        return drinks.filter { drink ->
            drink.ingredients.map { it.element }.intersect(elements).isNotEmpty()
        }.sortedBy { drink ->
            drink.ingredients.size - drink.ingredients.map { it.element }.intersect(elements).size
        }
    }

    fun getElement(elementId: String): Element {
        return elements.find { it.id == elementId } ?: throw DrinkException("Element not found")
    }

    fun getAllElements(): List<Element> = elements.toList()

    fun getAllDrinks(): List<Drink> = drinks.toList()

    fun getElementByName(name: String): Element {
        return elements.find { it.name == name } ?: throw DrinkException("Element not found")
    }

}